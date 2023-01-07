package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.PageUtility;
import utilities.WaitUtility;

public class SimpleFormDemoPageFactory {
		public WebDriver driver;
		
		@FindBy(xpath = "//input[@id='single-input-field']")
		private WebElement enterMessageField;

		@FindBy(xpath = "//button[@id='button-one']")
		private WebElement showMessageButton;
		
		@FindBy(xpath = "//div[@id='message-one']")
		private WebElement yourMessage;
		
	public SimpleFormDemoPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void verifySingleInputField() {
		String inputMessage = "Test Description", actualMessage, title="Obsqura Testing";
		WaitUtility.waitForTitleIs(driver, title);
		String expectedMessage = "Your Message : "+inputMessage;
		PageUtility.enterText(enterMessageField, inputMessage);
		WaitUtility.waitForElementToBeClickable(driver, showMessageButton);
		PageUtility.clickOnElement(showMessageButton);
		WaitUtility.waitForVisibilityOfElementLocated(driver, yourMessage);
		actualMessage = PageUtility.getElementText(yourMessage);
		Assert.assertEquals(actualMessage, expectedMessage, "Selected and Expected Messages are not matched.");
	}
}
