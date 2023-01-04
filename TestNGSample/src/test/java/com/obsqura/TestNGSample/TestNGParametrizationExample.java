package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametrizationExample extends Base{
	@Test
	@Parameters({"sendKey"})
	public void parametrizationSampleUsingTestNGXML(String sendKey) {
		WebElement enterMessageField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement buttonShowMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		enterMessageField.sendKeys(sendKey);
		buttonShowMessage.click();
		enterMessageField.clear();
	}
	@Test
	@Parameters({"sendKeys"})
	public void parametrizationSampleWithTestNGXML(String sendKeys) {
		WebElement enterMessageField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement buttonShowMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		enterMessageField.sendKeys(sendKeys);
		buttonShowMessage.click();
		enterMessageField.clear();
	}
	
	@Test(dataProvider="sendKeysDataProvider")
	public void dataProviderWithTestNG(String input) {
		WebElement enterMessageField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement buttonShowMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		enterMessageField.sendKeys(input);
		buttonShowMessage.click();
		enterMessageField.clear();
	}
	
	@DataProvider(name="sendKeysDataProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Java"},
            { "Selenium Automation"},
            { "Selenium TestNG" }
        };

    }

}
