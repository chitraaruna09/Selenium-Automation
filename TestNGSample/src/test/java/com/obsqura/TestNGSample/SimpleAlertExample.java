package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SimpleAlertExample extends Base{
	By buttonClickMe = By.xpath("//button[@class='btn btn-success']");
	By buttonCancel = By.xpath("//button[@class='btn btn-warning']");
	By clickForPromptBox = By.xpath("//button[@class='btn btn-danger']");
	
		@Test
		public void verifySimpleAlertPopup() {
			driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
			WebElement btnClickMe = driver.findElement(buttonClickMe);
			btnClickMe.click();
			driver.switchTo().alert().accept(); // accepting the 'Ok' button from the popup
			btnClickMe.click();
			
			String popupText = driver.switchTo().alert().getText(); //getting the alert box text
			driver.switchTo().alert().accept();
			
			WebElement btnCancel = driver.findElement(buttonCancel);
			btnCancel.click();
			driver.switchTo().alert().dismiss(); // cancel button click from the alert box
			
			WebElement clickPromptButton = driver.findElement(clickForPromptBox);
			clickPromptButton.click();
			driver.switchTo().alert().sendKeys("Aruna"); //inputting texts to the alertbox
			driver.switchTo().alert().accept();
		}
}
