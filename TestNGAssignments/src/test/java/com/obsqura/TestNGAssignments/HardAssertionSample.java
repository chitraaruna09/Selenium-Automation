package com.obsqura.TestNGAssignments;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionSample extends Base {

	@Test(description = "Verifying the title of the page")
	public void verifyTitle() {
		String expectedTitle = "Grocerystore", actualTitle;
		actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle, "Expected and actual title are same");
	}

	@Test(description = "Verifying the driver returns null or not")
	public void notNullCheck() {
		Assert.assertNotNull(driver);
	}
}
