package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OthersDemoPage {
	WebDriver driver;
	By fromDragAndDrop = By.xpath("//li[@class='list-group-item']//child::a[@href='drag-drop.php']");
	By toDrop = By.xpath("//div[@id='mylist']");
	
	public OthersDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyDragAndDrop() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action = new Actions(driver);
		WebElement fromElement = driver.findElement(fromDragAndDrop);
		WebElement toElement = driver.findElement(toDrop);
		action.dragAndDrop(fromElement, toElement).perform();
	}
}
