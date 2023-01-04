package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AlertBoxSample {
		WebDriver driver;
		By buttonClickMe = By.xpath("//button[@class='btn btn-success']");
		By buttonCancel = By.xpath("//button[@class='btn btn-warning']");
		By clickForPromptBox = By.xpath("//button[@class='btn btn-danger']");
		By yourMessage = By.xpath("//p[@class='py-4']");
		
	public AlertBoxSample(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyTheSimpleAlertBoxButtonAccept() {
		WebElement btnClickMe = driver.findElement(buttonClickMe);
		btnClickMe.click();
		WaitUtility.waitForAlertIsPresent(driver);
		driver.switchTo().alert().accept(); // accepting the 'Ok' button from the popup
		WaitUtility.waitForElementClickable(driver, btnClickMe);
		//btnClickMe.click();
	}
	public void verifyAlertBoxText() {
		String actualAlertBoxText, expectedAlertBoxText = "I am a Javascript alert box!";
		WebElement btnClickMe = driver.findElement(buttonClickMe);
		btnClickMe.click();
		WaitUtility.waitForAlertIsPresent(driver);
		actualAlertBoxText = driver.switchTo().alert().getText();
		Assert.assertEquals(actualAlertBoxText, expectedAlertBoxText, "Alert Box texts are not identical!");
	}
	public void verifyAlertCancelClick() {
		WebElement btnCancel = driver.findElement(buttonCancel);
		WaitUtility.waitForElement(driver, btnCancel);
		btnCancel.click();
		driver.switchTo().alert().dismiss(); // cancel button click from the alert box
		Assert.assertTrue(true, "Alert Box is present and the Cancel button is visible!");
	}

	public void verifyAlertPromptClick() {
		String inputMessage = "Aruna", actualMessage;
		String expectedMessage = "You have entered "+"'"+inputMessage+"'"+" !";
		WebElement clickPromptButton = driver.findElement(clickForPromptBox);
		clickPromptButton.click();
		driver.switchTo().alert().sendKeys(inputMessage); //inputting texts to the alertbox
		WaitUtility.waitForAlertIsPresent(driver);
		driver.switchTo().alert().accept();
		WaitUtility.waitForVisibilityOfElementLocated(driver, yourMessage);
		WebElement YourMessage= driver.findElement(yourMessage);
		actualMessage = PageUtility.getElementText(YourMessage);
		Assert.assertEquals(actualMessage, expectedMessage, "Actual and Expected Messages are not matched.");
	}

}
