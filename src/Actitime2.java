import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	WebElement username= driver.findElement(By.xpath("//b[contains(.,'admin')]"));
	System.out.println("username is:"+username.getText());
	WebElement password=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	System.out.println("password is:"+password.getText());
	WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
	user.sendKeys(username.getText());
	WebElement pass=driver.findElement(By.xpath("//input[@name='pwd']"));
	pass.sendKeys(password.getText());
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(10000);
	WebElement n=driver.findElement(By.xpath("//div[@class='addTasksImg']"));
	n.click();
	
}
}
