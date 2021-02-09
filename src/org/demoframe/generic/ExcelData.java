package org.demoframe.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	public static String readValue(String ExcelPath, String sheetName, String key) throws Exception {
		String val = "";
		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowcount = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {
			if (key.equalsIgnoreCase(sh.getRow(i).getCell(0).toString())) {
				val = sh.getRow(i).getCell(1).toString();
			}
		}
		return val;
	}

	public static String readCell(String ExcelPath, String sheetName, int row, int col) throws Exception {
		String val = "";
		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		val = sh.getRow(row).getCell(col).toString();
		return val;
	}

}
