package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Actions act=new Actions(driver);
	WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
	act.contextClick(button).build().perform();
	driver.findElement(By.xpath("/html/body/ul/li[3]")).click();//right click on element
	System.out.println(driver.switchTo().alert().getText());//capture the text from alert box
	driver.switchTo().alert().accept();//close the alert box
}
}
