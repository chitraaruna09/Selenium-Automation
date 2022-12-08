package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindElementsSample extends Base {
	@Test(description="Menu Find Elements")
	public void findElementExample(){
		String actualUrl,expectedURL = "https://selenium.obsqurazone.com/check-box-demo.php";
		List<WebElement>menuItem=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement menu:menuItem) {
			if(menu.getText().equals("Checkbox Demo")) {  
				menu.click();
				break;
			}
		}
		actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedURL, "Navigate to wrong page");	
	}
	@Test(description="Headder menu using find elements")
	public void datePickerClick(){
		String outputURL,inputURL="https://selenium.obsqurazone.com/date-picker.php";
		List<WebElement>datePicker=driver.findElements(By.xpath("//div[@class='collapse navbar-collapse']//a"));
		for(WebElement date:datePicker) {
			if(date.getText().equalsIgnoreCase("Date Pickers")) {
				date.click();
				break;
			}
		}
		outputURL=driver.getCurrentUrl();
		Assert.assertEquals(outputURL, inputURL, "Navigated Page Is Not Correct");
	}
	@Test(description="Radio Button Demo Page")
	public void radioButtonDemo() {
		String output,input="https://selenium.obsqurazone.com/radio-button-demo.php";
		List<WebElement>radioButton=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement button:radioButton) {
			if(button.getText().equals("Radio Buttons Demo")) {
				button.click();
				break;
			}
			
		}
		output=driver.getCurrentUrl();
		Assert.assertEquals(output, input, "Not Navigated To The Page");
		
	}
	
}
