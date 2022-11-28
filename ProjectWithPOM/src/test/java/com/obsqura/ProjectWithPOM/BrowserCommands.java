package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

public class BrowserCommands extends Base{
	String actualBrowserTitle,actualBrowserURL;

	@Test
	public void browserCommands() {
		actualBrowserTitle = driver.getTitle();
		actualBrowserURL = driver.getCurrentUrl();
	}

}
