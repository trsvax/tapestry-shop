package com.trsvax.shop;


public interface PaymentMethod {
	
	static final String BILLING = "billing";
	static final String SHIPPING = "shipping";
	static final String PAYMENT = "payment";
	static final String REVIEW = "review";
	static final String AUTHORIZE = "authorize";
	static final String APPROVED = "approved";
	static final String PAID = "paid";

	
	public boolean haveBillingInformation();
	public boolean haveShippingInformation();
	public boolean havePaymentInformation();
	
	public void recievedBillingInformation();
	public void recievedShippingInformation();
	public void recievedPaymentInformation();
		
	
	
	public String getState();
	public void setState(String state);
	public boolean isState(String state);
	
	public String getTransactionID();
	public void setTransactionID(String transactionID);
	
	public String getError();
	public void setError(String error);
	public boolean hasError();
}
