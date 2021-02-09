import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
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
		WebElement head=driver.findElement(By.xpath("//td[contains(@class,'header')]"));
		System.out.println(head.getText());
		WebElement label=driver.findElement(By.xpath("//label[contains(@id,'keepLoggedInLabel')]"));
		System.out.println(label.getText());
		WebElement box=driver.findElement(By.xpath("//input[contains(@id,'keepLoggedInCheckBox')]"));
		System.out.println(box.getText());
		WebElement logo=driver.findElement(By.xpath("//div[contains(@class,'atLogoImg')]"));
		System.out.println(logo.getText());
		WebElement name=driver.findElement(By.xpath("//div[contains(@class,'atProductName')]"));
		System.out.println(name.getText());
		WebElement forward=driver.findElement(By.xpath("//a[contains(@id,'toPasswordRecoveryPageLink')]"));
		System.out.println(forward.getText());
	
	}
}
