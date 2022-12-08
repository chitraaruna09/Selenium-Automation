package com.obsqura.ProjectWithPOM;

import org.testng.annotations.Test;

import Pages.OthersDemoPage;

public class OthersDemoTest extends Base{
	OthersDemoPage otherDempPageObj;
	
	@Test
	public void checkAndverifyDragAndDrop() {
		otherDempPageObj = new OthersDemoPage(driver);
		otherDempPageObj.verifyDragAndDrop();
	}

}
