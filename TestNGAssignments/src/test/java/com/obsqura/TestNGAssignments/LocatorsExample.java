package com.obsqura.TestNGAssignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsExample extends Base{
	
	@Test(description ="Locate elements by XPath ID")
	public void locateUsingXPathID() {
		driver.navigate().to("https://www.amazon.in/Baby/b/?ie=UTF8&node=1571274031&ref_=nav_cs_baby");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Playmat");
	}
	@Test(priority =1) //(description = "Locate elements by XPath using Class Name")
	public void locateXPathClassName() {
		driver.navigate().to("https://www.amazon.in/s/ref=QANav11CTA_en_IN_4?pf_rd_r=DME2XP3S7GFH3YFDKAZB&pf_rd_p=f698a967-cb45-414a-90eb-9e74b772ed40&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s=merchandised-search-7&pf_rd_t=&pf_rd_i=1571274031&rh=n%3A1571274031%2Cn%3A%211571275031%2Cn%3A1953359031%2Cn%3A1953360031%2Cn%3A8360545031&bbn=1953360031");
		driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
	}
	@Test(priority = 0)//(description = "Locate elements by XPath using Name")
	public void locateXPathName() {
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chitraaruna09@gmail.com");
	}
	@Test(priority =2) //(description = "Locating CSS Selector by Class")
	public void locateCSSSelectorClass() {
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.cssSelector(".nav-search-field "));
	}

}
