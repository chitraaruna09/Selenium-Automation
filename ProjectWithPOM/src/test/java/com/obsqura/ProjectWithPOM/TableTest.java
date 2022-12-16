package com.obsqura.ProjectWithPOM;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.CommonHeaderMenusPage;
import Pages.TablePage;

public class TableTest extends Base{

	TablePage tablePageObj;
	CommonHeaderMenusPage commonHeaderMenusPageObj;
	
	@Test
	public void verifyTheTableRowCount() throws IOException {
		commonHeaderMenusPageObj = new CommonHeaderMenusPage(driver);
		commonHeaderMenusPageObj.locateCommonHeaderMenus("TABLE");
		tablePageObj = new TablePage(driver);
		tablePageObj.tableRowLocate();
	}
	@Test
	public void verifyTheTableColumnCounts() {
		commonHeaderMenusPageObj = new CommonHeaderMenusPage(driver);
		commonHeaderMenusPageObj.locateCommonHeaderMenus("TABLE");
		tablePageObj = new TablePage(driver);
		tablePageObj.tableColumnLocate();
	}
}
