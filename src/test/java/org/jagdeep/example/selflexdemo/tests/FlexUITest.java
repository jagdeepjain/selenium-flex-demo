package org.jagdeep.example.selflexdemo.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import org.jagdeep.example.selflexdemo.CheckBox;
import org.jagdeep.example.selflexdemo.PushButton;
import org.jagdeep.example.selflexdemo.Tab;
import org.jagdeep.example.selflexdemo.TextInput;
import org.jagdeep.example.selflexdemo.DropDown;
import org.jagdeep.example.selflexdemo.DatePicker;
import org.jagdeep.example.selflexdemo.DataGrid;

import org.jagdeep.example.selflexdemo.test.config.TestConfig;
import org.jagdeep.example.ui.automation.util.Util;

public class FlexUITest extends TestConfig {

	TextInput textInput = new TextInput();
	PushButton pushButton = new PushButton();
	CheckBox checkBox = new CheckBox();
	DropDown dropDown = new DropDown();
	DatePicker datePicker = new DatePicker();
	DataGrid dataGrid = new DataGrid();
	Tab tab = new Tab();

	private String expected;
	private String actual;

	@Test(groups = "flex-ui-test")
	public void testTextInput() throws Exception {
		Util.sleep(1000);
		expected = "The result is 1";
		textInput.setNumber("1");
		textInput.setFactor("1");
		actual = textInput.getResults();
		assertEquals(expected, actual);
	}

	@Test(groups = "flex-ui-test")
	public void testPush() throws Exception {
		Util.sleep(1000);
		expected = "pushed 1 time";
		pushButton.click();
		actual = pushButton.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "flex-ui-test")
	public void testCheckBoxChecked() throws Exception {
		Util.sleep(1000);
		expected = "checked";
		checkBox.checkBoxChecked();
		actual = checkBox.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "flex-ui-test")
	public void testCheckBoxUnChecked() throws Exception {
		Util.sleep(1000);
		expected = "not checked";
		checkBox.checkBoxUnChecked();
		actual = checkBox.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "flex-ui-test")
	public void testSelectGrape() throws Exception {
		Util.sleep(1000);
		expected = "grapes are purple";
		dropDown.selectByLabel("grape");
		actual = dropDown.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "flex-ui-test")
	public void testSelectBanana() throws Exception {
		Util.sleep(1000);
		expected = "bananas are yellow";
		dropDown.selectByLabel("banana");
		actual = dropDown.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "flex-ui-test")
	public void testSelectApple() throws Exception {
		Util.sleep(1000);
		expected = "apples are green";
		dropDown.selectByLabel("apple");
		actual = dropDown.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "flex-ui-test")
	public void testDate() throws Exception {
		Util.sleep(1000);
		String expected = "you chose 1/12/2015";
		datePicker.selectDate("01/12/2015");
		actual = datePicker.getText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "flex-ui-test")
	public void testGridLabel() throws Exception {
		Util.sleep(1000);
		String expected = "Choose more fruit";
		actual = dataGrid.getText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "flex-ui-test")
	public void testFruitTab() throws Exception {
		Util.sleep(1000);
		String expected = "fruit";
		tab.selectTab("Fruit");
		actual = tab.getFruitTabText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "flex-ui-test")
	public void testVeg() throws Exception {
		Util.sleep(1000);
		String expected = "veg";
		tab.selectTab("Veg");
		actual = tab.getVegTabText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "flex-ui-test")
	public void testCheese() throws Exception {
		Util.sleep(1000);
		String expected = "Choose cheese";
		tab.selectTab("Cheese");
		actual = tab.getCheeseTabText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "flex-ui-test")
	public void testPinkLadyOption() throws Exception {
		Util.sleep(1000);
		String expected = "Pink Lady";
		tab.selectTab("Fruit");
		Util.sleep(1000);
		tab.selectPinkLady();
		Util.sleep(1000);
		tab.clickOk();
		actual = tab.getPinkLadyText();
		Util.sleep(1000);
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "flex-ui-test")
	public void testCoxOption() throws Exception {
		Util.sleep(1000);
		String expected = "Cox's Orange Pippin";
		tab.selectTab("Fruit");
		Util.sleep(1000);
		tab.selectCoxOrangePippin();
		Util.sleep(1000);
		tab.clickOk();
		actual = tab.getCoxOrangePippinText();
		Util.sleep(1000);
		assertEquals("" + expected, "" + actual);
	}

}
