import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	Thread.sleep(10000);
	WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
	search.sendKeys("dimond ring",Keys.ENTER);
    WebElement ring1=driver.findElement(By.xpath(" //a[@id='pid_28402']/img[@class='hc img-responsive center-block']"));
    ring1.click();
    Thread.sleep(20000);
    
	Set<String>wins=driver.getWindowHandles();
	for(String win:wins)
	{
		driver.switchTo().window(win);
	}
	WebElement buynow =driver.findElement(By.xpath("//input[@id='buy-now']"));
	buynow.click();

	Thread.sleep(1000);
	System.out.println("error msg is"+buynow.getText());
	
}
}
