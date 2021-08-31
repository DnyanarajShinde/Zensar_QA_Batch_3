import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
public class ReadExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream(new File("C:\\Dnyanaraj\\Workspace2\\Day7\\input.xls"));
		HSSFWorkbook hb=new HSSFWorkbook(fs);
		HSSFSheet hs= hb.getSheetAt(0);
		Row[] sheet;
		for(Row row:hs)
		{
			for(Cell cell:row)
			{
				switch(cell.getCellType())
				{
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
					
				case STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				}
			}
			System.out.println();
		}
	}
}
