import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.gmail.com/");
	WebElement id =driver.findElement(By.id("identifierId"));
	id.sendKeys("priyanka321@gmail.com");
	
	driver.findElement(By.id("identifierNext")).click();
}
}
