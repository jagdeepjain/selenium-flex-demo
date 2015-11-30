package org.jagdeep.example.selflexdemo.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import org.jagdeep.example.selflexdemo.TextInput;
import org.jagdeep.example.selflexdemo.test.config.TestConfig;

public class TextInputTest extends TestConfig {

	TextInput textInput = new TextInput();
	
	private String expected;
	private String actual;
    
    @Test(groups = "text-input")
    public void testTextInput() throws Exception {
    	expected = "The result is 1";
    	textInput.setNumber("1");
    	textInput.setFactor("1");
    	actual = textInput.getResults();
    	assertEquals(expected, actual);
    }
    
   
}
