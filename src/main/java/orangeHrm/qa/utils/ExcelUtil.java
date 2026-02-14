package orangeHrm.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

//	public static  String getData(String ExcelPath, String SheetName,int row ,int cell) throws IOException
//	   {
//		 FileInputStream fis = new FileInputStream(ExcelPath);
//		 XSSFWorkbook book = new XSSFWorkbook(fis);
//		 XSSFSheet sheet = book.getSheet(SheetName);
//		 XSSFRow Row = sheet.getRow(row);
//		 XSSFCell Cell = Row.getCell(cell);		 
//		 String value = Cell.getStringCellValue();		 
//         book.close();	
//         fis.close();
//		 return value;		
//	   }
//	public static int getLastRow(String ExcelPath ,String SheetName) throws IOException
//	{
//		  FileInputStream fis = new FileInputStream(ExcelPath);
//	      XSSFWorkbook book = new XSSFWorkbook(fis);
//	      XSSFSheet sheet = book.getSheet(SheetName);
//	      book.close();
//	      fis.close();
//	      return sheet.getLastRowNum();		
//	}
//	
//	public static short getLastCellNum(String ExcelPath , String SheetName ) throws IOException
//	{
//		  FileInputStream fis = new FileInpOutStream(ExcelPath);
//	      XSSFWorkbook book = new XSSFWorkbook(fis);
//	      XSSFSheet sheet = book.getSheet(SheetName);
//	      book.close();
//	      fis.close();
//	      return   sheet.getRow(0).getLastCellNum();
//	}
//	
	private static FileInputStream fis;
	private static XSSFWorkbook book;
	private static XSSFSheet sheet;

	public static void loadExcel(String ExcelPath, String sheetname) {
		try {
			fis = new FileInputStream(ExcelPath);
			book = new XSSFWorkbook(fis);
			sheet = book.getSheet(sheetname);
		} catch (IOException e) {
			System.out.println("Excel not found");
		}
	}

	public static String getCellData(int rowNum, int cellNum) {
		XSSFRow row = sheet.getRow(rowNum);
		if (row == null)
			return "row is null";
		XSSFCell cell = row.getCell(cellNum);
		if (cell == null)
			return "cell is null";
		DataFormatter format = new DataFormatter();
		return format.formatCellValue(cell);
	}

	public static int getRowCount() {
		return sheet.getLastRowNum();
	}

	public static int getCellCount(int rowNum) {
		XSSFRow row = sheet.getRow(rowNum);
		return row == null ? 0 : row.getLastCellNum();
	}

	public static void closeExcel() throws IOException {
		book.close();
		fis.close();
	}
	
	
	
	
	
	
	
	
}
