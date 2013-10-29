package com.trsvax.shop;

import java.math.BigDecimal;

public interface InvoiceItem {
	
	public String getDescription();
	public void setDescription(String description);
	
	public BigDecimal getPrice();
	public void setPrice(BigDecimal price);
	
	public Integer getQuantity();
	public void setQuantity(Integer quantity);
	
	public String getThumbnailURL();

}
