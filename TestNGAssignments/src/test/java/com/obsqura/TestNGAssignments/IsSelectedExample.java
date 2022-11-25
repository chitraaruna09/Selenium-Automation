package com.obsqura.TestNGAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsSelectedExample extends DriverLoading{

	@Test
	public void verifyCheckBoxIsSelected() {
		WebElement redCheckbox;
		redCheckbox = driver.findElement(By.xpath("(//input[@name='color'])[1]"));
		if(redCheckbox.isSelected()==false) {
			driver.findElement(By.xpath("(//input[@name='color'])[1]")).click();
			Assert.assertTrue(redCheckbox.isSelected(), "Red Check Box is not Selected");
		}
		Assert.assertTrue(redCheckbox.isSelected(), "Red Check Box is Selected");
	}
	
	@Test
	public void verifyCheckBoxIsEnabled() {
		WebElement redCheckbox;
		redCheckbox = driver.findElement(By.xpath("(//input[@name='color'])[1]"));
		if(redCheckbox.isEnabled()==false) {
			driver.findElement(By.xpath("(//input[@name='color'])[1]")).isEnabled();
			Assert.assertTrue(redCheckbox.isEnabled(), "Red Check Box is not Enabled");
		}
		Assert.assertTrue(redCheckbox.isEnabled(), "Red Check Box is Enabled");
	}
	
	@Test
	public void verifyOperaRadioButtonIsSelected() {
		WebElement operaRadioButton;
		operaRadioButton = driver.findElement(By.xpath("(//input[@name='browser'])[3]"));
		if(operaRadioButton.isSelected()==false) {
			operaRadioButton.click();
			Assert.assertTrue(operaRadioButton.isSelected(), "Opera Radio Button is not Selected");
		}
		Assert.assertTrue(operaRadioButton.isSelected(), "Some other radio button is selected");
	}
	
}
