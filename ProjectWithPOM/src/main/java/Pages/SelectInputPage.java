package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.ExcelUtilitySample;

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
		ExcelUtilitySample excelUtilitySampleObj = new ExcelUtilitySample();
		String actualTextMessage,expectedMessage ="Selected Color : ",inputColor;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select inputSelect = new Select(driver.findElement(selectInputField));
		inputColor=excelUtilitySampleObj.readDatFromExcel(0,0);
		//inputColor = excelUtilityObj.getStringMultiColor(0, 0, "src\\main\\java\\Resources\\SelectPageTestData.xlsx", "SelectPageTestData");
		inputSelect.selectByVisibleText(inputColor);
		actualTextMessage = driver.findElement(actualMessage).getText();
		Assert.assertEquals(expectedMessage+inputColor, actualTextMessage);
		}
		public void verifySelectMultipleInputColor() throws IOException {
			ExcelUtilitySample excelUtilitySampleObj = new ExcelUtilitySample();
			String actualMessage,expectedMessage="All selected colors are : ",colorRed,colorYellow,colorGreen;
			driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
			Select multipleSelect = new Select(driver.findElement(multipleInputField));
			multipleSelect.isMultiple();
			multipleSelect.selectByVisibleText(excelUtilitySampleObj.readDatFromExcel(0,0));
			multipleSelect.selectByVisibleText(excelUtilitySampleObj.readDatFromExcel(1,0));
			multipleSelect.selectByVisibleText(excelUtilitySampleObj.readDatFromExcel(2,0));
			//multipleSelect.selectByVisibleText(excelUtilityObj.getStringMultiColor(0, 0, "src\\main\\java\\Resources\\SelectPageTestData.xlsx", "SelectPageTestData"));
			//multipleSelect.selectByVisibleText(excelUtilityObj.getStringMultiColor(1, 0, "src\\main\\java\\Resources\\SelectPageTestData.xlsx", "SelectPageTestData"));
			//multipleSelect.selectByVisibleText(excelUtilityObj.getStringMultiColor(2, 0, "src\\main\\java\\Resources\\SelectPageTestData.xlsx", "SelectPageTestData"));
			driver.findElement(getAllSelectedButton).click();
			actualMessage = driver.findElement(multipleActualMessage).getText();
			List<WebElement> multipleColor =  multipleSelect.getOptions();
			colorRed=multipleColor.get(0).getText();
			colorYellow=multipleColor.get(1).getText();
			colorGreen=multipleColor.get(2).getText();
			Assert.assertEquals(expectedMessage+colorGreen, actualMessage);
		}

}
