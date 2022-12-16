package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import Pages.CommonHeaderMenusPage;

public class CommonHeaderMenusTest extends Base{

	CommonHeaderMenusPage commonHeaderMenusPageObj;
	
	@Test
	public void checkAndVerifyCommonHeaderMenus() {
		commonHeaderMenusPageObj = new CommonHeaderMenusPage(driver);
		commonHeaderMenusPageObj.locateCommonHeaderMenus("Date Pickers");
		
	}
	
}
