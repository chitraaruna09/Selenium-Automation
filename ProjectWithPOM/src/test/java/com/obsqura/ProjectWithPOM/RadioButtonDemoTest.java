package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.RadioButtonDemoPage;

public class RadioButtonDemoTest extends Base{
	
	RadioButtonDemoPage radioButtonDemoPageObj;
	
	@Test
	public void verifyRadioButtonsEnabledOrNot() throws IOException {
		RadioButtonDemoPage radioButtonDemoPageObj = new RadioButtonDemoPage(driver);
		radioButtonDemoPageObj.verifyNoRadioButtonsSelectedOrEnabled();
	}
	
	@Test
	public void verifyRadioButtonMaleClickedAndMessageCheck() throws IOException {
		RadioButtonDemoPage radioButtonDemoPage = new RadioButtonDemoPage(driver);
		radioButtonDemoPage.verifyMaleRadioButtonIsSelectedOrEnabled();
	}
	
	@Test
	public void verifyRadioButtonFemaleClickedAndMessageCheck() throws IOException {
		RadioButtonDemoPage radioButtonDemoPage = new RadioButtonDemoPage(driver);
		radioButtonDemoPage.verifyFemaleRadioButtonIsSelectedOrEnabled();
	}

}
