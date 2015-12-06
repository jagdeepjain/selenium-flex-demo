package org.jagdeep.example.selflexdemo.dataprovider;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name = "InputTextProvider")
	public static Object[][] getDataFromInputTextDataProvider() {
		return new Object[][] {
				{ "1", "1" },
				{ "1", "0" },
				{ "0", "1" },
				{ "-1", "1" },
				{ "-1", "-1" }
		};
	}
	
	@DataProvider(name = "FruitsProvider")
	public static Object[][] getDataFromFruitDataProvider() {
		return new Object[][] {
				{"grape", "grapes are purple"},
				{"banana", "bananas are yellow" },
				{"apple", "apples are green"}
		};
	}
	
}
