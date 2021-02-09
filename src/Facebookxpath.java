import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email =driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("priyanka21@3");
		WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("1234");
		WebElement login=driver.findElement(By.xpath("//button[@value='1']"));
		login.click();
		driver.findElement(By.linkText("Log In"));
		driver.findElement(By.linkText("Forgotten password?")).click();
		System.out.println(driver.getTitle());
	}
}
