package com.obsqura.TestNGAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;

	// user defined method
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aruna\\eclipse-workspace\\TestNGAssignments\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();// driver instantiation
		//driver.get("http://www.opesmount.in/grocerystore1/"); // url loading; BaseUrl loading
		//driver.get("ttps://www.amazon.in");
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize(); // window maximizing command
	}

	@AfterMethod
	// browser close user defined method
	public void browserClose() {
		driver.close(); // window close command
	}

}
