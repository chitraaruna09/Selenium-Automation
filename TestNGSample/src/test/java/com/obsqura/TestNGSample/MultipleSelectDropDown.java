package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleSelectDropDown extends Base {
	@Test
	public void multipeSelect() {
	String actualMessage,expectedMessage="All selected colors are : Red,Yellow,Green";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objSelect=new Select(driver.findElement(By.xpath("//select[@id='multi-select-field']")));
		objSelect.isMultiple();
		objSelect.selectByIndex(0);
		objSelect.selectByIndex(1);
		objSelect.selectByIndex(2);
		WebElement buttonClick=driver.findElement(By.xpath("//button[@id='button-all']"));
		WebElement message=driver.findElement(By.xpath("//div[@id='message-two']"));
			if(buttonClick.isEnabled()) {
				buttonClick.click();
				if(message.isDisplayed()) {
					actualMessage=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
					Assert.assertNotEquals(actualMessage, expectedMessage,"Message Displayed Is Not Correct");
				}
				Assert.assertTrue(buttonClick.isEnabled(), "Button Is Not Enable");
			}
		
	}
	

}
