package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import Pages.SimpleFormDemoPageFactory;

public class SimpleFormDemoPageFactoryTest extends Base{
	SimpleFormDemoPageFactory SimpleFormDemoPageFactoryObj;
	
	@Test
	public void enterMessageAndVerifySingleInputField() {
		SimpleFormDemoPageFactoryObj = new SimpleFormDemoPageFactory(driver);
		SimpleFormDemoPageFactoryObj.verifySingleInputField();
	}

}
