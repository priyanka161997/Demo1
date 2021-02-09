
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	/*WebElement email =driver.findElement(By.id("email"));
	email.sendKeys("priyanka21@3");
	WebElement password =driver.findElement(By.id("pass"));
	password.sendKeys("1234");
	WebElement login=driver.findElement(By.id("u_0_b"));
	login.click();
    */
	driver.findElement(By.linkText("Forgotten password?")).click();
	System.out.println(driver.getTitle());
}
}
