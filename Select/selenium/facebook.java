package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.id("u_0_2")).click();
	Thread.sleep(1000);
	WebElement day=driver.findElement(By.id("day"));
	Select sday=new Select(day);
	List<WebElement> sopt=sday.getOptions();
	for(WebElement opt:sopt) {
		System.out.println(opt.getText());
		Thread.sleep(1000);
	}
	WebElement month=driver.findElement(By.id("month"));
	Select smonth=new Select(month);
	if(smonth.isMultiple()) {
	System.out.println(smonth.getFirstSelectedOption().getText());
	List<WebElement> a=smonth.getAllSelectedOptions();
	for(WebElement a1:a) {
		System.out.println(a1.getText());
	}
	}
	Thread.sleep(1000);
}
}
