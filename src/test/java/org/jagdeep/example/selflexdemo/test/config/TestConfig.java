package org.jagdeep.example.selflexdemo.test.config;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.jagdeep.example.selflexdemo.TextInput;

public class TestConfig {

	TextInput textInput = new TextInput();
    
	@BeforeTest(groups = "flex-ui-test")
    public void setUp() throws Exception {
		textInput.openFlexApp();
    }
    
    @AfterTest(groups = "flex-ui-test")
    public void tearDown() {
    	textInput.closeFlexApp();
    }
   
}
