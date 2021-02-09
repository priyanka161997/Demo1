import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement username= driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	System.out.println("username is:"+username.getText());
	WebElement password=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	System.out.println("password is:"+password.getText());
	WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
	user.sendKeys(username.getText());
	WebElement pass=driver.findElement(By.xpath("//input[@name='pwd']"));
	pass.sendKeys(password.getText());
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	WebDriverWait ww=new WebDriverWait(driver,20);
	ww.until(ExpectedConditions.titleContains("ENTER"));
	
	driver.findElement(By.id("logoutLink")).click();
}
}
