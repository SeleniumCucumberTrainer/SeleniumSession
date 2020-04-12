package DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReading {
	
	Xls_Reader excel;

	public static void main(String[] args) throws IOException, InvalidFormatException {

		
		readData();
		
		
		/*File file = new File("C:\\Jar\\testData.xlsx");

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		for (int i = 0; i < 3; i++) {
            // i=2
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < 2; j++) {
				XSSFCell cell = row.getCell(j);

				System.out.print(cell.getStringCellValue()+"   ");
			}
			
			System.out.println();
		}*/

	}
	
    public void getDataFromExcel(String path) throws IOException{
    	
    	File file = new File(path);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
            // i=2
			XSSFRow row = sheet.getRow(i);
			
			//row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				XSSFCell cell = row.getCell(j);

				System.out.print(cell.getStringCellValue()+"   ");
			}
			
			System.out.println();
		}

    }
    
    public static void readData(){
    	
    	Xls_Reader excel = new Xls_Reader("C:\\Jar\\testData.xlsx");
    	
    	String userId = excel.getCellData("GmailData", "UserId", 4);
    	String password = excel.getCellData("GmailData", "Password", 4);
    	
    	String test = excel.getCellData("GmailData", 0, 1);
    	
    	System.out.println(test);
    	
    	//System.out.println(userId);
    	//System.out.println(password);
    }
    
    @DataProvider
    public Object[][] getData(){
    	
          
            int colCount = excel.getColumnCount("GmailData");
            int rowNum = excel.getRowCount("GmailData");
           
            Object[][] data = new Object[rowNum-1][colCount];
            // Object[][] data = new Object[2][2]
            
            
            for(int i=2; i<=rowNum; i++){
            	
                for(int j= 0; j<colCount; j++){
                	
                    data[i-2][j]=excel.getCellData("GmailData", j, i);
                    
                }
            }
           
            return data;
        }
    

}
