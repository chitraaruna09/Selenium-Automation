package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleCheckBox extends Base {
	@Test(description="Click first Check Box")
	public void selectFirstCheckBox() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		WebElement selectAllButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		boolean displayCheckBox=checkBoxOne.isDisplayed()&&checkBoxTwo.isDisplayed()&&checkBoxThree.isDisplayed()&&checkBoxFour.isDisplayed();
	    if(displayCheckBox==true) {
	    	if(checkBoxOne.isDisplayed()) {
	    		checkBoxOne.click();
	    		if(checkBoxOne.isSelected()) {
	    			Assert.assertTrue(checkBoxOne.isSelected(), "CheckBox Not Selected");
	    		}
	    		/*if(selectAllButton.isEnabled()) {
	    			selectAllButton.click();
	    			Assert.assertTrue(selectAllButton.isEnabled(), "UnSelect Button Is Not Enable");
	    		}*/
    		Assert.assertTrue(checkBoxOne.isDisplayed(), "Check Box Is Not Selected");
	    		}
	    	Assert.assertTrue(displayCheckBox==true, "Check Box Is Not Displayed");
	    	}
	}
	@Test(description="Multiple check box")
	public void selectMultipleCheckBox() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		WebElement selectAllButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		boolean displayCheckBox=checkBoxOne.isDisplayed()==true&&checkBoxTwo.isDisplayed()==true&&checkBoxThree.isDisplayed()==true&&checkBoxFour.isDisplayed()==true;
	    if(displayCheckBox==true) {
	    	if(selectAllButton.isEnabled()) {
	    		selectAllButton.click();
	    		if(selectAllButton.isEnabled()) {
	    			selectAllButton.click();
	    			Assert.assertTrue(selectAllButton.isEnabled(), "UnSelect Button Is Not Enable");
	    		}
	    		Assert.assertTrue(selectAllButton.isEnabled(), "Select Button Is Not Enable");
	    	}
	    	Assert.assertTrue(displayCheckBox==true, "Check Box Is Not Displayed");
	    }
	}

}
