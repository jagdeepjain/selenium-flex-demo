package org.jagdeep.example.selflexdemo;

import org.jagdeep.example.selflexdemo.app.config.SelFlexDemoAppConfig;

public class PushButton extends SelFlexDemoAppConfig {

	private String PUSH_BUTTON = "button";
	private String PUSH_BUTTON_CLICK_TEXT = "buttonClicks";
	
	public void click() {
		flexApp.call("doFlexClick", PUSH_BUTTON, "");
	}

	public String getText() {
		return flexApp.call("getFlexText", PUSH_BUTTON_CLICK_TEXT, "");
	}
	


}
