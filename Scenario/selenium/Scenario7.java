package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	Thread.sleep(1000);
	WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
	search.sendKeys("rings",Keys.ENTER);
	Thread.sleep(10000);
	Actions a=new Actions(driver);
	Thread.sleep(10000);
	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"Delivery Time-form\"]/span"))).build().perform();
	List<WebElement> delivery=driver.findElements(By.xpath("//div[@class='form-item']//div[contains(@class,'form-item')]"));
	System.out.println(delivery.size());
	
}
}
