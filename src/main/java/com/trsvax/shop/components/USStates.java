package com.trsvax.shop.components;

import org.apache.tapestry5.Field;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;

public class USStates implements Field {

	@Property
	@Parameter
	private String value;
	
	@InjectComponent
	private Field state;
	
	private final String states = 	
	"AL=Alabama,"+
	"AK=Alaska,"+
	"AZ=Arizona,"+
	"AR=Arkansas,"+
	"CA=California,"+
	"CO=Colorado,"+
	"CT=Connecticut,"+
	"DE=Delaware,"+
	"FL=Florida,"+
	"GA=Georgia,"+
	"HI=Hawaii,"+
	"ID=Idaho,"+
	"IL=Illinois,"+
	"IN=Indiana,"+
	"IA=Iowa,"+
	"KS=Kansas,"+
	"KY=Kentucky,"+
	"LA=Louisiana,"+
	"ME=Maine,"+
	"MD=Maryland,"+
	"MA=Massachusetts,"+
	"MI=Michigan,"+
	"MN=Minnesota,"+
	"MS=Mississippi,"+
	"MO=Missouri,"+
	"MT=Montana,"+
	"NE=Nebraska,"+
	"NV=Nevada,"+
	"NH=New Hampshire,"+
	"NJ=New Jersey,"+
	"NM=New Mexico,"+
	"NY=New York,"+
	"NC=North Carolina,"+
	"ND=North Dakota,"+
	"OH=Ohio,"+
	"OK=Oklahoma,"+
	"OR=Oregon,"+
	"PA=Pennsylvania,"+
	"RI=Rhode Island,"+
	"SC=South Carolina,"+
	"SD=South Dakota,"+
	"TN=Tennessee,"+
	"TX=Texas,"+
	"UT=Utah,"+
	"VT=Vermont,"+
	"VA=Virginia,"+
	"WA=Washington,"+
	"WV=West Virginia,"+
	"WI=Wisconsin,"+
	"WY=Wyoming,"+
	"DC=Washington DC";

	
	public String getStates() {
		return states;
	}


	public String getClientId() {
		return state.getClientId();
	}


	public String getControlName() {
		return state.getControlName();
	}


	public String getLabel() {
		return state.getLabel();
	}


	public boolean isDisabled() {
		return state.isDisabled();
	}


	public boolean isRequired() {
		return state.isRequired();
	}

}
