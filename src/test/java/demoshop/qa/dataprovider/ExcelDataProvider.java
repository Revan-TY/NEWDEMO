package demoshop.qa.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import orangeHrm.qa.utils.ExcelUtil;

public class ExcelDataProvider {

//@DataProvider(name = "regdata")
// public static String[][] getData() throws IOException	
//  {
//	  int lastrow = ExcelUtil.getLastRow(ApplicationConstants.excelPath,ApplicationConstants.registerSheet);
//	 int lastcell = ExcelUtil.getLastCellNum(ApplicationConstants.excelPath,ApplicationConstants.registerSheet);
//	 
//	 String [][] values = new String [lastrow][lastcell];
//	 
//	 for(int r = 1 ;r<lastrow;r++)
//	 {
//		 for(int c=0;c<lastcell;c++)
//		 {
//			values [r][c]= ExcelUtil.getData(ApplicationConstants.excelPath,ApplicationConstants.registerSheet, r,c);
//		 }
//		 
//	 }
//	 return values;
	 
	 
 // }

	@DataProvider(name = "excelData")
	public Object[][] getData() throws IOException {

		ExcelUtil.loadExcel("./src/test/resources/TestData.xlsx", "Register");

		int rows = ExcelUtil.getRowCount();
		int cols = ExcelUtil.getCellCount(0);

		Object[][] data = new Object[rows][cols];
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cols; j++) {
			 data[i - 1][j] = ExcelUtil.getCellData(i, j);
			}
		}
		ExcelUtil.closeExcel();
		return data;
	}

	@Test(dataProvider = "excelData")
	public void testdata(String gender, String firstname, String lastname, String email, String password,
		String confirmpassword) {
		System.out.println(
		gender + " " + firstname + " " + lastname + " " + email + " " + password + " " + confirmpassword);
	}

}
