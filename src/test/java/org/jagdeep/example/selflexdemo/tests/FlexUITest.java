package org.jagdeep.example.selflexdemo.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import org.jagdeep.example.selflexdemo.dataprovider.TestDataProvider;
import org.jagdeep.example.selflexdemo.test.config.TestConfig;

import org.jagdeep.example.ui.automation.util.Util;

public class FlexUITest extends TestConfig {

	private String expected;
	private String actual;

	@Test(groups = "text-input", dataProvider = "InputTextProvider", dataProviderClass = TestDataProvider.class)
	public void testTextInput(String number, String factor) throws Exception {
		Util.sleep(1000);
		expected = "The result is " + (Integer.valueOf(number) * Integer.valueOf(factor));
		textInput.setNumber(number);
		textInput.setFactor(factor);
		actual = textInput.getResults();
		assertEquals(expected, actual);
	}

	@Test(groups = "button")
	public void testPush() throws Exception {
		Util.sleep(1000);
		expected = "pushed 1 time";
		pushButton.click();
		actual = pushButton.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "checkbox")
	public void testCheckBoxChecked() throws Exception {
		Util.sleep(1000);
		expected = "checked";
		checkBox.checkBoxChecked();
		actual = checkBox.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "checkbox")
	public void testCheckBoxUnChecked() throws Exception {
		Util.sleep(1000);
		expected = "not checked";
		checkBox.checkBoxUnChecked();
		actual = checkBox.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "dropdown", dataProvider = "FruitsProvider", dataProviderClass = TestDataProvider.class)
	public void testSelectGrape(String fruit, String color) throws Exception {
		Util.sleep(1000);
		expected = color;
		dropDown.selectByLabel(fruit);
		actual = dropDown.getText();
		assertEquals(expected, actual);
	}

	@Test(groups = "date-picker")
	public void testDate() throws Exception {
		Util.sleep(1000);
		String expected = "you chose 1/12/2015";
		datePicker.selectDate("01/12/2015");
		actual = datePicker.getText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "grid")
	public void testGridLabel() throws Exception {
		Util.sleep(1000);
		String expected = "Choose more fruit";
		actual = dataGrid.getText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "tabs")
	public void testFruitTab() throws Exception {
		Util.sleep(1000);
		String expected = "fruit";
		tab.selectTab("Fruit");
		actual = tab.getFruitTabText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "tabs")
	public void testVeg() throws Exception {
		Util.sleep(1000);
		String expected = "veg";
		tab.selectTab("Veg");
		actual = tab.getVegTabText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "tabs")
	public void testCheese() throws Exception {
		Util.sleep(1000);
		String expected = "Choose cheese";
		tab.selectTab("Cheese");
		actual = tab.getCheeseTabText();
		assertEquals("" + expected, "" + actual);
	}

	@Test(groups = "tabs")
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

	@Test(groups = "tabs")
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
