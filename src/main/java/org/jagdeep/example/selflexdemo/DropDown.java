package org.jagdeep.example.selflexdemo;

import org.jagdeep.example.selflexdemo.app.config.SelFlexDemoAppConfig;

public class DropDown extends SelFlexDemoAppConfig {

	private String DROP_DOWN = "combo";
	private String SELECTED_FRUIT = "comboQuote";
	
	public void selectByLabel(String label) {
		flexApp.call("doFlexSelectComboByLabel", DROP_DOWN, label);
	}

	public void selectByIndex(String index) {
		flexApp.call("doFlexSelectIndex", DROP_DOWN, index);
	}
	
	public void getSelectedIndex(String index) {
		flexApp.call("getFlexSelectionIndex", DROP_DOWN, index);
	}

	public String getText() {
		return flexApp.call("getFlexText", SELECTED_FRUIT, "");
	}
	


}
