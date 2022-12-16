package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import Pages.OthersDemoPage;

public class OthersDemoTest extends Base{
	OthersDemoPage othersDemoPageObj;
	
	@Test
	public void checkAndverifyDragAndDrop() {
		othersDemoPageObj = new OthersDemoPage(driver);
		othersDemoPageObj.verifyDragAndDrop();
	}
	
	@Test
	public void checkAndverifyMouseHover() {
		othersDemoPageObj = new OthersDemoPage(driver);
		othersDemoPageObj.verifyMouseHover();
	}
	@Test
	public void verifyTheRowCount() {
		othersDemoPageObj = new OthersDemoPage(driver);
		othersDemoPageObj.tableRowLocate();
	}
	@Test
	public void verifyTheTableCoumnCounts() {
		othersDemoPageObj = new OthersDemoPage(driver);
		othersDemoPageObj.tableColumnLocate();
	}

}
