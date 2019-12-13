package ParallelTest;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallelDataProvider {
	
	@Test (dataProvider = "getData")
	public void doLogin(String browser) throws InterruptedException {
		
		Date d=new Date();
		System.out.println("Browser Name: " + browser + " --- " + d);
		Thread.sleep(1000);
	}
	
	@DataProvider (parallel = true)
	public Object[][] getData(){
		
		Object[][] data=new Object[2][1];
		data[0][0]="Chrome";
		data[1][0]="Firefix";
		
		return data;
	}
}
