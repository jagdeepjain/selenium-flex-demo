package org.jagdeep.example.selflexdemo;

import org.jagdeep.example.selflexdemo.app.config.SelFlexDemoAppConfig;

public class TextInput extends SelFlexDemoAppConfig {

	private String THINK_OF_NUMBER = "num";
	private String FACTOR = "factor";
	private String RESULT = "result";
	
	public void setNumber(String number) {
		flexApp.call("doFlexType", THINK_OF_NUMBER, number);
	}

	public void setFactor(String multiplyer) {
		flexApp.call("doFlexType", FACTOR, multiplyer);
	}

	public String getResults() {
		return flexApp.call("getFlexText", RESULT, "");
	}
	


}
