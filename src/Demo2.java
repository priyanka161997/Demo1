import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	String parent=driver.getWindowHandle();
	System.out.println("parent"+parent);
	Set<String>winshandle=driver.getWindowHandles();
	System.out.println(winshandle.getClass());
	//winshandle.remove(parent);
	for(String win:winshandle)
	{
		System.out.println("child"+win);
		driver.switchTo().window(win);
		driver.close();
	}
}
}
