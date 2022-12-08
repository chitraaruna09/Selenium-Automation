package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import utilities.ExcelUtility;
import utilities.PageUtility;

public class RadioButtonDemoPage {
	WebDriver driver;
	By maleRadioButton 		= By.xpath("//input[@id='inlineRadio1']");
	By femaleRadioButton 	= By.xpath("//input[@id='inlineRadio2']");
	By showSelectedValueButton = By.xpath("//button[@id='button-one']");
	By actualMessage = By.xpath("//div[@id='message-one']");
	
	public RadioButtonDemoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyNoRadioButtonsSelectedOrEnabled() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String actualMessage1,expectedMessage;
		SoftAssert softAssert = new SoftAssert();
		Boolean maleRadioBtnIsEnabled,femaleRadioBtnIsEnabled,maleRadioBtnIsSelected,femaleRadioBtnIsSelected;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		maleRadioBtnIsEnabled = driver.findElement(maleRadioButton).isEnabled();
		femaleRadioBtnIsEnabled = driver.findElement(femaleRadioButton).isEnabled();
		maleRadioBtnIsSelected = driver.findElement(maleRadioButton).isSelected();
		femaleRadioBtnIsSelected = driver.findElement(femaleRadioButton).isSelected();
			if(maleRadioBtnIsEnabled && femaleRadioBtnIsEnabled) {
				if(maleRadioBtnIsSelected && femaleRadioBtnIsSelected) {
					//driver.findElement(showSelectedValueButton).click();
					WebElement ShowSelectedValueButton = driver.findElement(showSelectedValueButton);
					PageUtility.clickOnElement(ShowSelectedValueButton);
					//actualMessage1 = driver.findElement(actualMessage).getText();
					WebElement ActualMessage = driver.findElement(actualMessage);
					actualMessage1 = PageUtility.getElementText(ActualMessage);
					expectedMessage = excelUtilityObj.getStringMultiColor(1, 0, "src\\main\\java\\Resources\\SelectPageTestData.xlsx", "RadioButtonDemoTestData");
					Assert.assertEquals(expectedMessage, actualMessage1, "Expected and Actual Messages are not equal");
				}
				softAssert.assertFalse(maleRadioBtnIsSelected, "Male Radio Button is already selected");
				softAssert.assertFalse(femaleRadioBtnIsSelected, "Female Radio Button is already selected");
				softAssert.assertAll();
			}
			softAssert.assertTrue(maleRadioBtnIsEnabled, "Male Radio Button is not enabled");
			softAssert.assertTrue(femaleRadioBtnIsEnabled, "Female Radio Button is not enabled");
			softAssert.assertAll();
	}
	
	public void verifyMaleRadioButtonIsSelectedOrEnabled() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String actualMessage1,expectedMessage;
		SoftAssert softAssert = new SoftAssert();
		Boolean maleRadioBtnIsSelected,femaleRadioBtnIsSelected;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		maleRadioBtnIsSelected = driver.findElement(maleRadioButton).isSelected();
		femaleRadioBtnIsSelected = driver.findElement(femaleRadioButton).isSelected();
				if(maleRadioBtnIsSelected && femaleRadioBtnIsSelected) {
					driver.findElement(maleRadioButton).click();
					driver.findElement(showSelectedValueButton).click();
					actualMessage1 = driver.findElement(actualMessage).getText();
					expectedMessage = excelUtilityObj.getStringMultiColor(2, 0, "src\\main\\java\\Resources\\SelectPageTestData.xlsx", "RadioButtonDemoTestData");
					Assert.assertEquals(expectedMessage, actualMessage1, "Expected and Actual Messages are not equal");
				}
				softAssert.assertFalse(maleRadioBtnIsSelected, "Male Radio Button is already selected");
				softAssert.assertFalse(femaleRadioBtnIsSelected, "Female Radio Button is already selected");
				softAssert.assertAll();
	}
	
	public void verifyFemaleRadioButtonIsSelectedOrEnabled() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String actualMessage1,expectedMessage="";
		SoftAssert softAssert = new SoftAssert();
		Boolean maleRadioBtnIsSelected,femaleRadioBtnIsSelected;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		maleRadioBtnIsSelected = driver.findElement(maleRadioButton).isSelected();
		femaleRadioBtnIsSelected = driver.findElement(femaleRadioButton).isSelected();
				if(maleRadioBtnIsSelected && femaleRadioBtnIsSelected) {
					driver.findElement(femaleRadioButton).click();
					driver.findElement(showSelectedValueButton).click();
					actualMessage1 = driver.findElement(actualMessage).getText();
					expectedMessage = excelUtilityObj.getStringMultiColor(3, 0, "src\\main\\java\\Resources\\SelectPageTestData.xlsx", "RadioButtonDemoTestData");
					Assert.assertEquals(expectedMessage, actualMessage1, "Expected and Actual Messages are not equal");
				}
				softAssert.assertFalse(maleRadioBtnIsSelected, "Male Radio Button is already selected");
				softAssert.assertFalse(femaleRadioBtnIsSelected, "Female Radio Button is already selected");
				softAssert.assertAll();
	}

}
