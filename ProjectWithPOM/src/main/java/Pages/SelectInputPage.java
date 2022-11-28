package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.ExcelUtility;

public class SelectInputPage{
	WebDriver driver;
	By selectInputField = By.xpath("//select[@id='single-input-field']");
	By actualMessage = By.xpath("//div[@id='message-one']");
	By multipleInputField = By.xpath("//select[@id='multi-select-field']");
	By getFirstSelectedButton = By.xpath("//button[@id='button-first']");
	By getAllSelectedButton = By.xpath("//button[@id='button-all']");
	By multipleActualMessage = By.xpath("//div[@id='message-two']"); 
	
	public SelectInputPage(WebDriver driver) {
		this.driver=driver;
		}
	
	public void verifySelectInputPage() throws IOException {
		ExcelUtility excelUtilityObj = new ExcelUtility();
		String actualTextMessage,expectedMessage ="Selected Color : ",inputColor;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select inputSelect = new Select(driver.findElement(selectInputField));
		inputColor=excelUtilityObj.readDatFromExcel(0,0);
		inputSelect.selectByVisibleText(inputColor);
		actualTextMessage = driver.findElement(actualMessage).getText();
		Assert.assertEquals(expectedMessage+inputColor, actualTextMessage);
		}
		public void verifySelectMultipleInputColor() throws IOException {
		    ExcelUtility excelUtilityObj = new ExcelUtility();
			String actualMessage,expectedMessage="All selected colors are : ",colorRed,colorYellow,colorGreen;
			driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
			Select multipleSelect = new Select(driver.findElement(multipleInputField));
			multipleSelect.isMultiple();
			multipleSelect.selectByVisibleText(excelUtilityObj.readDatFromExcel(0,0));
			multipleSelect.selectByVisibleText(excelUtilityObj.readDatFromExcel(1,0));
			multipleSelect.selectByVisibleText(excelUtilityObj.readDatFromExcel(2,0));
			driver.findElement(getAllSelectedButton).click();
			actualMessage = driver.findElement(multipleActualMessage).getText();
			List<WebElement> multipleColor =  multipleSelect.getOptions();
			colorRed=multipleColor.get(0).getText();
			colorYellow=multipleColor.get(1).getText();
			colorGreen=multipleColor.get(2).getText();
			Assert.assertEquals(expectedMessage+colorGreen, actualMessage);
		}

}
