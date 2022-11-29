package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilitySample {
	XSSFSheet sheet;
	Row rows;
	int i,j;
	public ExcelUtilitySample(int i, int j) {
		this.i=i;
		this.j=j;

		}
	public ExcelUtilitySample() throws IOException {
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\SelectPageTestData.xlsx");
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
