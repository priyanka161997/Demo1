package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreatDate {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("F:\\write.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.createSheet("VALIDLOGIN");
	Cell c1=sh.createRow(0).createCell(0);
	c1.setCellValue("USERNAME");
	sh.getRow(0).createCell(1).setCellValue("PASSWORD");
	sh.createRow(1).createCell(0).setCellValue("ADMIN");
	sh.getRow(1).createCell(1).setCellValue("MANAGER");
	FileOutputStream fio=new FileOutputStream("F:\\write.xlsx");
	wb.write(fio);
	System.out.println("DONE");
	wb.close();
}
}
