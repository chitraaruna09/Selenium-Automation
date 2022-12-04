package com.obsqura.TestNGAssignments;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorsAxesMethodsSample extends Base{
	@Test(description ="Axes Using Contains")
	public void locateAxesUsingContains() {
		String inputText="Hi, Welcome",outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]")).sendKeys(inputText);
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message : "+inputText;
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	@Test(description ="Axes Using Text()")
	public void locateAxesUsingText() {
		String outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message :";
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	@Test(description ="Axes Using OR")
	public void locateAxesUsingOR() {
		String inputText ="Selenium Automation", outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//input[@id='single-input-field' or @placeholder='Message']")).sendKeys(inputText);
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message : "+inputText;
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	@Test(description ="Axes Using AND")
	public void locateAxesUsingAND() {
		String inputText ="Automating the Form", outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field']")).sendKeys(inputText);
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message : "+inputText;
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	
	@Test(description ="Axes Using Starts-With()")
	public void locateAxesUsingstartsWith() {
		String inputText ="Starts-With Example", outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]")).sendKeys(inputText);
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message : "+inputText;
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	
	@Test(description ="Axes Using Text()")
	public void locateAxesText() {
		String outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//label[text()='Enter Message']"));
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message :";
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
		
	}

	@Test(description ="Axes Using Child()")
	public void locateAxesChild() {
		String outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']"));
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message :";
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
		
	}
	
	@Test(description ="Axes Using Parent()")
	public void locateAxesParent() {
		String outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message :";
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	
	@Test(description ="Axes Using Ancestor()")
	public void locateAxesAncestor() {
		String outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div[@class='container page']"));
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message :";
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	@Test(description ="Axes Using Folowing()")
	public void locateAxesFollowing() {
		String outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//input[@id='single-input-field']//following::div[@id='message-one']"));
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message :";
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	
	@Test(description ="Axes Using Preceding()")
	public void locateAxesPreceding() {
		String outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::header"));
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message :";
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	
	@Test(description ="Axes Using Following-sibling()")
	public void locateAxesFollowingSibling() {
		String outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//label[text()='Enter Message']//following-sibling::input"));
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message :";
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	
	@Test(description ="Axes Using Self()")
	public void locateAxesSelf() {
		String outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//label[text()='Enter Message']//self::label"));
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message :";
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
}
