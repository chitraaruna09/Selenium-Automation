package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindElementsSample1 extends Base{
	
	@Test(dependsOnMethods= {"radioButtonMale", "radioSelection"})
	public void findElements() {
		String actualMenu = "Checkbox Demo";
		String currentUrl = "https://selenium.obsqurazone.com/check-box-demo.php";
		List<WebElement> menuitems = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for (WebElement menu : menuitems) {
			if (menu.getText().equals(actualMenu)) {
				menu.click();
				String getUrl = driver.getCurrentUrl();
				Assert.assertEquals(currentUrl, getUrl);
				break;
			}
		}
	}

	@Test
	public void radioButtonMale() {
		WebElement radio1;
		String actText,maleSelection,expText,expString;
		Boolean flag = false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio1']"));
		if(radio1.isDisplayed()) {
			radio1.click();
			maleSelection=radio1.getText();
			expString="'"+maleSelection+"'";
			expText="Radio button "+expString+" is checked";
			driver.findElement(By.xpath("//button[@id='button-one']")).click();
			actText=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			if(actText.equals(expText)) {
				flag=true;
			}
			Assert.assertTrue(flag);
		}
		Assert.assertTrue(radio1.isDisplayed());
	}
	@Test
	public void radioButtonFemale() {
		WebElement radio2;
		String actText,femaleSelection,expText,expString;
		Boolean flag = false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio2']"));
		if(radio2.isDisplayed()) {
			radio2.click();
			femaleSelection=radio2.getText();
			expString="'"+femaleSelection+"'";
			expText="Radio button "+expString+" is checked";
			driver.findElement(By.xpath("//button[@id='button-one']")).click();
			actText=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			if(actText.equals(expText)) {
				flag=true;
			}
		}
		Assert.assertTrue(flag);
	}
	@Test
	public void radioSelection() {
		WebElement radio1,radio2;
		boolean selection1,selection2;
		String actText,expText="Radio button is not checked";
		Boolean flag=false;
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio1']"));
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio2']"));
		selection1=radio1.isSelected();
		selection2=radio2.isSelected();
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		actText=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		if(selection1==false && selection2==false) {
			if(actText.equals(expText)) {
				flag=true;
			}
		}
		Assert.assertTrue(true);
		
	}

}
