package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.DataProviderUtility;
import utilities.ExcelUtility;
import utilities.PageUtility;

public class FormSubmitDataProvider {
		public WebDriver driver;
		By firstNameField = By.xpath("//input[@id='validationCustom01']");
		By lastNameField = By.xpath("//input[@id='validationCustom02']");
		By userNameField = By.xpath("//input[@id='validationCustomUsername']");
		By cityField = By.xpath("//input[@id='validationCustom03']");
		By stateField = By.xpath("//input[@id='validationCustom04']");
		By zipField = By.xpath("//input[@id='validationCustom05']");
		By agreeTermsAndConditions = By.xpath("//input[@id='invalidCheck']");
		By submitFormButton = By.xpath("//button[text()='Submit form']");
		By actualMessageField = By.xpath("//div[@id='message-one']");
		
		public FormSubmitDataProvider(WebDriver driver) {
			this.driver=driver;
		}

		public void verifyTheFormSubmitByDataProvider(String firstName,String lastName,String userName,String city,String state,String zip) throws IOException {
			WebElement fNameField = driver.findElement(firstNameField);
			DataProviderUtility.sendKeyValue(driver, fNameField, firstName);
			WebElement lNameField = driver.findElement(lastNameField);
			DataProviderUtility.sendKeyValue(driver, lNameField, lastName);
			WebElement uNameField = driver.findElement(userNameField);
			DataProviderUtility.sendKeyValue(driver, uNameField, userName);
			WebElement CityField = driver.findElement(cityField);
			DataProviderUtility.sendKeyValue(driver, CityField, city);
			WebElement StateField = driver.findElement(stateField);
			DataProviderUtility.sendKeyValue(driver, StateField, state);
			WebElement ZipField = driver.findElement(zipField);
			DataProviderUtility.sendKeyValue(driver, ZipField, zip);
			WebElement agreeTAndC = driver.findElement(agreeTermsAndConditions);
			PageUtility.clickOnElement(agreeTAndC);
			WebElement SubmitFormButton = driver.findElement(submitFormButton);
			if(SubmitFormButton.isEnabled()) {
				if(SubmitFormButton.isSelected()!=true) {
					PageUtility.clickOnElement(SubmitFormButton);
					WebElement ActualMessageField = driver.findElement(By.xpath("//div[@id='message-one']"));
					String actualMessage = PageUtility.getElementText(ActualMessageField);
					String expectedMessage = ExcelUtility.getStringMultiColor(1,0 , "\\src\\main\\java\\Resources\\SelectPageTestData.xlsx", "FormSubmitByParameter");
					Assert.assertEquals(actualMessage, expectedMessage, "Actual and Expected Messages are not equal!");
				}
				Assert.assertFalse(SubmitFormButton.isSelected(), "Submit Form Button is already selected");
			}
			Assert.assertTrue(SubmitFormButton.isEnabled(), "Submit Form Button Disabled");
		}
}
