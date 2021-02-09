package Demo.testngDemo.qsp;

import org.testng.annotations.DataProvider;

public class DemoDataProvider {
	
	@DataProvider
	public String[][] demo()
	{
		String[][] str= new String[3][4];
		str[0][0]="user";
	}

}
