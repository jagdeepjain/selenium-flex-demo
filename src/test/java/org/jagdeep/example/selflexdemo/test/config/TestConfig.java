package org.jagdeep.example.selflexdemo.test.config;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.jagdeep.example.selflexdemo.TextInput;

public class TestConfig {

	TextInput textInput = new TextInput();
    
	@BeforeTest(groups = {"text-input"})
    public void setUp() throws Exception {
		textInput.openFlexApp();
    }
    
    @AfterTest(groups = {"text-input"})
    public void tearDown() {
    	textInput.closeFlexApp();
    }
   
}
