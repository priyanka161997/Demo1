package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");

	WebElement username= driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	System.out.println("username is:"+username.getText());
	WebElement password=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	System.out.println("password is:"+password.getText());
	WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
	user.sendKeys(username.getText());
	WebElement pass=driver.findElement(By.xpath("//input[@name='pwd']"));
	pass.sendKeys(password.getText());
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	WebElement n=driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[4]/div/div[1]/div/div"));
	n.click();
	WebElement m=driver.findElement(By.xpath("//*[@id=\"popup_menu_support\"]/div[2]/div[3]/ul/li[6]/a"));
	System.out.println(m.getText());
	m.click();
}
}
