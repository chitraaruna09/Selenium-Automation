package com.obsqura.TestNGAssignments;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementCommands extends Base{
	@Test(description= "SendKey two input fields numeric values checking")
	public void sendKeyInputFieldsSum() {
		String firstInput = "10",secondInput ="-5", result="5", outputMessage;
		boolean flag = false;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php\\");
		driver.findElement(By.id("value-a")).sendKeys(firstInput);
		driver.findElement(By.id("value-b")).sendKeys(secondInput);
		driver.findElement(By.id("button-two")).click();
		outputMessage = driver.findElement(By.id("message-two")).getText();
		
		if(outputMessage.equals("Total A + B : "+result)) {
			flag = true;
		}
		Assert.assertTrue(flag,"Sum of two inputs are not getting. Failed!");
	}
	
	@Test(description= "SendKey two input fields string values checking")
	public void sendKeyInputFieldsStringSum() {
		String firstInput = "A",secondInput ="B", result="NaN", outputMessage;
		boolean flag = false;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php\\");
		driver.findElement(By.id("value-a")).sendKeys(firstInput);
		driver.findElement(By.id("value-b")).sendKeys(secondInput);
		driver.findElement(By.id("button-two")).click();
		outputMessage = driver.findElement(By.id("message-two")).getText();
		
		if(outputMessage.equals("Total A + B : "+result)) {
			flag = true;
		}
		Assert.assertTrue(flag,"Check the input field values");
	}

}
