package com.trsvax.shop.components;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.tapestry5.Field;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;

public class Year implements Field {
	
	@Property
	@Parameter
	private String value;
	
	@Property
	private Integer max;
	
	@Property
	private String years;
	
	@InjectComponent
	private Field year;
	
	@SetupRender
	void setupRender() {
		Integer year =  new GregorianCalendar().get(Calendar.YEAR);
		Integer maxYear = max == null ? year + 10 : max;
		years = "";
		for ( ; year <= maxYear; year++ ) {
			years += String.format("%d,", year);
		}
	}

	public String getControlName() {
		return year.getControlName();
	}

	public String getClientId() {
		return year.getClientId();
	}

	public String getLabel() {
		return year.getLabel();
	}

	public boolean isDisabled() {
		return year.isDisabled();
	}

	public boolean isRequired() {
		return year.isRequired();
	}

}
