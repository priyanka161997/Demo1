import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleClear {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement search =driver.findElement(By.name("q"));
	search.sendKeys("java");
	Thread.sleep(2000);
	WebElement java=driver.findElement(By.xpath("//div[@class='sfbg']/following::input[@title='Search']"));
	System.out.println(java.getText());
	java.clear();
	WebElement search2 =driver.findElement(By.name("q"));
	search2.sendKeys("testNg");
	
}
}
