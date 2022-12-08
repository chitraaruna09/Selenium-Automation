package com.obsqura.TestNGSample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserCommands extends Base {
	@Test
	public void firstPageTitle() {
		String actualTitle,ExpTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, ExpTitle);
		}
	@Test
	public void firstPageURL() {
		String actualURL,expectedURL="https://www.amazon.in/";
		actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	@Test
	public void verifyTitle() {
		String actualTitle,expectedTitle="Amazon Sign In";
		actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void verifyURL() {
		String actualURL,expectedURL="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	public void pageSource() {
		String actualSource,expectedSource="sign";
		actualSource=driver.getPageSource();
		Assert.assertTrue(actualSource.contains(expectedSource), "Page Source Not Found");
	}
	@Test
	public void loginPageNavigation() {
		String loginTitle;
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		loginTitle=driver.getTitle();
		Boolean verifyTitle=loginTitle.equals("Amazon Sign In");
		Assert.assertTrue(verifyTitle, "Not the same page");
	}
	//@Test
	/*public void navigateCommands(){
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}*/
}
