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

}
