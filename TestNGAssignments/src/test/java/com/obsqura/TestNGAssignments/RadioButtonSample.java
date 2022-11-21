package com.obsqura.TestNGAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RadioButtonSample extends BaseClass{
	@Test
	public void noSelectionRadioButton() {
		WebElement radioBtnYes,radioBtnNo,btnCheck;
		Boolean isRadioBtnYesSelected, isRadioBtnNoSelected;
		SoftAssert softAssert = new SoftAssert();
		String actualText = "", expText="Radio button is Not checked";
		isRadioBtnYesSelected = driver.findElement(By.xpath("//input[@id='yes']")).isSelected();
		isRadioBtnNoSelected = driver.findElement(By.xpath("(//input[@name='name'])[2]")).isSelected();
		radioBtnYes = driver.findElement(By.xpath("//input[@id='yes']"));
		radioBtnNo = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		btnCheck = driver.findElement(By.xpath("//input[@id='buttoncheck']"));
		if(radioBtnYes.isDisplayed() && radioBtnNo.isDisplayed()) {
			if(isRadioBtnYesSelected==false && isRadioBtnNoSelected==false) {
				if(btnCheck.isEnabled()) {
					btnCheck.click();
					actualText = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
				}
				Assert.assertEquals(actualText, expText, "Actual and Expected messages are not same");
			}
			softAssert.assertTrue(isRadioBtnYesSelected, "Radio Button Yes is not Displayed");
			softAssert.assertTrue(isRadioBtnNoSelected, "Radio Button No is not Displayed");
		}
		softAssert.assertTrue(radioBtnYes.isDisplayed(), "Radio Button Yes is not Displayed");
		softAssert.assertTrue(radioBtnNo.isDisplayed(), "Radio Button No is not Displayed");
	}
	
	@Test
	public void noRadioButtonChecked() {
		WebElement radioBtnYes,radioBtnNo,btnCheck;
		Boolean isRadioBtnYesSelected, isRadioBtnNoSelected;
		SoftAssert softAssert = new SoftAssert();
		String actualText = "", expText="Radio button is checked and it's value is No";
		isRadioBtnYesSelected = driver.findElement(By.xpath("//input[@id='yes']")).isSelected();
		isRadioBtnNoSelected = driver.findElement(By.xpath("(//input[@name='name'])[2]")).isSelected();
		radioBtnYes = driver.findElement(By.xpath("//input[@id='yes']"));
		radioBtnNo = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		btnCheck = driver.findElement(By.xpath("//input[@id='buttoncheck']"));
		if(radioBtnYes.isDisplayed() && radioBtnNo.isDisplayed()) {
			if(isRadioBtnYesSelected==false && isRadioBtnNoSelected==true) {
				radioBtnNo.click();
				if(radioBtnNo.isEnabled()) {
					btnCheck.click();
					actualText = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
				}
				Assert.assertEquals(actualText, expText, "Actual and Expected messages are not same");
			}
			softAssert.assertTrue(isRadioBtnYesSelected, "Radio Button Yes is selected");
			softAssert.assertTrue(isRadioBtnNoSelected, "Radio Button No is Selected");
		}
		softAssert.assertTrue(radioBtnYes.isDisplayed(), "Radio Button Yes is not Displayed");
		softAssert.assertTrue(radioBtnNo.isDisplayed(), "Radio Button No is not Displayed");
	}

}
