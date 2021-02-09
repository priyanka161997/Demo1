import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragging {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(10000);
	WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(f);
	Thread.sleep(10000);
	WebElement ele1=driver.findElement(By.id("draggable"));
	WebElement ele2=driver.findElement(By.id("droppable"));
	Actions a=new Actions(driver);
	a.dragAndDrop(ele1,ele2 ).build().perform();
	WebElement b=driver.findElement(By.xpath("//p[contains(.,'Dropped!')]"));
	System.out.println(b.getText());
}
}
