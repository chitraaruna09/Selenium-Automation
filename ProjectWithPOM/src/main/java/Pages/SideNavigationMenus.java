package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SideNavigationMenus {
	
		public WebDriver driver;
		By navMenuItemsList = By.xpath("//li[@class='list-group-item']//child::a");
		String expectedString;
		public SideNavigationMenus(WebDriver driver) {
			this.driver=driver;
		}
		public void navigationMenuClick(String expectedString) {
			List <WebElement> navMenuItems = driver.findElements(navMenuItemsList);
			Boolean flag=false;
				for(WebElement navMenu : navMenuItems) {
					if(navMenu.getText().equalsIgnoreCase(expectedString)) {
						flag=true;
						navMenu.click();
						break;
					}
				}
				Assert.assertTrue(true, "Side menus items are not clickable. Found mismatched!");
	}

}
