package com.obsqura.TestNGAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDropDownOption extends BrowserLoading{
	@Test
	public void SelectCountryDropdown() {
		WebElement dropDown;
		String inputText = "Australia",actualText;
		dropDown = driver.findElement(By.xpath("//select[@name='continents']"));
		Select objSelectItem=new Select(dropDown);
		objSelectItem.selectByVisibleText(inputText);
		actualText=objSelectItem.getFirstSelectedOption().getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, inputText, "Actual selected value is not equal to expected");
	}
	@Test
	public void printAllListItems() {
		int totalCount;
		WebElement dropDown=driver.findElement(By.xpath("//select[@name='continents']"));
		Select objSelect=new Select(dropDown);
		List <WebElement> elementCount=objSelect.getOptions();
		totalCount=elementCount.size();
					for(int i=0;i<totalCount;i++) {
						System.out.println(elementCount.get(i).getText());
			}	
		Assert.assertNotNull(elementCount.size(), "No Elements Found");
	}

}
