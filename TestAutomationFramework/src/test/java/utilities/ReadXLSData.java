   package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLSData {


	@DataProvider(name="bvtdata")
		public String[][] getData(Method m) throws EncryptedDocumentException, IOException
			
			
			{
		String excelSheetName=m.getName();
File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");  // file read loaction

FileInputStream fr=new FileInputStream(f); // class will create new insatance provide ref to read
Workbook wb=WorkbookFactory.create(fr);  // which workbook we will work on ex excel or wordbook

Sheet sheetname=wb.getSheet(excelSheetName); // able to reach sheet 

// put the logic of row and colomn

int totalrow=sheetname.getLastRowNum(); // get total row and colum whcih have data prasent on sheet and will update bs on data chnage
System.out.println(totalrow);

Row rowcell= sheetname.getRow(0);
System.out.println(rowcell);

int totalcol=rowcell.getLastCellNum();
System.out.println(totalcol);

//data format to read logic and print the logic

DataFormatter format=new DataFormatter();
String testData[][]=new String[totalrow][totalcol];
for(int i=1; i<=totalrow; i++ ) {
	for(int j=0; j<totalcol; j++) {
		
 	testData[i-1][j]=	format.formatCellValue(sheetname.getRow(i).getCell(j));
 	System.out.println(testData[i-1][j]);
	}
	

}
return testData;














		}			

}
