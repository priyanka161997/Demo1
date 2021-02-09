package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	Thread.sleep(10000);
	WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
	search.sendKeys("rings",Keys.ENTER);
	
	
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"Price-form\"]/span"))).build().perform();
	List<WebElement> price=driver.findElements(By.xpath("/html/body/div"));
	System.out.println(price.size());
	driver.close();
}
}
