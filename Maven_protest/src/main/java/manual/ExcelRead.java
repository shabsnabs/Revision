package manual;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelRead {
	static XSSFSheet sht;
//	static XSSFSheet row;

	ExcelRead() throws InvalidFormatException, IOException {

		File obj = new File("/Users/shabana/eclipse-workspace/Maven_protest/Untitled spreadsheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(obj);
		sht = wb.getSheet("Sheet1");
//		sht = wb.get
	}

	@SuppressWarnings("incomplete-switch")
	public void read(int i, int j) {

		XSSFRow row = sht.getRow(i);
		XSSFCell cell = row.getCell(j);
		System.out.println(cell.getCellType());
		CellType type = cell.getCellType();
		switch (type) {
		case NUMERIC:
			System.out.println(cell.getNumericCellValue());
			break;
		case STRING:
			System.out.println(cell.getStringCellValue());
			break;
		}
//		public int row1() {
//			
//		}
	}
	public static void main(String args[]) throws InvalidFormatException, IOException {
		ExcelRead ex = new ExcelRead();
		int size = sht.getLastRowNum() + 1;
//		int size1 = row.getLast() + 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < 123; j++) {
				ex.read(i, j);
			}
			System.out.println("Output");
		}
	}
}
