package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.SelectInputPage;

public class SelectInputPageTest extends Base{
	SelectInputPage selectInputPageObj;
	
	@Test (groups = {"regression"})
	public void selectColorAndVerifySelectMultipleInputColor() throws IOException {
		SelectInputPage selectInputPageObj = new SelectInputPage(driver);
		selectInputPageObj.verifySelectMultipleInputColor();
	}
	
	@Test(groups = {"smoke"})
	public void selectColorAndVerifySelectSingleInputColor() throws IOException {
		SelectInputPage selectInputPageObj = new SelectInputPage(driver);
		selectInputPageObj.verifySelectInputPage();
	}
	
}
