package com.obsqura.ProjectWithPOM;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import constants.Constants;

public class Base {
	public  WebDriver driver;
	public Properties prop,prop1;
	public FileInputStream fs,fs1;
	//user defined method
	@BeforeMethod
		public  void initializeBrowser() {
			prop=new Properties();
			try {
				fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.CONFIGfILE);
	
			} catch (Exception e) {
			// TODO: handle exception
			}
			try {
				prop.load(fs);
			} catch (Exception e) {
			// TODO: handle exception
			}
			prop1=new Properties();
	
			try {
				fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.TESTDATAFILE);
	
			} catch (Exception e) {
			// TODO: handle exception
			}
			try {
				
				prop1.load(fs);
			} catch (Exception e) {
			// TODO: handle exception
			}
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();// driver instantiation
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize(); // window maximizing command
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //this is deprecated
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
