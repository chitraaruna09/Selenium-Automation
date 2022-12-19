package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.FormSubmitParameterPage;
import Pages.SideNavigationMenus;

public class FormSubmitParameterTest extends Base{
	
	FormSubmitParameterPage formSubmitParameterPageObj;
	SideNavigationMenus sideNavigationMenusObj;
	
	@Test
	@Parameters({"firstName","lastName","userName","city","state","zip"})
	public void checkAndVerifyTheFormSubmit(String firstName, String lastName, String userName, String city, String state, String zip) throws IOException {
		sideNavigationMenusObj = new SideNavigationMenus(driver);
		sideNavigationMenusObj.navigationMenuClick("Form Submit");
		formSubmitParameterPageObj = new FormSubmitParameterPage(driver);
		formSubmitParameterPageObj.verifyTheFormSubmit(firstName,lastName,userName,city,state,zip);
	}
}
