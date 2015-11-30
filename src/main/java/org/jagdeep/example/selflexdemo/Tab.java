package org.jagdeep.example.selflexdemo;

import org.jagdeep.example.selflexdemo.app.config.SelFlexDemoAppConfig;

public class Tab extends SelFlexDemoAppConfig {

	private String TABS = "tabs";
	private String RADIO_1 = "Pink";
	private String RADIO_2 = "Cox";
	private String CHEDDAR = "Cheddar";
	private String BRIE = "Brie";
	
	private String OK = "OK";

	private String VEG_TAB_TEXT = "vegTabText";
	private String CHEESE_TAB_TEXT = "cheeseTabText";
	private String FRUIT_TAB_TEXT = "fruitTabText";
	
	public void selectTab(String tabName) {
		flexApp.call("doFlexClick", TABS, tabName);
	}

	public void selectPinkLady() {
		flexApp.call("doFlexClick", RADIO_1, "");
	}
	
	public String getPinkLadyText() {
		return flexApp.call("getFlexText", RADIO_1, "");
	}
	
	public void selectCoxOrangePippin() {
		flexApp.call("doFlexClick", RADIO_2, "");
	}
	
	public String getCoxOrangePippinText() {
		return flexApp.call("getFlexText", RADIO_2, "");
	}
	
	public void clickOk() {
		flexApp.call("doFlexClick", OK, "");
	}
	
	public void clickCheddar() {
		flexApp.call("doFlexClick", CHEDDAR , "");
	}
	
	public String getCheddarText() {
		return flexApp.call("getFlexText", CHEDDAR , "");
	}

	public String getBrieText() {
		return flexApp.call("getFlexText", BRIE , "");
	}
	
	public String getFruitTabText() {
		return flexApp.call("getFlexText", FRUIT_TAB_TEXT, "");
	}
	
	public String getVegTabText() {
		return flexApp.call("getFlexText", VEG_TAB_TEXT, "");
	}
	
	public String getCheeseTabText() {
		return flexApp.call("getFlexText", CHEESE_TAB_TEXT, "");
	}
	

}
