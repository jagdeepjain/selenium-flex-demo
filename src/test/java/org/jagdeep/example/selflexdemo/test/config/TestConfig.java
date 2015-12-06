package org.jagdeep.example.selflexdemo.test.config;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.jagdeep.example.selflexdemo.CheckBox;
import org.jagdeep.example.selflexdemo.DataGrid;
import org.jagdeep.example.selflexdemo.DatePicker;
import org.jagdeep.example.selflexdemo.DropDown;
import org.jagdeep.example.selflexdemo.PushButton;
import org.jagdeep.example.selflexdemo.Tab;
import org.jagdeep.example.selflexdemo.TextInput;

public class TestConfig {

	protected TextInput textInput = new TextInput();
	protected PushButton pushButton = new PushButton();
	protected CheckBox checkBox = new CheckBox();
	protected DropDown dropDown = new DropDown();
	protected DatePicker datePicker = new DatePicker();
	protected DataGrid dataGrid = new DataGrid();
	protected Tab tab = new Tab();

	@BeforeTest(groups = { "test-input", "button", "checkbox", "dropdown", "date-picker", "grid", "tabs" })
	public void setUp() throws Exception {
		textInput.openFlexApp();
	}

	@AfterTest(groups = { "test-input", "button", "checkbox", "dropdown", "date-picker", "grid", "tabs" })
	public void tearDown() {
		textInput.closeFlexApp();
	}

}
