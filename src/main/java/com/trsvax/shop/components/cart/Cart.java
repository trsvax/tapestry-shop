package com.trsvax.shop.components.cart;

import java.math.BigDecimal;

import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.annotations.Cached;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.LoopFormState;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;
import org.slf4j.Logger;

import com.trsvax.shop.Invoice;
import com.trsvax.shop.InvoiceItem;
import com.trsvax.shop.PaymentMethod;
import com.trsvax.shop.PaymentSource;
import com.trsvax.shop.PromoService;

public class Cart {
	
	@Property
	@Parameter
	private Invoice invoice;
	
	@Property
	private PaymentMethod payment;
		
	@Property
	private InvoiceItem item;
	
	@Property
	private LoopFormState formState;
	
	@Property
	private int index;
	
	@Property
	private String promoCode;
	
	@Property
	@Persist
	private String promoMessage;
	
	@Inject
	private Logger logger;
	
	@Inject
	private PaymentSource<PaymentMethod> paymentSource;
		
	@Inject
	private JavaScriptSupport javaScriptSupport;
	
	@Inject
	private PromoService promoService;
	
	private boolean updating;
	
	@BeginRender
	void beginRender() {
		formState = LoopFormState.ITERATION;
		//javaScriptSupport.require("studio/update").with(".cartQuantity");
		javaScriptSupport.require("studio/update").with(".promoCode");
	}
	
	void onDelete(int index) {
		logger.info("delete {}",index);
		invoice.getItems().remove(index);
	}
	
	void onValidateCode() {
		logger.info("validate {}",promoCode);
		promoMessage = promoService.applyPromo(promoCode,invoice);
		updating = true;
	}
	
	void onUpdate() {
		updating = true;
	}

	Object onSuccess() {
		if ( updating ) {
			return null;
		}
		return paymentSource.pay(payment,invoice);
	}
	
	public String getItemCount() {

		if ( invoice.getItemCount() == 1 ) {
			return "1 item";
		}
		return String.format("(%d Items)",invoice.getItemCount());
	}
	
	@Cached
	public BigDecimal getSubtotal() {
		return invoice.calculateItemTotal();
	}

}
