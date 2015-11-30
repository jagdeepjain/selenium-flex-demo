package org.jagdeep.example.selflexdemo;

import org.jagdeep.example.selflexdemo.app.config.SelFlexDemoAppConfig;

public class DatePicker extends SelFlexDemoAppConfig {

	private String DATE_PICKER = "date";
	private String DATE_SELECTED = "dateLabel";
	
	public void selectDate(String date) {
		flexApp.call("doFlexDate", DATE_PICKER, date);
	}
	
	public String getText() {
		return flexApp.call("getFlexText", DATE_SELECTED, "");
	}
	


}
