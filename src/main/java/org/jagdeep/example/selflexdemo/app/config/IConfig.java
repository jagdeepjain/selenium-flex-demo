package org.jagdeep.example.selflexdemo.app.config;

import org.jagdeep.example.selenium.flex.driver.FlexWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface IConfig {
	String URL = "http://localhost:8080/selfexdemo/selFlexDemo.html";
	WebDriver browser = new FirefoxDriver();
	String flexObject = "selFlexDemo";
	FlexWebDriver flexApp = new FlexWebDriver(browser, flexObject);
	
	void openFlexApp();
	
	void closeFlexApp();
	
	boolean setFocus(String widgetId);
	
	boolean isVisible(String widgetId);
	
	boolean isEnable(String widgetId);

	boolean exists(String widgetId);
}
