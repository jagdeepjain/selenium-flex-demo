package org.jagdeep.example.selflexdemo;

import org.jagdeep.example.selflexdemo.app.config.SelFlexDemoAppConfig;

public class CheckBox extends SelFlexDemoAppConfig {

	private String CHECK_BOX = "checkBox";
	private String CHECK_BOX_TEXT = "checkBoxLabel";
	
	public void checkBoxChecked() {
		flexApp.call("doFlexCheckBox", CHECK_BOX, "checked");
	}

	public void checkBoxUnChecked() {
		flexApp.call("doFlexCheckBox", CHECK_BOX, "unchecked");
	}
	
	public String getText() {
		return flexApp.call("getFlexText", CHECK_BOX_TEXT, "");
	}
	


}
