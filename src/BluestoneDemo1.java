import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneDemo1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	Thread.sleep(20000);
	List <WebElement> menu=driver.findElements(By.xpath("//li[@id='goldCoins']"));
	Thread.sleep(10000);
	Actions a=new Actions(driver);
	for (WebElement menus:menu) {
		a.moveToElement(menus).build().perform();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//li[@id='goldCoins']/div/ul/li/div/ul/li/span[text()='20 gram']/parent::li[@class='active']/span"));
		WebElement plain=driver.findElement(By.xpath("//span[text()='20 gram']/parent::li[@class='active']/span"));
		System.out.println(plain);
	}
}
}
