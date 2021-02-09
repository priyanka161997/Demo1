import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectTag {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement Creat=driver.findElement(By.xpath("//a[@id='u_0_2']"));
	System.out.println(Creat.isEnabled());
	if(Creat.isEnabled())
		Creat.click();
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.id("day"));
	Select s=new Select(ele);
	s.selectByVisibleText("9");
	Thread.sleep(2000);
	WebElement ele1=driver.findElement(By.id("month"));
	Select p=new Select(ele1);
	p.selectByIndex(6);
	Thread.sleep(2000);
	WebElement ele2=driver.findElement(By.id("year"));
	Select r=new Select(ele2);
	r.selectByIndex(6);
}
}
