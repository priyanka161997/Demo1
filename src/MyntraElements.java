import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraElements {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		List<WebElement> menu=driver.findElements(By.xpath("//div[@class='desktop-navContent']/div"));
		for(WebElement menuname:menu)
		{
			System.out.println(menuname.getText());
		}
	}		
}
