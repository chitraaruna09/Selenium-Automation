package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	XSSFSheet sheet;
	Row rows;
	int i,j;
	public ExcelUtility(int i, int j) {
		this.i=i;
		this.j=j;

		}
	public ExcelUtility() throws IOException {
		File file = new File("C:\\Users\\Aruna\\Desktop\\JAVA PGMS\\SelectPageTestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("SelectPageTestData");
		rows = sheet.getRow(0);
	}
	public String readDatFromExcel(int i, int j) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		return cell.getStringCellValue();
	}

}
