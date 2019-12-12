package regressionTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void creatingDBConn() {
		System.out.println("Creating DB Connections");
	}
	
	@AfterTest
	public void closingDBConn() {
		System.out.println("Closing DB Connections");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}
	
	@Test (priority=1)
	public void doUserReg() {
		System.out.println("User registration");
	}
	@Test (priority = 2)
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}
	
}
