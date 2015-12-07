package org.jagdeep.example.selflexdemo.app.config;

import java.util.concurrent.TimeUnit;

public class SelFlexDemoAppConfig implements IConfig {

	public void openFlexApp() {
		browser.get(URL);
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void closeFlexApp() {
		browser.quit();
	}

	public boolean setFocus(String widgetId) {
		return Boolean.parseBoolean(flexApp.call("doFlexSetFocus", widgetId));
	}

	public boolean isVisible(String widgetId) {
		return Boolean.parseBoolean(flexApp.call("getFlexVisible", widgetId, ""));
	}

	public boolean isEnable(String widgetId) {
		return Boolean.parseBoolean(flexApp.call("getFlexEnabled", widgetId, ""));
	}

	public boolean exists(String widgetId) {
		return Boolean.parseBoolean(flexApp.call("getFlexExists", widgetId, ""));

	}

}
