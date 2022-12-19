package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	public static void sendKeyValue(WebDriver driver,WebElement element,String inputString) {
		element.sendKeys(inputString);
	}
	@DataProvider(name="DataProvider FormData")
	public static Object[][] getDataFromFormData(){
		return new Object[][] {
			{"Nirmal","Das","nirmal555","Kochi","Kerala","682030"},
			{"Aruna","A","chitraaruna09","Pathanamthitta","Kerala","689664"}
		};
	}
}
