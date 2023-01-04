package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeExample extends Base{
	
	@Test
	public void iFrameOperations() {
		driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		int size = driver.findElements(By.tagName("iframe")).size();
		WebElement iFrameelement = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame(iFrameelement);
		driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/training/selenium-online-training/']")).click();
		driver.quit();
	}
	

}
