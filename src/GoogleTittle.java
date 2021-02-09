import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTittle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("jave",Keys.ENTER);
	
		List<WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.println(driver.findElement(By.tagName("title")).getAttribute("textContent"));
	    System.out.println(links.size());
	    for(WebElement link:links) {
	    	if(link.getText()!=null)
	    		System.out.println(link.getText());
	    }
}
}