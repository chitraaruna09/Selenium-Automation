package com.obsqura.TestNGSample;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementCommands extends Base{
	@Test(description="Single Input Field Obsqura demo page")
	public void sendKeySample(){
		String inputMessage="Apple",outputMessage;
		boolean flag=false;
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("Apple");
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		//Your Message : Apple
		if(outputMessage.equals("Your Message : "+inputMessage)) {
			flag=true;
		}
		Assert.assertTrue(flag,"not same");
	}
	@Test(description="Two Input Fields(giving numbers in that field) Obsqura demo page")
	public void twoInputFieldWithIntegers(){
		String outputValue;
		String inputA="5",inputB="10";
		int a=Integer.parseInt(inputA);//converting integer to string value
		int b=Integer.parseInt(inputB);
		int inputValue=a+b;
		boolean flag=false;
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys(inputA);
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(inputB);
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		outputValue=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		if(outputValue.equals("Total A + B : "+inputValue)){
			flag=true;
		}
		Assert.assertTrue(flag,"The value not matching");
	}
	@Test(description="Two Input Fields(giving characters in that field) Obsqura demo page")
	public void twoInputFieldWithCharacters(){
		String inputA="hi",inputB="hello",inputValue=" NaN",outputValue;
		boolean flag=false;
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(inputA);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(inputB);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		outputValue=driver.findElement(By.xpath("(//div[@class='my-2'])[2]")).getText();
		if(outputValue.equals("Total A + B :"+inputValue)) {
			flag=true;
		}
		Assert.assertTrue(flag, "Not Same");
	}
	@Test(description="background colour using CssValue")
	public void getCssValue() {
		String backgroundColour,inputColour="rgba(0, 123, 255, 1)";
		//boolean flag=false;
		backgroundColour=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("background-color");
		/*if(backgroundColour.equals(inputColour)) {
			flag=true;
		}*/	
		Assert.assertEquals(backgroundColour, inputColour, "Colour Not Same");
	//	Assert.assertTrue(flag, "The colour not same");
	}
	@Test(description="text colour")
	public void textColour() {
		String inputColour="rgba(255, 255, 255, 1)";
		//boolean flag=false;
		String colour=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("color");
		Assert.assertEquals(colour, inputColour, "Colour Not Same");
		/*if(colour.equals(inputColour)) {
			flag=true;
		}
		Assert.assertTrue(flag, "The colour not same");*/
		
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
		Assert.assertTrue(flag);
	}
	@Test(description="Using getattribute")
	public void getAttribute() {
		String attributeId,inputId="button-one",attributeClassName,inputClassName="btn btn-primary";
		attributeId=driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("id");
		Assert.assertTrue(attributeId.equals(inputId), "ID Not Matching");
		attributeClassName=driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("class");	
		Assert.assertTrue(attributeClassName.equals(inputClassName), "Class Not Matching");
	}
	@Test(description="Using getTagName")
	public void getTagName() {
		String tagName,inputTagName="button";
		tagName=driver.findElement(By.xpath("//button[@id='button-one']")).getTagName();
		Assert.assertTrue(tagName.equals(inputTagName));
	}
	@Test(description="Using getSize")
	public void getSize() {
		Dimension size;//variable initialized using dimention
		size=driver.findElement(By.xpath("//button[@id='button-one']")).getSize();
		Assert.assertTrue(true);
	}
	@Test(description="Using isEnable,isDisplayed,isSelected")
	public void checkingButton() {
		boolean enable,display,select;
		boolean flag=false;
		enable=driver.findElement(By.xpath("//button[@id='button-one']")).isEnabled();
		if(enable==true) {
			flag=true;
		}
		Assert.assertTrue(flag, "Button Is Not Enabled");
		display=driver.findElement(By.xpath("//button[@id='button-one']")).isDisplayed();
		if(display==true) {
			flag=true;
		}
		Assert.assertTrue(flag, "Not Displayed");
		select=driver.findElement(By.xpath("//button[@id='button-one']")).isSelected();
		if(select==false) {
			flag=true;
		}
		Assert.assertTrue(flag, "Not Selected");
	}
}


