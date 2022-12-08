package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonDemo extends Base {
	@BeforeMethod
	public void navigateToRadioButtonPage() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
	}
	@Test(description="Clicking Male Option From That Page")
	public void maleRadioButtonClick() {
		String actualMessage,expectedMessage="Radio button 'Male' is checked";
		boolean buttonEnable;
		WebElement radio=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		if(radio.isDisplayed()) {
		radio.click();
		}
		buttonEnable=driver.findElement(By.xpath("//button[@id='button-one']")).isEnabled();
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Message Is Not Same");
	}
	@Test(description="Clicking Female Option From That Page")
	public void femaleRadioButtonClick() {
		String actualMessage,expectedMessage="Radio button 'Female' is checked";
		boolean buttonEnable;
		boolean flag=false;
		WebElement radio=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		if(radio.isDisplayed()) {
			radio.click();
			}
		buttonEnable=driver.findElement(By.xpath("//button[@id='button-one']")).isEnabled();
		if(buttonEnable==true) {
			flag=true;
		}
		Assert.assertTrue(true, "Button Is Not Enable");
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Message Is Not Same");
	}
	@Test(description=" Without Clicking Radio Button Click 'Show Selected Value' Button")
	public void showSelectedValueButton() {
		String actualMessage,expectedMessage="Radio button is Not checked";
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Message Is Not Same");
	}
	

}
