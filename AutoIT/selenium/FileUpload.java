package selenium;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div[2]/input")).click();
		WebElement button=driver.findElement(By.id("imagesrc"));
		Thread.sleep(20000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click();", button);
		
		Runtime.getRuntime().exec("C://AutoITFiles/FileUpload.exe"+" "+"C://Users//HP//Pictures/IMG-20201210-WA0002.jpg");

	}

}
