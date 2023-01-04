package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorCommands extends Base{
	@Test
	public void scrollCommand() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("window.scrollBy(0,-350)", "");
		WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
		js.executeScript("arguments[0].scrollIntoView();", getTotal);
		js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].click();", getTotal);
		js.equals(getTotal);
		
	}

}
