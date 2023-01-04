package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Locators extends Base {
	@Test(priority=2)
	//(description="Locating by Id Amazon site")
	public void locatingById() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max case");
		driver.findElement(By.id("nav-search-submit-button")).click();	
		driver.findElement(By.id("nav-top"));
	}
	@Test(description="LocatingByClass for obsqura site")
	public void classLocator() {
		driver.findElement(By.className("top-logo"));	
	}
	@Test(description="LocatingByClass for amazone site")
	public void classLocatorAmazone() {
		driver.findElement(By.className("hm-icon-label")); 
	}
	@Test(priority=0)//(description="Location By name")
	public void locatingByName() {
		driver.findElement(By.name("crid"));
		driver.findElement(By.name("site-search"));
	}
	@Test(description="Locating By CSS Selector with ID")
	public void locatingByCssWithId() {
		driver.findElement(By.cssSelector("#nav-search-submit-button"));
		driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	}
	@Test(description="Locating By CSS Selector with Class")
	public void locatingByCssWithClass() {
		driver.findElement(By.cssSelector(".hm-icon-label"));
		driver.findElement(By.cssSelector(".nav-logo-locale"));
	}
	@Test(description="Locating By CSS Selector with Tag#Id")
	public void locatingByCssWithTagId() {
		driver.findElement(By.cssSelector("span#nav-search-submit-text"));
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		driver.findElement(By.cssSelector("a#nav-top"));
	}
	@Test(description="Locating By CSS Selector With Tag.class")
	public void locatingByCssWithTagClass() {
		driver.findElement(By.cssSelector("span.hm-icon-label"));
		driver.findElement(By.cssSelector("a.skip-link"));
		driver.findElement(By.cssSelector("span.nav-logo-locale"));
	}
	@Test(description="Locating By TagName")
	public void locatingByTagName() {
		driver.findElement(By.tagName("span"));
	}
	@Test(description="Css Tag and Attribute")
	public void locatingByCssAttribute() {
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));	
	}
	/*@Test(description="Css Tag,class and attribute")
	public void locatingByTagClassAttribute() {
		
	}*/
	@Test(description="Xpath")
	public void locatingByXpath() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}
	@Test(description="Xpath By Text using indexing")
	public void locatingByXpathText() {
		driver.findElement(By.xpath("(//span[text()='All'])[1]"));
	}
	@Test(priority=1)//(description="Locating using xpath next amazon page(moblie link)")
	public void locatingByXpathMobliePage() {
		driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		driver.findElement(By.xpath("//img[@class='nav-categ-image']"));
		driver.findElement(By.xpath("//a[@href=\"/b/?_encoding=UTF8&node=1389401031&ref_=sv_top_elec_mega_1\"]"));
		driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		driver.findElement(By.xpath("(//img[@style=\"max-width:100%;max-height:100%;\"])[2]"));
		driver.findElement(By.xpath("(//span[@dir=\"auto\"])[2]"));
		driver.findElement(By.xpath("//meta[@name=\"description\"]"));
		driver.findElement(By.xpath("//meta[@content='buy mobiles online, buy smart phones online, dual sim phones, windows phone, android phones, touch screen phone, mobile phone accessories, amazon, amazon india']"));
		driver.findElement(By.xpath("//select[@title=\"Search in\"]"));
		driver.findElement(By.xpath("//option[@value=\"search-alias=jewelry\"]"));
		driver.findElement(By.xpath("//span[text()='Category']"));
		driver.findElement(By.xpath("//a[text()='Amazon Global Selling']"));
		driver.findElement(By.xpath("//span[text()='SIM Cards']"));
		driver.findElement(By.xpath("//span[text()='See all results']"));
	}
	@Test(description="link text")
	public void locatingByLinkText() {
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		driver.findElement(By.partialLinkText("Radio Buttons")).click();
	}
	@Test(description="Partial link text")
	public void locatingByPartialLinkText() {
		driver.findElement(By.partialLinkText("Radio Buttons")).click();
	}
	/*@Test(description="Using 'Contains' in xpath")
	public void contains() {
		driver.findElement(By.xpath("//input[contains(@id,'single-input')]")).sendKeys("Apple");
	}
	@Test(description="Using 'Contains' with text() in xpath")
	public void containsTextof() {
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
	}
	@Test(description="Using 'OR' in xpath")
	public void usingOR() {
		driver.findElement(By.xpath("//input[@id='single-input-field'or@placeholder='Message']")).sendKeys("Orange");
	}
	@Test(description="Using 'AND' in xpath")
	public void usingAND() {
		driver.findElement(By.xpath("//div[@id='message-one'and@class='my-2']")).getText();
	}*/
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
		String inputText ="Text of Example", outputMessage;
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]")).sendKeys(inputText);
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		String expectedMessage = "Your Message : "+inputText;
		Assert.assertEquals(outputMessage, expectedMessage, "Actual and Expected Show Text messages are different");
	}
	public void tableRowLocate() {
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> rowElements = driver.findElements(By.xpath("//div[@class='row']"));
		int rowCount = rowElements.size();
	}
}
