package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.FormSubmitDataProvider;
import Pages.SideNavigationMenus;
import utilities.DataProviderUtility;

public class FormSubmitDataProviderTest extends Base{
	SideNavigationMenus sideNavigationMenusObj;
	FormSubmitDataProvider formSubmitDataProviderObj;
		
	@Test(dataProvider="DataProvider FormData",dataProviderClass=DataProviderUtility.class)
	public void checkAndVerifyTheFormSubmitWithDataProvider(String firstName, String lastName, String userName, String city, String state, String zip) throws IOException {
		sideNavigationMenusObj = new SideNavigationMenus(driver);
		sideNavigationMenusObj.navigationMenuClick("Form Submit");
		formSubmitDataProviderObj = new FormSubmitDataProvider(driver);
		formSubmitDataProviderObj.verifyTheFormSubmitByDataProvider(firstName,lastName,userName,city,state,zip);
	}

}
