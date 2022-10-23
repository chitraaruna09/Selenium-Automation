package com.obsqura.SeleniumCourseAssignments;
import com.obsqura.SeleniumCourseAssignments.URLLoading;

public class BrowserCommonCommands extends URLLoading{
	String actualBrowserURL, actualBrowserTitle;
	
	public void browserCommands() {
		actualBrowserTitle = driver.getTitle();
		System.out.println(" Actual Title is : " +actualBrowserTitle);
		actualBrowserURL = driver.getCurrentUrl();
		System.out.println(" Actual URL is : " +actualBrowserURL);
	}

	public static void main(String[] args) {
		BrowserCommonCommands obj = new BrowserCommonCommands();
		obj.initializeBrowser();
		obj.browserCommands();
		obj.browserClose();
	}

}
