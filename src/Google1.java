import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> menu=driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul"));
		for(WebElement menuname:menu)
		{
			System.out.println(menuname.getText());
		}
	}

}
