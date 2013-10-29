package com.trsvax.shop;

public interface PaymentSource<T extends PaymentMethod> {
	
	public Object pay(T payment, Invoice invoice);

}
