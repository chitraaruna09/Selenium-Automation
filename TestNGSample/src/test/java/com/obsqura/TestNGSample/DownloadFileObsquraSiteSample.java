package com.obsqura.TestNGSample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DownloadFileObsquraSiteSample extends Base{
	WebElement textAreaWidget, generateFileButton, downloadButton;
	String sourceLocation, wget_command;
	@Test
	public void downloadFile() throws InterruptedException {
		driver.navigate().to("https://selenium.obsqurazone.com/file-download.php");
		textAreaWidget = driver.findElement(By.id("textbox"));
		textAreaWidget.sendKeys("Hi All!!! Before File download click, am entered some random texts!!!");
		generateFileButton = driver.findElement(By.id("create"));
		generateFileButton.click();
		downloadButton = driver.findElement(By.id("download-file"));
		downloadButton.click();
		sourceLocation =  downloadButton.getAttribute("href");
		wget_command = "cmd /c C:\\Wget\\wget.exe -P C:\\abc --no-check-certificate " + sourceLocation;
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
