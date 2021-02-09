package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	Thread.sleep(10000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	/*js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(10000);
	js.executeScript("window.scrollBy(0,-1000)");*/
	/*js.executeAsyncScript("window.scrollBy(500,0)");
	Thread.sleep(10000);
	js.executeAsyncScript("window.scrollBy(-200,0)");
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(1000);*/
	WebElement ss=driver.findElement(By.xpath("//h2[contains(.,'Stand for Handmade')]"));
	js.executeScript("arguments[0].scrollIntoView()",ss );
}
}
