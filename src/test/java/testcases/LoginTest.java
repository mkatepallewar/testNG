package testcases;

import org.testng.annotations.Test;

	public class LoginTest  {
	
	@Test (dataProviderClass = Dataproviders.class, dataProvider = "dp1")
	public void testLogin(String username, String password) {
		System.out.println(username + "----" + password);
	}
	
	@Test (dataProviderClass = Dataproviders.class, dataProvider = "dp1")
	public void testUserReg1(String firstName, String lastName, String email) {
		System.out.println(firstName + "----" + lastName +" --- "+ email);
	}
	
	@Test (dataProviderClass = Dataproviders.class, dataProvider = "dp2")
	public void testUserReg(String firstName, String lastName, String email) {
		System.out.println(firstName + "----" + lastName +" --- "+ email);
	}
	
}
