package org.jagdeep.example.selflexdemo.test.config;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.jagdeep.example.selflexdemo.TextInput;

public class TestConfig {

	TextInput textInput = new TextInput();

	@BeforeTest(groups = { "test-input", "button", "checkbox", "dropdown", "date-picker", "grid", "tabs" })
	public void setUp() throws Exception {
		textInput.openFlexApp();
	}

	@AfterTest(groups = { "test-input", "button", "checkbox", "dropdown", "date-picker", "grid", "tabs" })
	public void tearDown() {
		textInput.closeFlexApp();
	}

}
