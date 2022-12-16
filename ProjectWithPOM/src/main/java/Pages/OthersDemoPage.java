package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.WaitUtility;

public class OthersDemoPage {
	WebDriver driver;
	By fromDragAndDrop = By.xpath("//li[@class='list-group-item']//child::a[@href='drag-drop.php']");
	By fromDrag = By.xpath("//span[text()='Draggable n°1']");
	By toDrop = By.xpath("//div[@id='mydropzone']"); //div[@id='mydropzone']  //div[@id='mylist']
	By droppedListItem = By.xpath("//div[@id='mylist']//child::span");
	By tableRow = By.xpath("//th[@class='th-sm sorting_disabled']");
	By tableColumn = By.xpath("//table[@id='dtBasicExample']//child::tr");
	
	public OthersDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyDragAndDrop() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action = new Actions(driver);
		WebElement fromElement = driver.findElement(fromDrag);
		WebElement toElement = driver.findElement(toDrop);
		action.dragAndDrop(fromElement,toElement).build().perform();
		//action.dragAndDropBy(fromElement, 352, 52).build().perform();
		WaitUtility.waitForVisibilityOfElementLocated(driver, droppedListItem);
	}
	public void verifyMouseHover() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action = new Actions(driver);
		WebElement fromElement = driver.findElement(fromDragAndDrop);
		action.moveToElement(fromElement).build().perform();
		action.click(fromElement);
		//action.clickAndHold(fromElement).perform();
		//action.doubleClick(fromElement).perform();
		//action.contextClick(fromElement).perform();
	}
	public void verifyDoubleClick() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action = new Actions(driver);
		WebElement fromElement = driver.findElement(fromDragAndDrop);
		action.doubleClick(fromElement).perform();
	}
	public void verifyClickAndHold() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action = new Actions(driver);
		WebElement fromElement = driver.findElement(fromDragAndDrop);
		action.clickAndHold(fromElement).perform();
	}
	public void verifyContextClick() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action = new Actions(driver);
		WebElement fromElement = driver.findElement(fromDragAndDrop);
		action.contextClick(fromElement).perform();
	}
	public void tableRowLocate() {
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		//List<WebElement> rowElements = driver.findElements(By.xpath("//div[@class='row']"));
		List<WebElement> rowElements = driver.findElements(tableRow);
		int rowCount = rowElements.size();
	}
	public void tableColumnLocate() {
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> columnElements = driver.findElements(tableColumn);
		columnElements.size();
	}
	
}
