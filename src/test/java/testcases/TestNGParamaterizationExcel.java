package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParamaterizationExcel {
	
	public static ExcelReader excel=null;
	
	@Test (dataProvider = "getData")
	public void testData(String username, String password, String is_correct) {
		System.out.println(username + "----" +password + "----" +is_correct);
	}
	
	@DataProvider
	public static Object[][] getData(){
		
		if (excel==null) {
			excel=new ExcelReader("C:\\Users\\Manish_Katepallewar\\eclipse-workspace\\TestNGLearning\\src\\test\\resources\\excel\\testingData.xlsx");
		}
		
		String sheetname="loginTest";
		int rows= excel.getRowCount(sheetname);
		int cols=excel.getColumnCount(sheetname);
		
		
		Object[][] data=new Object[rows-1][cols];
		for (int rowNum=2;rowNum<=rows;rowNum++) {
			for (int colNum=0;colNum<cols;colNum++) {
				data[rowNum-2][colNum]=excel.getCellData(sheetname, colNum, rowNum);
				System.out.println(data[rowNum-2][colNum]);
			}
		}
		
		
		
		return data;
		
	}

}
