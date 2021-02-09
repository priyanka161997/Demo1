import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanladderFetch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	WebElement sale= driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
	System.out.println(sale.getText());
	WebElement living=driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/span"));
	System.out.println(living.getText());
	WebElement bedroom=driver.findElement(By.xpath("//li[@class='topnav_item bedroomunit']/span"));
	System.out.println(bedroom.getText());
	WebElement dining=driver.findElement(By.xpath("//li[@class='topnav_item diningunit']/span"));
	System.out.println(dining.getText());
	WebElement storage=driver.findElement(By.xpath("//li[@class='topnav_item storageunit']/span"));
	System.out.println(storage.getText());
	WebElement study =driver.findElement(By.xpath("//li[@class='topnav_item studyunit']/span"));
	System.out.println(study.getText());
	WebElement mattre =driver.findElement(By.xpath("//li[@class='topnav_item mattressesunit']/span"));
	System.out.println(mattre.getText());
	WebElement decor =driver.findElement(By.xpath("//li[@class='topnav_item decorunit']/span"));
	System.out.println(decor.getText());
}
}
