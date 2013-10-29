package com.trsvax.shop.utils;

import com.trsvax.shop.PaymentMethod;

public class PaymentState {
	private final PaymentMethod paymentMethod;
	
	public PaymentState(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	
	public boolean isBillingInformation() {
		return PaymentMethod.BILLING.equals(paymentMethod.getState());
	}
	
	public boolean isShippingInformation() {
		return PaymentMethod.SHIPPING.equals(paymentMethod.getState());
	}
	
	public boolean isPaymentInformation() {
		return PaymentMethod.PAYMENT.equals(paymentMethod.getState());
	}

	public boolean isReviewInformation() {
		return PaymentMethod.REVIEW.equals(paymentMethod.getState());
	}
	
	
	
	public boolean isHaveBillingInformation() {
		return paymentMethod.haveBillingInformation();
	}
	
	public boolean isHaveShippingInformation() {
		return paymentMethod.haveShippingInformation();
	}
	
	public boolean isHavePaymentInformation() {
		return paymentMethod.havePaymentInformation();
	}

}
