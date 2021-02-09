package Demo.testngDemo.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Demo3 extends Demo2{
	@Test
	public void tc_1() throws Exception {

		WebElement search =driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("java",Keys.ENTER);
		System.out.println("tc1....!");
	}
	@Test
	public void tc_2() throws Exception {
		
		WebElement search =driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("testng",Keys.ENTER);
		System.out.println("tc2....!");
	}
}
