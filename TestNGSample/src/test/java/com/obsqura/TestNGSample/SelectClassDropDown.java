package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectClassDropDown extends Base {
	@Test
	public void dropDown() {
		String inputText="Red";
		String actualMessage,expectedMessage="Selected Color : "+inputText;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect= new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		objselect.selectByVisibleText(inputText);
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Colour Selected Is Not Correct");
	}
	@Test
	public void selectByIndex() {
		String actualColor,expectedColor="Selected Color : Red";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect= new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		objselect.selectByIndex(1);
		actualColor = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualColor, expectedColor,"Selected Colour Is Not Correct");
	}
	@Test
	public void selectByIndexNext() {
		String actualColor,expectedColor="Selected Color : Yellow";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objSelect= new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		objSelect.selectByIndex(2); 
		actualColor = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualColor, expectedColor,"Selected Colour Is Not Correct");
	}
	@Test
	public void selectByIndexThree() {
		String actualColor,expectedColor="Selected Color : Green";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect= new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		objselect.selectByIndex(3);
		actualColor = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualColor, expectedColor,"Selected Colour Is Not Correct");
	
	}
	@Test
	public void selectByIndexZero() {
		String actualColor,expectedColor="Selected Color :";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect= new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		objselect.selectByIndex(0);
		actualColor = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualColor, expectedColor,"Selected Colour Is Not Correct");
	}
	@Test
	public void selectByValue() {
		String inputValue="Red";
		String actualMessage,expectedMessage="Selected Color : "+inputValue;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect= new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		objselect.selectByValue(inputValue);
	actualMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualMessage, expectedMessage, inputValue +"Is Not Selected");
	}
	@Test
	public void selectByOption() {
		String actualMessage,expectedMessage="Selected Color : Yellow";
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect= new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		List<WebElement>elementCount=objselect.getOptions();
		elementCount.get(3).click();
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Selected Colour Is Not Correct");
	}
	@Test(description="Selecting Multiple Element From Drop Down")
	public void selectMultiple() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect= new Select(driver.findElement(By.xpath("//select[@id='multi-select-field']")));
		objselect.isMultiple();
		objselect.selectByIndex(0);
		objselect.selectByIndex(1);
		objselect.selectByIndex(2);
		WebElement buttonClick=driver.findElement(By.xpath("//button[@id='button-all']"));
		if(buttonClick.isEnabled()) {
			buttonClick.click();
		}
	}


}
