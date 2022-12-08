package com.obsqura.ProjectWithPOM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public  WebDriver driver;
	//user defined method
	@BeforeMethod
	public  void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();// driver instantiation
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php\\\\");
		driver.manage().window().maximize(); // window maximizing command
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //this is deprecated
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	//browser close user defined method
	public void browserClose() {
		driver.close(); //window close command
	}
	@AfterMethod
	public  void browserQuit() {
		driver.quit();
	}
}
