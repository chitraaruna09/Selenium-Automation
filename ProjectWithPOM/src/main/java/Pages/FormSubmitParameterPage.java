package Pages;

import java.io.IOException;

import org.apache.xmlbeans.impl.tool.Extension.Param;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.ParameterUtility;

public class FormSubmitParameterPage {
	WebDriver driver;
	By firstNameField  = By.xpath("//input[@id='validationCustom01']");	
	By lastNameField   =  By.xpath("//input[@id='validationCustom02']");
	By userNameField = By.xpath("//input[@id='validationCustomUsername']");
	By cityField            = By.xpath("//input[@id='validationCustom03']");
	By stateField          = By.xpath("//input[@id='validationCustom04']");
	By zipField			 = By.xpath("//input[@id='validationCustom05']");
	By agreeTermsAndConditions = By.xpath("//input[@id='invalidCheck']");
	By buttonSubmitForm = By.xpath("//button[text()='Submit form']");
	By actualMessage = By.xpath("//div[@id='message-one']");
	

	public FormSubmitParameterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyTheFormSubmit(String firstName, String lastName, String userName, String city, String state, String zip) throws IOException {
		WebElement fNameField = driver.findElement(firstNameField);
		ParameterUtility.sendKeyValue(driver, fNameField, firstName);
		WebElement lNameField = driver.findElement(lastNameField);
		ParameterUtility.sendKeyValue(driver, lNameField, lastName);
		WebElement uNameField = driver.findElement(userNameField);
		ParameterUtility.sendKeyValue(driver, uNameField, userName);
		WebElement CityField = driver.findElement(cityField);
		ParameterUtility.sendKeyValue(driver, CityField, city);
		WebElement StateField = driver.findElement(stateField);
		ParameterUtility.sendKeyValue(driver, StateField, state);
		WebElement ZipField = driver.findElement(zipField);
		ParameterUtility.sendKeyValue(driver, ZipField, zip);
		WebElement agreeTAndCField = driver.findElement(agreeTermsAndConditions);
		PageUtility.clickOnElement(agreeTAndCField);
		WebElement SubmitFormButton = driver.findElement(buttonSubmitForm);
				if(SubmitFormButton.isEnabled()) {
					if(SubmitFormButton.isSelected()!=true) {
						PageUtility.clickOnElement(SubmitFormButton);
						WebElement ActualMessageField = driver.findElement(actualMessage);
						String actualMessageVal = PageUtility.getElementText(ActualMessageField);
						String expectedMessage = ExcelUtility.getStringMultiColor(1,0 , "\\src\\main\\java\\Resources\\SelectPageTestData.xlsx", "FormSubmitByParameter");
						Assert.assertEquals(actualMessageVal, expectedMessage, "Actual and Expected Messages are not equal");
					}
					Assert.assertFalse(SubmitFormButton.isSelected(), "Submit Form Button is already selected!");
				}
					Assert.assertTrue(SubmitFormButton.isEnabled(), "Submit Form Button Disabled");
		}

}
