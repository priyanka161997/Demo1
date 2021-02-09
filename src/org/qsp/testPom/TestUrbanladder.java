package org.qsp.testPom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.qsp.pom.SeleniumHome;

public class TestUrbanladder {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.urbanladder.com/");
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']"));
	Actions a=new Actions(driver);
	WebElement living=driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/span"));
	Thread.sleep(1000);
	a.moveToElement(living).build().perform();
	driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/div/div/ul/li[1]/div/a")).click();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/div/a[2]/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[1]/div/a[1]/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"product-title\"]/div/div[2]/a")).click();
	SeleniumHome sh=new SeleniumHome(driver);
	driver.close();
	}
}

