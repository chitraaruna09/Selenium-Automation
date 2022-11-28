package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import Pages.SelectInputPage;
import Pages.SelectInputPage1;

public class SelectInputPageTest1 extends Base{
	SelectInputPage1 selectInputPage1Obj;
	@Test
	public void selectColorAndVerifySelectMultipleInputColor() {
		SelectInputPage1 selectInputPage1Obj = new SelectInputPage1(driver);
		selectInputPage1Obj.verifySelectInputPage();
		selectInputPage1Obj.verifySelectMultipleInputColor();
	}
}
