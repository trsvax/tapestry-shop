package com.trsvax.shop.components.cart;

import org.apache.tapestry5.Asset;
import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Path;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.trsvax.shop.InvoiceItem;

public class CartItemView {
	
	@Parameter
	@Property
	private InvoiceItem item;
	
	@Parameter
	@Property
	private Integer index;
	
	@Parameter
	@Property
	private Asset template;
	
	@Inject
	@Path("CartItemTemplate.tml")
	private Asset defaultTemplate;
	
	@BeginRender
	void beginRender() {
		if ( template == null ) {
			template = defaultTemplate;
		}
	}
}
