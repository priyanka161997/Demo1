package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime1 {
public static void main(String[] args) throws Exception, InvalidFormatException, IOException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	WebElement login =driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div"));
	login.click();
	FileInputStream fis=new FileInputStream("F:\\send.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.createSheet("VALIDLOGIN");
	Cell c1=sh.createRow(0).createCell(0);
	c1.setCellValue("USERNAME");
	sh.getRow(0).createCell(1).setCellValue("PASSWORD");
	sh.createRow(1).createCell(0).setCellValue("ADMIN");
	sh.getRow(1).createCell(1).setCellValue("MANAGER");
	FileOutputStream fio=new FileOutputStream("F:\\send.xlsx");
	wb.write(fio);
	System.out.println("DONE");
	wb.close();
}
}
