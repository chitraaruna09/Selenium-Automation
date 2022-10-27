package com.obsqura.JUnitSample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BrowserCommands extends Base {
	@Test
	public void basicCommands() {
		String actualTitle, actualUrl, actualPageSource, expectedTitle = "Obsqura Testing";
		actualTitle = driver.getTitle(); // getting title of the loaded site
		// System.out.println("Actual Title is " +actualTitle);
		actualUrl = driver.getCurrentUrl(); // getting url from the website
		// System.out.println("Actual URL is: " +actualUrl);
		actualPageSource = driver.getPageSource(); // getting page source details
		// verifying the page title
		assertEquals(expectedTitle,actualTitle);//method is used for comparing the values
		assertTrue("Page Source is Not Found", actualPageSource.contains(actualPageSource));// method is used for checking the page source elements
		//assertTrue("Page Source is Not Found", actualPageSource.contains("Welcome"));// method is used for checking the page source elements, if it's failed getting the message in the AssertionError as "Page Source is not Found"
		//System.out.println(actualPageSource);
	}

	@Test
	public void navigateCommands() {
		// driver.get("https://www.amazon.in/");
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh(); // page refreshing
	}

}
