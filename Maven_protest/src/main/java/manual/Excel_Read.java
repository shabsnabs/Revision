package manual;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	XSSFSheet sheet;
//	public static void main(String[] args) {
	Excel_Read() throws InvalidFormatException, IOException	{
	
//	File file = new File("iCloud Drive⁩\\Desktop⁩\\excelnew.xlsx");
		FileInputStream file = new FileInputStream("/Users/shabana/Documents/read/excelnew.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	sheet = workbook.getSheet("Sheet1");
	}
	public void read() {
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(1);
		System.out.println(cell.getNumericCellValue());
}
	public static void main(String args[]) throws InvalidFormatException, IOException {
		ExcelRead ex = new ExcelRead();
//		ex.read();
		//System.out.println(System.getProperty("user.home" + File.separator + "Documents" + File.separator + "read"));
	}
	
}
