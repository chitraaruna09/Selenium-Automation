package com.obsqura.TestNGAssignments;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormSubmit extends Base{
	@Test(description ="Form Subimt webelements locating")
	public void formSubmit(){
		String inputFname ="Aruna", inputLname ="A", inputUserName ="chitraaruna09", inputCity ="Pathanamthitta", inputState ="Kerala", inputZip = "689664";
		boolean isSelected, flag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys(inputFname);
		driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys(inputLname);
		driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).sendKeys(inputUserName);
		driver.findElement(By.xpath("//input[@id='validationCustom03']")).sendKeys(inputCity);
		driver.findElement(By.xpath("//input[@id='validationCustom04']")).sendKeys(inputState);
		driver.findElement(By.xpath("//input[@id='validationCustom05']")).sendKeys(inputZip);
		driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();
		isSelected = driver.findElement(By.xpath("//input[@id='invalidCheck']")).isSelected();
		if(isSelected == true) {
			flag = true;
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		}
		Assert.assertTrue(true, "You must agree before submitting.");
		
	}

}
