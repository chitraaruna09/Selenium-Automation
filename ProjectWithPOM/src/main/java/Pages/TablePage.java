package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.ExcelUtility;

public class TablePage {
	WebDriver driver;
	By tableColumn = By.xpath("//tr[@role='row']//child::th"); ////th[@class='th-sm sorting_disabled']
	By tableRow = By.xpath("//table[@id='dtBasicExample']//child::tbody//tr"); //table[@id='dtBasicExample']//child::tr
	
	public TablePage(WebDriver driver) {
		this.driver = driver;
	}
	public void tableRowLocate() throws IOException {
		String expectedField;
		ExcelUtility excelUtilityObj = new ExcelUtility();
		expectedField = excelUtilityObj.getStringMultiColor(1, 0, "src\\main\\java\\Resources\\SelectPageTestData.xlsx", "TableData");
		List<WebElement> rowElements = driver.findElements(tableRow);
		int rowCount = rowElements.size();
		for(WebElement elements: rowElements) {
			//System.out.println(elements.getText());
			if(elements.getText().equals(expectedField)) {
				String actualFieldValues = elements.getText();
				Assert.assertEquals(actualFieldValues, expectedField, "Table row data is different!");
				break;
			}
		}
	}
	public void tableColumnLocate() {
		List<WebElement> columnElements = driver.findElements(tableColumn);
		int columnCount = columnElements.size();
		for(WebElement elements:columnElements) {
			System.out.print(elements.getText());
		}
	}

}
