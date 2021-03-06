import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']"));
	Actions a=new Actions(driver);
	Thread.sleep(1000);
	for(WebElement menuName:menus) {
		String mName=menuName.getText();
		System.out.println(mName);
		a.moveToElement(menuName).perform();
		Thread.sleep(10000);
	
	}
}
}
