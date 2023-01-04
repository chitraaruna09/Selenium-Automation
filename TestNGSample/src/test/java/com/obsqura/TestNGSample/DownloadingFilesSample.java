package com.obsqura.TestNGSample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DownloadingFilesSample extends Base{
	 
	@Test
	public void downloadFile() throws InterruptedException {
		driver.navigate().to("http://demo.guru99.com/test/yahoo.html");
		WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		String sourceLocation = downloadButton.getAttribute("href");
		String wget_command = "cmd /c C:\\Wget\\wget.exe -P C:\\abc --no-check-certificate " + sourceLocation;
		try {
		        	Process exec = Runtime.getRuntime().exec(wget_command);
		        	int exitVal = exec.waitFor();
		        	System.out.println("Exit value: " + exitVal);
		        } catch (IOException ex) {
		        	System.out.println(ex.toString());
		        }
					driver.close();
		}
}
