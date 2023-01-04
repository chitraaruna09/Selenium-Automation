package com.obsqura.TestNGSample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WindowHandlingSample extends Base{
		
		By likeUsFbButton = By.xpath("//a[@class='btn btn-primary windowSingle']");
		@Test
		public void clickLikeUsOnFBPopup() {
			driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
			driver.findElement(likeUsFbButton).click();
			String mainWindow = driver.getWindowHandle();
			Set <String> s1 = driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();
				while(i1.hasNext()) {
					String childWindow = i1.next();
					if(!mainWindow.equalsIgnoreCase(childWindow)) {
						driver.switchTo().window(childWindow);
						driver.findElement(By.xpath("//a[@aria-label='Accessible sign up button']")).click();
						driver.close();
					}
				}
				driver.switchTo().window(mainWindow);
		}

}
