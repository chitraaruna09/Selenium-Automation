package com.obsqura.TestNGSample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
        }
	public void browserClose() {
		driver.close();
	}
	@AfterMethod
	public void browseQuit() {
		driver.quit();
	}
}
