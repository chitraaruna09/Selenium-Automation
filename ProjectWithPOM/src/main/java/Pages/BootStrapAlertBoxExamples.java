package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;

public class BootStrapAlertBoxExamples {
	
	WebDriver driver;
	By btnNormalSuccess = By.xpath("//button[@id='normal-btn-success']");
	By closeBtnNormlAlert = By.xpath("//div[@class='alert alert-success alert-normal-success']//child::button");
	

	public BootStrapAlertBoxExamples(WebDriver driver) {
		this.driver = driver;
	}


	public void verifyTheNormalSuccessAlertBox() {
		WebElement BtnNormalSuccess = driver.findElement(btnNormalSuccess);
		BtnNormalSuccess.click();
		driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']//child::button")).click();
		//WebElement closeButtonNormalSuccess = driver.findElement(closeBtnNormlAlert);
		//way 2 closeButtonNormalSuccess.click();
		//PageUtility.clickOnElement(closeButtonNormalSuccess);
	}
	
}
