
Excelutils

package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public excelutils(String excelpath, String sheetname) 
	{ 
		try {
			System.getProperty("user.dir");
			workbook = new XSSFWorkbook("/home/am-pc-46/eclipse-workspace/external/Excel/file.xlsx");
			sheet= workbook.getSheet("Sheet1");
		}
		catch (Exception e) {
			e.printStackTrace();

		}

	}


	public static void main(String[] args) {
		getRowCount();
		getCelldataString(0,0);
		getCelldataNumber(1,1);
		getColCount();
	}


	public static int getRowCount() {
		int rowcount = 0;
		
		try {


			rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows:"+rowcount);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}return rowcount;
		
	} 
	public static String getCelldataString(int rowNum,int colNum) {
		String cellData = null;
		try {


		 cellData =sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}return cellData;
	}

	public static void getCelldataNumber(int rowNum,int colNum) {
		try {


			double cellData =sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}
	
	public static int getColCount() {
		int colcount=0;
		
		try {
		
			colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of col :"+colcount);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}return colcount;
	} 
}



Excelutilsdemo

package utils;

import java.io.IOException;

public class excelutilsdemo {
	
	public static void main(String[] args) throws IOException{
		
		 String path=System.getProperty("user.dir");
		excelutils excel = new excelutils(path+"/Excel/file.xlsx","Sheet1");

		excel.getRowCount();
		excel.getColCount();
		excel.getCelldataString(0,0);
		excel.getCelldataNumber(0,0);
		
	}

}




Dataprovider


package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setuptest() {
		
	System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
	driver = new ChromeDriver();
	}

	@Test(dataProvider="test1data")

	public void test1 (String username, String password) throws Exception{
		System.out.println(username+" | "+password);
		
		   driver.get("https://www.saucedemo.com/");
		   driver.findElement(By.id("user-name")).sendKeys(username);
		   driver.findElement(By.id("password")).sendKeys(password);
		   Thread.sleep(2000);
	}

	@DataProvider(name="test1data")
	public  Object[][] getdata() {
		String excelPath = "/home/am-pc-46/eclipse-workspace/external/Excel/file.xlsx";
		Object data[][]=testdata(excelPath, "Sheet1");
		return data;

	}


	public  Object[][] testdata(String excelPath, String sheetname) {

		excelutils excel = new excelutils(excelPath,"sheet1");

		int rowcount = excel.getRowCount();
		int colcount = excel.getColCount();

		Object data[][]= new Object [rowcount-1][colcount];

		for(int i=1; i<rowcount; i++) {
			for(int j=0; j<colcount; j++) {
				String celldata = excel.getCelldataString(i,j);

				System.out.print(celldata+" | ");
				data[i-1][j]= celldata;
			} System.out.println();
		}return data;
	} 
}




