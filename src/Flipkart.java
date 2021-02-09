import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone",Keys.ENTER);
	driver.findElement(By.xpath("//a[@title='Apple iPhone SE (Black, 64 GB) (Includes EarPods, Power Adapter)']")).click();
}
}
