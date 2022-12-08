package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GroupRadioButtonsDemo extends Base {
	@BeforeMethod(description="Navigate To Radio Button Demo Page")
	public void navigateToRadioButtonPage() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
	}
	@Test(description="Checking HeadLine RadioButton")
	public void checkHeadline() {
		String actualHeadlineGender,actualHeadlineAge,expectedHeadlineAge="Pateints Age Group",expectedHeadlineGender="Pateints Gender";
		actualHeadlineGender=driver.findElement(By.xpath("//h4[text()='Pateints Gender']")).getText();
		Assert.assertEquals(actualHeadlineGender, expectedHeadlineGender, "HeadLine Not Correct");
		actualHeadlineAge=driver.findElement(By.xpath("//h4[text()='Pateints Age Group']")).getText();
		Assert.assertEquals(actualHeadlineAge, expectedHeadlineAge, "Headline Is Not Correct");
	}
	@Test(description="Donot Select Radio Button Click GetResult Button")
	public void radioButtonNotSelected() {
		WebElement radio1,radio2,age1,age2,age3;
		String expText="Gender :\nAge group:",ActText="";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']"));
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']"));
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']"));
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']"));
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']"));
		boolean radioButton=radio1.isSelected()&&radio2.isSelected()&&age1.isSelected()&&age2.isSelected()&&age3.isSelected();
			if(radioButton==true){
				driver.findElement(By.xpath("//button[@id='button-two']")).click();
				ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
				Assert.assertEquals(ActText, expText);
			}
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertTrue(radioButton, "Radio Buttons Are Selected");
		}
	@Test(description="Select Male Radio Button And Click GetResults Button")
	public void selectMaleRadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender Male:\nAge group:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male=driver.findElement(By.xpath("//label[@for='inlineRadio11']"));
		male.click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==true && radio2==false && age1==false && age2==false && age3==false) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(radio1==true, "Male Radio Button Is Not Selected");
		}
	    
	@Test(description="Select Female Radio Button And Click GetResults Button")
	public void selectFemaleRadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender Female:\nAge group:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//label[@for='inlineRadio21']"));
		female.click();
		radio2=female.isSelected();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==true && age1==false && age2==false && age3==false) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(radio2==true, "Female Radio Button Is Not Selected");
		}
	@Test(description="Select age1 Radio Button And Click GetResults Button")
	public void selectAge1RadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender :\\nAge group: 1 to 18:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement age1Element=driver.findElement(By.xpath("//label[@for='inlineRadio22']"));
		age1Element.click();
		age1=age1Element.isSelected();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==false && age1==true && age2==false && age3==false) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(age1==true, "Age Radio Button Is Not Selected");
		}
	@Test(description="Select age2 Radio Button And Click GetResults Button")
	public void selectAge2RadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender :\\nAge group: 19 to 44:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement age2Element=driver.findElement(By.xpath("//label[@for='inlineRadio23']"));
		age2Element.click();
		age2=age2Element.isSelected();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==false && age1==false && age2==true && age3==false) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(age2==true, "Age Radio Button Is Not Selected");
		}
	@Test(description="Select age3 Radio Button And Click GetResults Button")
	public void selectAge3RadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender :\\nAge group: 45 to 60:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement age3Element=driver.findElement(By.xpath("//label[@for='inlineRadio24']"));
		age3Element.click();
		age3=age3Element.isSelected();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		if(radio1==false && radio2==false && age1==false && age2==false && age3==true) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(age3==true, "Age Radio Button Is Not Selected");
		}
	@Test(description="Select male Radio Button,Age1 And Click GetResults Button")
	public void selectMaleAge1RadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Male\\nAge group: 1 to 18";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio11']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio22']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==true && radio2==false && age1==true && age2==false && age3==false) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(radio1==true&&age1==true, "Male & Age Radio Button Is Not Selected");
		}
	@Test(description="Select male Radio Button,Age2 And Click GetResults Button")
	public void selectMaleAge2RadioButto() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Male\\nAge group: 19 to 44";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio11']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio23']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==true && radio2==false && age1==false && age2==true && age3==false) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(radio1==true&&age2==true, "Male & Age Radio Button Is Not Selected");
		}
	@Test(description="Select male Radio Button,Age3 Button And Click GetResults Button")
	public void selectMaleAge3RadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Male\\nAge group: 45 to 60";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio11']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio24']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==true && radio2==false && age1==false && age2==false && age3==true) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(radio1==true&&age3==true, "Male & Age Radio Button Is Not Selected");
		}
	@Test(description="Select Female Radio Button,Age1 Radio button And Click GetResults Button")
	public void selectFemaleAge1RadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Female\\nAge group: 1 to 18";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio21']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio22']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==true && age1==true && age2==false && age3==false) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(radio2==true&&age1==true, "Female & Age Radio Button Is Not Selected");
		}
	@Test(description="Select Female Radio Button,Age2 Radio Button And Click GetResults Button")
	public void selectFemaleAge2RadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Female\\nAge group: 19 to 44";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio21']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio23']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==true && age1==false && age2==true && age3==false) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(radio2==true&&age2==true, "Female & Age Radio Button Is Not Selected");
		}
	@Test(description="Select Female Radio Button,Age3 Button And Click GetResults Button")
	public void selectFemaleAge3RadioButton() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Female\\nAge group: 45 to 60";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio21']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio24']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==true && age1==false && age2==false && age3==true) {
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(ActText, expText);
		}
		SoftAssert softAssert=new SoftAssert();
	    softAssert.assertTrue(radio2==true&&age3==true, "Female & Age Radio Button Is Not Selected");
		}
}



