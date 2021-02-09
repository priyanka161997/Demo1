import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	int sliderno=driver.findElements(By.className("homeslider-container")).size();
	System.out.println(sliderno);
	
	int linksno=driver.findElements(By.tagName("a")).size();
	System.out.println(linksno);
}
}
