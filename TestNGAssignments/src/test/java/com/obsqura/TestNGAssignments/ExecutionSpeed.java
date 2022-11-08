package com.obsqura.TestNGAssignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExecutionSpeed extends Base{
	
	@Test(description = "Locating the element using ID")
	public void locatingByID() {
		driver.findElement(By.id("ap_email")).sendKeys("chitraaruna09@gmail.com");
	}
	@Test(description = "Locating the element using Class Name")
	public void locatingByClassName() {
		driver.findElement(By.className("a-box"));
	}
	@Test(description = "Locating the element using Name")
	public void locatingByName() {
		driver.findElement(By.name("email"));
	}
	@Test(description = "Locating the element using CSSSelector ID")
	public void locatingByCSSSelectorID() {
		driver.findElement(By.cssSelector("input#ap_email")).sendKeys("chitraaruna09@gmail.com");
	}
	@Test(description = "Locating the element using XPath ID")
	public void locatingByXPathID() {
		driver.findElement(By.xpath("//input[@id='ap_email']"));
	}
	
}
