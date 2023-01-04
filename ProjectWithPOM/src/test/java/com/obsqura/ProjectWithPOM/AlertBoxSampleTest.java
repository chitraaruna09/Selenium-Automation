package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import Pages.AlertBoxSample;
import Pages.CommonHeaderMenusPage;
import Pages.SideNavigationMenus;

@Test
public class AlertBoxSampleTest extends Base{
	CommonHeaderMenusPage commonHeaderMenusPageObj;
	SideNavigationMenus sideNavigationMenusObj;
	AlertBoxSample alertBoxSampleObj;

	public void verifyAlertBoxBtnOKClick() {
		commonHeaderMenusPageObj = new CommonHeaderMenusPage(driver);
		commonHeaderMenusPageObj.locateCommonHeaderMenus("ALERTS AND MODALS");
		sideNavigationMenusObj = new SideNavigationMenus(driver);
		sideNavigationMenusObj.navigationMenuClick("Javascript Alert");
		alertBoxSampleObj = new AlertBoxSample(driver);
		alertBoxSampleObj.verifyTheSimpleAlertBoxButtonAccept();
	}
	@Test
	public void verifyAlertBoxGetText() {
		commonHeaderMenusPageObj = new CommonHeaderMenusPage(driver);
		commonHeaderMenusPageObj.locateCommonHeaderMenus("ALERTS AND MODALS");
		sideNavigationMenusObj = new SideNavigationMenus(driver);
		sideNavigationMenusObj.navigationMenuClick("Javascript Alert");
		alertBoxSampleObj = new AlertBoxSample(driver);
		alertBoxSampleObj.verifyAlertBoxText();
	}
	@Test
	public void verifyAlertBoxBtnCancelClick() {
		commonHeaderMenusPageObj = new CommonHeaderMenusPage(driver);
		commonHeaderMenusPageObj.locateCommonHeaderMenus("ALERTS AND MODALS");
		sideNavigationMenusObj = new SideNavigationMenus(driver);
		sideNavigationMenusObj.navigationMenuClick("Javascript Alert");
		alertBoxSampleObj = new AlertBoxSample(driver);
		alertBoxSampleObj.verifyAlertCancelClick();
	}
	@Test
	public void verifyAlertBoxClickPrompt() {
		commonHeaderMenusPageObj = new CommonHeaderMenusPage(driver);
		commonHeaderMenusPageObj.locateCommonHeaderMenus("ALERTS AND MODALS");
		sideNavigationMenusObj = new SideNavigationMenus(driver);
		sideNavigationMenusObj.navigationMenuClick("Javascript Alert");
		alertBoxSampleObj = new AlertBoxSample(driver);
		alertBoxSampleObj.verifyAlertPromptClick();
	}

}
