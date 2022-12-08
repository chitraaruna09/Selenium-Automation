package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import Pages.SimpleFormDemoPage;

public class SimpleFormTest extends Base{
	SimpleFormDemoPage simpleFormDemoPageObj; //Page class objection should given globally
	
	@Test
	public void enterMessageAndVerifySingleInputField() throws InterruptedException {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifySingleInputField();
	}
	@Test
	public void enterMessageAndVerifyTwoInputField() {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifyTwoInputFields();
	}
	
	@Test
	public void checkAndVerifyTitleAndUrl() {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifyTitleAndUrl();
	}

	@Test
	public void checkAndverifyDragAndDrop() {
		simpleFormDemoPageObj = new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifyDragAndDrop();
		
	}
}
