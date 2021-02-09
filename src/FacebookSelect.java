import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSelect {
public static void main(String[]args) throws InterruptedException {
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
		WebElement female=driver.findElement(By.xpath("//label[text()='Female']"));
		Thread.sleep(1000);
		if(female.isDisplayed())
			female.click();
		Thread.sleep(20000);
		System.out.println(female.isSelected());
		System.out.println(female.getCssValue("background-color"));
		System.out.println(female.getRect().getPoint());
		System.out.println(female.getLocation());
		Point loc=female.getLocation();
		System.out.println("x:"+loc.getX()+"y:"+loc.getY());
}
}