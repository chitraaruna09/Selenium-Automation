package com.obsqura.TestNGAssignments;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementsCSSSample extends Base{
	@Test(description = "CSS attribute Background Color comparing")
	public void getCSSBgColorValue() {
		String bgColor, expectedColor="#007bff",actualColor;
		//rgba(0, 123, 255, 1)
		int r=0,g=123,b=255;
		boolean flag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php\\");
		bgColor = driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("background-color"); // 'background-color' is the attribute name getting from web element styles value by inspecting; getting this rgba(0, 123, 255, 1) value
		actualColor = String.format("#%02x%02x%02x", r,g,b); // converting rgba to hex string format
		if(actualColor.equals(expectedColor)) {
			flag = true;
		}
		Assert.assertTrue(flag, "Background colors are not same!");
		
	}
	
	@Test(description = "CSS attribute Widget Font Color comparing")
	public void getCSSFontColorValue() {
		String btnFontColor, expectedBtnFontColor="#fff",actualBtnFontColor;
		//rgba(255, 255, 255, 1)
		int r=255,g=255,b=255;
		boolean flag = false;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php\\");
		btnFontColor = driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("color"); //getting button font color
		actualBtnFontColor = String.format("#%02x%02x%02x", r,g,b);
		if(actualBtnFontColor.substring(0, 4).equals(expectedBtnFontColor)){
			flag = true;
		}
		Assert.assertTrue(flag, "Expected and Actual Button font colors do not matched!");
	}
	@Test(description = "CSS attribute Widgets Positions comparing")
	public void getBtnPositions() {
		//Point locationBtnShowMessage,locationLabelYourMessage;
		int btnShowMsgYVal, btnYourMsgYVal;
		boolean flag = false;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php\\");
		//locationBtnShowMessage = driver.findElement(By.xpath("//button[@id='button-one']")).getLocation(); //x=425 and y=257
		//locationLabelYourMessage = driver.findElement(By.xpath("//div[@id='message-one']")).getLocation(); //x=425 and y=303
		btnShowMsgYVal= driver.findElement(By.xpath("//button[@id='button-one']")).getLocation().getY();
		btnYourMsgYVal = driver.findElement(By.xpath("//div[@id='message-one']")).getLocation().getY();
		if(btnYourMsgYVal>btnShowMsgYVal) {
			flag = true;
		}
		Assert.assertTrue(flag, "Widgets are not aligned well");
	}

}
