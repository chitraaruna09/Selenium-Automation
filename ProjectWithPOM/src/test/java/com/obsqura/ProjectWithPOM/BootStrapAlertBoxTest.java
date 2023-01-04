package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import Pages.BootStrapAlertBoxExamples;
import Pages.CommonHeaderMenusPage;

public class BootStrapAlertBoxTest extends Base{
		BootStrapAlertBoxExamples bootStrapAlertBoxExamplesObj;
		CommonHeaderMenusPage commonHeaderMenusPageObj;
		
	@Test
		public void checktheNormalSuccessAlertBox() {
			commonHeaderMenusPageObj = new CommonHeaderMenusPage(driver);
			commonHeaderMenusPageObj.locateCommonHeaderMenus("ALERTS AND MODALS");
			bootStrapAlertBoxExamplesObj = new BootStrapAlertBoxExamples(driver);
			bootStrapAlertBoxExamplesObj.verifyTheNormalSuccessAlertBox();
	}

}
