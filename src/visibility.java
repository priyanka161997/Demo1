import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class visibility {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Desktop/VisibilityOfTextbox.html");
	WebDriverWait ww=new WebDriverWait(driver,20);
	ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("iamtextbox"))));
	driver.findElement(By.id("iamtextbox")).sendKeys("priyanka");
}
}
