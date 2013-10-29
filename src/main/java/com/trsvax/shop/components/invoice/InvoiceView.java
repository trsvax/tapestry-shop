package com.trsvax.shop.components.invoice;

import java.math.BigDecimal;

import org.apache.tapestry5.annotations.Cached;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

import com.trsvax.shop.Invoice;
import com.trsvax.shop.InvoiceItem;

public class InvoiceView {
	
	@Property
	@Parameter
	private Invoice invoice;
	
	@Property
	private InvoiceItem item;
	
	@Property
	private int index;
	
	
	@Cached
	public BigDecimal getSubtotal() {
		return invoice.calculateItemTotal();
	}
	
	@Cached
	public BigDecimal getDiscount() {
		return invoice.getDiscount();
	}
	
	@Cached
	public BigDecimal getTax() {
		return invoice.calculateTax();
	}
	
	@Cached
	public BigDecimal getTotal() {
		return invoice.calculateTotal();
	}

}
