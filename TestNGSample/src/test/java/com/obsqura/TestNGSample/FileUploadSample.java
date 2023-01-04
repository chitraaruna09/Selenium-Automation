package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadSample extends Base{
	@Test
	public void fileUpload() {
		driver.navigate().to("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		WebElement uploadFileButton = driver.findElement(By.xpath("//input[@id='myFile']"));
		uploadFileButton.sendKeys("C:\\Users\\Aruna\\Downloads\\vacancylist (2).pdf");
	}

}
