package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExecutionSpeed extends Base {
	@Test(description="Execution Speed Test By ID")
	public void checkingByID() {
		driver.findElement(By.id("twotabsearchtextbox"));
	}
	@Test(description="Execution Speed Test By Class")
	public void checkingByClass() {
		driver.findElement(By.className("nav-search-field"));
	}
	@Test(description="Execution Speed Test By Xpath")
	public void checkingByXpath() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}
	@Test(description="Execution Speed Test By Css selector")
	public void checkingByCssSelectorId() {
		driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	}
	
	

}
