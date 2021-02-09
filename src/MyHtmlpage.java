import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyHtmlpage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Desktop/s.html");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.id("a"));
	Select s=new Select(ele);
	s.selectByIndex(2);
	
	WebElement ele2=driver.findElement(By.id("b"));
	Select s1=new Select(ele2);
	if(s1.isMultiple()) {
		List<WebElement> vals=s1.getOptions();
		for(WebElement val:vals) {
			s1.selectByValue(val.getText());
			Thread.sleep(1000);
		}
	}
}
}
