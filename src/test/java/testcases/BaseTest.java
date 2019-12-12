package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Initializing all methods");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("Quiting everything");
	}
}
