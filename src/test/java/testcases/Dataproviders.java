package testcases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {

	
	@DataProvider (name = "dp1")
	public static Object[][] getData(Method m){
		Object[][] data=null;
		if (m.getName().equals("testLogin")) {
			data=new Object[2][2];
			
			data[0][0]="raman";
			data[0][1]="lololo";
			
			data[1][0]="Rahul";
			data[1][1]="haha";
			
			
		}else if (m.getName().equals("testUserReg1")) {
			data=new Object[2][3];
			
			data[0][0]="raman";
			data[0][1]="lololo";
			data[0][2]="test@gmail.com";
			
			data[1][0]="Rahul";
			data[1][1]="haha";
			data[1][2]="test@gmail.com";
		}
		return data;
		
	}
	
	@DataProvider (name = "dp2")
	public static Object[][] getData1(){
		
		Object[][] data=new Object[2][3];
		
		data[0][0]="raman";
		data[0][1]="lololo";
		data[0][2]="test@gmail.com";
		
		data[1][0]="Rahul";
		data[1][1]="haha";
		data[1][2]="test@gmail.com";
		
		return data;
	}
	
}
