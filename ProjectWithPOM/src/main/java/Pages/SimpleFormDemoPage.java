package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import utilities.WaitUtility;
import utilities.PageUtility;

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
	public void verifyTitleAndUrl() {
		String title="Obsqura Testing",actualTitle, actualUrl, fraction="simple-form-demo.php";
		WaitUtility.waitForTitleContains(driver, title);
		actualTitle=driver.getTitle();
		WaitUtility.waitForUrlContains(driver, fraction);
		actualUrl=driver.getCurrentUrl();
	}
		public void verifySingleInputField() {
		String inputMessage = "Test Description", actualMessage, title="Obsqura Testing";
		WaitUtility.waitForTitleIs(driver, title);
		String expectedMessage = "Your Message : "+inputMessage;
		//driver.findElement(enterMessageField).sendKeys(inputMessage);
		WebElement EnterMessageField= driver.findElement(enterMessageField);
		PageUtility.enterText(EnterMessageField, inputMessage);
		WebElement ShowMessageButton = driver.findElement(btnShowMessage);
		WaitUtility.waitForElementToBeClickable(driver, ShowMessageButton);
		//driver.findElement(btnShowMessage).click();
		PageUtility.clickOnElement(ShowMessageButton);
		WaitUtility.waitForVisibilityOfElementLocated(driver, yourMessage);
		//actualMessage=driver.findElement(yourMessage).getText();// retruns string and getText() will locate web elements
		WebElement YourMessage= driver.findElement(yourMessage);
		actualMessage = PageUtility.getElementText(YourMessage);
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
		public void verifyDragAndDrop() {
			driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
			Actions action = new Actions(driver);
			By element = By.xpath("//li[@class='list-group-item']//child::a[@href='drag-drop.php']");
			
		}

}
