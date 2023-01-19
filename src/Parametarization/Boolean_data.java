package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean_data 
{
	public static void main(String[] args) throws Throwable
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Documents\\17sep.xlsx");
		boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(4).getBooleanCellValue();
		System.out.println(data);
		
	}

}
