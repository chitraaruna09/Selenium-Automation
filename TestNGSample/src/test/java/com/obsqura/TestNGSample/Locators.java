package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {

	@Test(description = "Locating by ID")
	public void locatingByID() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
	}
}
