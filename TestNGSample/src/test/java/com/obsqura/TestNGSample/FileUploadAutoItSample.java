package com.obsqura.TestNGSample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadAutoItSample extends Base{
	
	@Test
	public void fileUploadAutoIt() throws IOException, InterruptedException{
		driver.navigate().to("https://www.ilovepdf.com/word_to_pdf");
		WebElement selectFile=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectFile.click();	
	    Thread.sleep(5000);
	    // below line execute the AutoIT script .
	     Runtime.getRuntime().exec("C:\\Users\\Aruna\\Desktop\\AutoItexeFiles\\Fileupload.exe");		
	    
	}
		
}
