package com.trsvax.shop.components;

import org.apache.tapestry5.Field;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

public class Month implements Field {
	
	@Property
	@Parameter
	private String value;
	
	@InjectComponent
	private Field month;
	
	private final String months = 
			"01=01 January,"+
			"02=02 Febuary,"+
			"03=03 March,"+
			"04=04 April,"+
			"05=05 May,"+
			"06=06 June,"+
			"07=07 July,"+
			"08=08 August,"+
			"09=09 September,"+
			"10=10 October,"+
			"11=11 November,"+
			"12=12 December";
	
	
	
	public String getMonths() {
		return months;
	}

	public String getControlName() {
		return month.getControlName();
	}

	public String getClientId() {
		return month.getClientId();
	}

	public String getLabel() {
		return month.getLabel();
	}

	public boolean isDisabled() {
		return month.isDisabled();
	}

	public boolean isRequired() {
		return month.isRequired();
	}
	

}
