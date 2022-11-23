package com.obsqura.TestNGAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiSelectDeselectDropDown extends Base{
	@Test
	public void multiSelectDropDown() {
		WebElement dropdownSates;
		String listState1, listState2, listState10;
		List<String> expectedItems=new ArrayList<String>();
		List<String> actualItems=new ArrayList<String>();
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		dropdownSates = driver.findElement(By.xpath("(//select[@class='js-states-multiple form-control select2-hidden-accessible'])"));
		Select objSelect = new Select(dropdownSates);
			if(objSelect.isMultiple()) {
				objSelect.selectByIndex(1);
				objSelect.selectByIndex(2);
				objSelect.selectByIndex(7);
				List <WebElement> statesDropdown=objSelect.getOptions();
				listState1= statesDropdown.get(1).getText();
				listState2= statesDropdown.get(2).getText();
				listState10=statesDropdown.get(7).getText();
				
				expectedItems.add(listState1);
				expectedItems.add(listState2);
				expectedItems.add(listState10);
		}
		List <WebElement> selectedOptions= objSelect.getAllSelectedOptions();
		actualItems.add(selectedOptions.get(0).getText());
		actualItems.add(selectedOptions.get(1).getText());
		actualItems.add(selectedOptions.get(2).getText());
				if(expectedItems.equals(actualItems)) {
					Assert.assertTrue(true, "Selected dropdown values and expected values are not same");
				}
					Assert.assertFalse(false);
					objSelect.deselectAll();
			Assert.assertTrue(true, "Dropdown field is not cleared");
	}
}
