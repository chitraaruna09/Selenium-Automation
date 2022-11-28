package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SimpleFormDemoPage {
	WebDriver driver;
	//locate web elements for the Single Input Fields
	By enterMessageField = By.xpath("//input[@id='single-input-field']"); 
	By btnShowMessage = By.xpath("//button[@id='button-one']");
	By yourMessage = By.xpath("//div[@id='message-one']");
	
	//locate web elements for the Two Input Fields
	By enterValueA = By.xpath("//input[@id='value-a']");
	By enterValueB = By.xpath("//input[@id='value-b']");
	By btnGetTotal = By.xpath("//button[@id='button-two']");
	By totalDispMessage= By.xpath("//div[@id='message-two']");
	
	//default constructor
	public SimpleFormDemoPage(WebDriver driver) {
				this.driver = driver;
	}
		public void verifySingleInputField() {
		String inputMessage = "Test Description", actualMessage;
		String expectedMessage = "Your Message : "+inputMessage;
		driver.findElement(enterMessageField).sendKeys(inputMessage);
		driver.findElement(btnShowMessage).click();
		actualMessage=driver.findElement(yourMessage).getText();// retruns string and getText() will locate web elements
		Assert.assertEquals(actualMessage, expectedMessage, "Selected and Expected Messages are not matched.");
	}
		
		public void verifyTwoInputFields() {
			String inputA="12",inputB="7", actualMessage;
			int valA,valB,totalVal;
			driver.findElement(enterValueA).sendKeys(inputA);
			driver.findElement(enterValueB).sendKeys(inputB);
			driver.findElement(btnGetTotal).click();		
			valA = Integer.valueOf(inputA);
			valB = Integer.valueOf(inputB);
			totalVal = valA+valB;
			String expectedMessage= "Total A + B : "+totalVal;
			actualMessage = driver.findElement(totalDispMessage).getText();
			Assert.assertNotEquals(actualMessage, expectedMessage, "Grand Total Actual and Expeted Messages are not same");
			
		}

}
