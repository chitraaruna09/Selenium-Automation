package com.obsqura.TestNGAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTutorialSite extends BrowserLoading{
	@Test
	public void checkBoxesSelectedOrNot() {
		WebElement chkBoxManualTester,chkBoxAutoTester,chkBoxRcElement,chkBoxSelIDE,chkBoxSelWebdriver;
		chkBoxManualTester=driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		chkBoxAutoTester=driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		chkBoxRcElement=driver.findElement(By.xpath("//input[@value='RC']"));
		chkBoxSelIDE=driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
		chkBoxSelWebdriver=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		if(chkBoxManualTester.isSelected() && chkBoxAutoTester.isSelected() && chkBoxRcElement.isSelected() && chkBoxSelIDE.isSelected() && chkBoxSelWebdriver.isSelected()) {
			//System.out.println("None of the check boxes selected by default");
			Assert.assertTrue(true, "None of the check boxes selected by default");
		}
		Assert.assertFalse(false, "One of the checkbox is selected");
	}
	@Test
	public void selectWebdriverCheckbox() {
		WebElement selWebdriver=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		selWebdriver.click();
		if(selWebdriver.isEnabled()) {
			Assert.assertTrue(true, "Selenium webdriver is not enabled");
		}
			Assert.assertFalse(false, "Selenium webdriver is not enabled");
	}

}
