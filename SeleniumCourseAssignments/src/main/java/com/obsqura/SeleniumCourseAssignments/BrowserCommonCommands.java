package com.obsqura.SeleniumCourseAssignments;
import com.obsqura.SeleniumCourseAssignments.URLLoading;

public class BrowserCommonCommands extends URLLoading{
	String actualBrowserURL, actualBrowserTitle;
	
	public void browserCommands() {
		actualBrowserTitle = driver.getTitle();
		actualBrowserURL = driver.getCurrentUrl();
	}
	public void navigateBrowserCommands(){
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args){
		BrowserCommonCommands obj = new BrowserCommonCommands();
		obj.initializeBrowser();
		obj.browserCommands();
		obj.navigateBrowserCommands();
		//obj.browserClose();
		obj.browserQuit();
	}

}
