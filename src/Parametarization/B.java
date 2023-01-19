package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B//numeric type data fetching
{
public static void main(String[] args) throws Throwable
{
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\17sep.xlsx");
	double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(data);
	}
}
