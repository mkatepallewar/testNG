package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test (dataProvider = "getData")
	public void doLogin(String username, String password) {
		System.out.println(username +" --- "+password);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object [][] data=new Object[3][2];
		data[0][0]="test@gamil.com";
		data[0][1]="ddd";
		
		data[1][0]="test1@gamil.com";
		data[1][1]="ddd2";
		
		data[2][0]="test2@gamil.com";
		data[2][1]="ddd3";
		
		return data;
	}
}
