package Demo.testngDemo.qsp;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {

	@BeforeSuite
	public void bs(){
		System.out.println("Before suite");
	}
	@BeforeTest
	public void bt(){
		System.out.println("Before test");
	}
	@BeforeClass
	public void bc(){
		System.out.println("Before class");
	}
	@BeforeMethod
	public void bm(){
		System.out.println("Before method");
	}
	@Test
	public void tc1(){
		System.out.println("hi....from tc1");
	}
	@Test
	public void tc2(){
		System.out.println("hi....from tc2");
	}
	@AfterMethod
	public void am(){
		System.out.println("After method");
	}
	@AfterClass
	public void ac(){
		System.out.println("After class");
	}
	@AfterTest
	public void at(){
		System.out.println("After test");
	}
	@AfterSuite
	public void as(){
		System.out.println("After suite");
	}
}

