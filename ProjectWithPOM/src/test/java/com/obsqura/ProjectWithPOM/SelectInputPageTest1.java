package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.SelectInputPage;
import Pages.SelectInputPage1;

public class SelectInputPageTest1 extends Base{
	SelectInputPage1 selectInputPage1Obj;
	@Test(enabled=false)
	public void selectColorAndVerifySelectMultipleInputColor() {
		SelectInputPage1 selectInputPage1Obj = new SelectInputPage1(driver);
		selectInputPage1Obj.verifySelectMultipleInputColor();
	}
	@Test
	public void selectColorAndVerifySelectSingleInputColor() throws IOException {
		SelectInputPage selectInputPageObj = new SelectInputPage(driver);
		selectInputPageObj.verifySelectInputPage();
	}
}
