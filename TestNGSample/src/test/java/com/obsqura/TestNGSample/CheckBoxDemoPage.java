package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemoPage extends Base {
	@Test
	public void checkBox() {
		String actText,exptText="Success - Check box is checked";
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkB=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		boolean select=checkB.isSelected();
		if(select==false) {
			checkB.click();
			if(checkB.isSelected()) {
			actText=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			Assert.assertEquals(actText, exptText, "Message is not same");
			}
			Assert.assertTrue(checkB.isSelected(), "Button Is Not Selected");
		}
		Assert.assertTrue(select==false, "Button Already Selected");
		
		
	}

}
