package com.trsvax.shop;

import java.math.BigDecimal;
import java.util.List;

public interface Invoice {
	
	public String getFirstName();
	public void setFirstName(String firstName);
	
	public String getLastName();
	public void setLastName(String lastName);
	
	public String getEmail();
	public void setEmail(String email);
	
	public String getPhone();
	public void setPhone(String phone);
	
	public String getCurrency();
	public void setCurrency(String currency);
	
	public String getDescription();
	public void setDescription(String description);
	

	public Address getShippingAddress();
	
	public Integer getItemCount();
	public List<InvoiceItem> getItems();
	
	public BigDecimal getTaxRate();
	public void setTaxRate(BigDecimal taxRate);
	public BigDecimal getDiscount();
	public void setDiscount(BigDecimal discount);
	public BigDecimal getShipping();
	public void setShipping(BigDecimal shipping);
	
	public BigDecimal calculateItemTotal();
	public BigDecimal calculateSubtotal();
	public BigDecimal calculateTax();
	public BigDecimal calculateTotal();
	
	public PaymentMethod getPaymentMethod();
	public void setPaymentMethod(PaymentMethod paymentMethod);
	
	public Boolean getNewsLetter();
	public void setNewsLetter(Boolean newsLetter);
	

}
