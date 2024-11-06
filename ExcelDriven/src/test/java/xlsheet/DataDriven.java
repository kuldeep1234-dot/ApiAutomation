package xlsheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("C://Users//Netizens//Desktop//Worksheet//Worksheet.xlsx");
	
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		int sheets = workbook.getNumberOfSheets();
		for(int i=0; i<=sheets;i++)
		{
			if(workbook.getSheetName(sheets).equalsIgnoreCase("TestData"));
			XSSFSheet sheet= workbook.getSheetAt(i);
			int column =0;
			int k=0;
			Iterator<Row> rows=  sheet.iterator();
			Row firstrow= rows.next();
			Iterator <Cell> ce = firstrow.cellIterator();
			while(ce.hasNext())
			{
				Cell value = ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCases"));
			
			
				column=k;
			
			k++;
		}
		
		System.out.println(column);
		
		while(rows.hasNext())
		{
			Row r =rows.next();
			if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"));
			{
				Iterator<Cell> c =r.cellIterator();
				while(c.hasNext())
				{
					System.out.println(c.next().getStringCellValue());
				}
			}
		}
	}
	

}
}