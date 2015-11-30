package org.jagdeep.example.selflexdemo;

import org.jagdeep.example.selflexdemo.app.config.SelFlexDemoAppConfig;

public class DataGrid extends SelFlexDemoAppConfig {

	private String DATA_GRID = "dataGrid";
	private String DATA_GRID_TEXT = "dataGridLabel";
	
	public String getTotalGrids() {
		return flexApp.call("getFlexDataGridRowCount", DATA_GRID);
		 
	}

	public String getDataGridValue() {
		return flexApp.call("getFlexDataGridCell", DATA_GRID, "0", "0");
		
	}
	
	public String getText() {
		return flexApp.call("getFlexText", DATA_GRID_TEXT, "");
	}
	


}
