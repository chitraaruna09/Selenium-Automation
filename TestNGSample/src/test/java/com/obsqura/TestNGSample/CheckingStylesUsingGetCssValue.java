package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class CheckingStylesUsingGetCssValue extends BaseForCheckingStyles {
	@Test(description="background colour using CssValue")
	public void getCssValue() {
		String backgroundColour,inputColour="rgba(0, 123, 255, 1)";
		boolean flag=false;
		backgroundColour=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("background-color");
		if(backgroundColour.equals(inputColour)) {
			flag=true;
		}	
	}
	@Test(description="text colour")
	public void textColour() {
		String inputColour="rgba(255, 255, 255, 1)";
		boolean flag=false;
		String colour=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("color");
		if(colour.equals(inputColour)) {
			flag=true;
		}
	}
	@Test(description="Your message text place")
	public void textPlaceing() {
		boolean flag=false;
		Point location=driver.findElement(By.xpath("//button[@id='button-one']")).getLocation();
		int locationY=location.getY();
		//int locationX=location.getX();
		Point location2=driver.findElement(By.xpath("//div[@id='message-one']")).getLocation();
		int locationY2=location2.getY();
		if(locationY<locationY2) {
			flag=true;
		}
			
		
	}

}
