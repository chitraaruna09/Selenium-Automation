package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonEnableOrNot extends Base{
	@Test(description="Show message button is enable")
	public void showMessageButtonEnable() {
		String inputMessage="Your Message : Apple",outputMessage;
		boolean buttonEnable;
		boolean flag=false;
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("Apple");
		buttonEnable=driver.findElement(By.xpath("//button[@id='button-one']")).isEnabled();
		if(buttonEnable==true) {
			flag=true;
		}
		Assert.assertTrue(flag, "Button Is Not Enabled");
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(outputMessage, inputMessage, "Not Same");
	}
	@Test(description="Show message button is displayed")
	public void showMessageButtonDisplayed() {
		boolean display;
		boolean flag=false;
		display=driver.findElement(By.xpath("//button[@id='button-one']")).isDisplayed();
		if(display==true) {
			flag=true;	
		}
		Assert.assertTrue(flag, "Not Displayed");
	}
}


