package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertForEnterKeys {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("promtButton")).click();
	
	Alert a=driver.switchTo().alert();
	
	a.sendKeys("priyanka");
	
	System.out.println(a.getText());
	a.dismiss();
}
}
