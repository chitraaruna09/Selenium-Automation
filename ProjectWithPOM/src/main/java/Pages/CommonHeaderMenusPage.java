package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CommonHeaderMenusPage {
	WebDriver driver;
	By headerMenus = By.xpath("//ul[@class='navbar-nav']//child::li");
	By homeMenuItem = By.xpath("//ul[@class='navbar-nav']//child::li//a");
    String inputText;
	
	
	public CommonHeaderMenusPage(WebDriver driver) {
		this.driver = driver;
	}

	public void locateCommonHeaderMenus(String inputMessage) {
		List<WebElement> locateCommonHeaderMenus = driver.findElements(headerMenus);
		Boolean flag=false;
		for (WebElement elements: locateCommonHeaderMenus) {
			if(elements.getText().equalsIgnoreCase(inputMessage)) {
				flag=true;
				elements.click();
				break;
			}
		}
		Assert.assertTrue(true, "Common menus items are not clickable. Found mismatched!");
	}

}
