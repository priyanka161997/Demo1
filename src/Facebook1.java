import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//by using tag & id combination
	driver.findElement(By.cssSelector("#email")).sendKeys("devil");
	
	//by using tag & class
	driver.findElement(By.cssSelector(".inputtext _55r1 _6luy")).sendKeys("123");
	
	//by using tag & attributes
	//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("smith");
}
}
