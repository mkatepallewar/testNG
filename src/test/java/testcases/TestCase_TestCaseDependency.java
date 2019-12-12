package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCase_TestCaseDependency {
	
	@Test (priority=1, groups = {"functional","smoke"})
	public void doUserReg() {
		System.out.println("User registration");
		Assert.fail("User is not registered successfully");
	}
	
	//if dependents method is failing, this will not get executed  - Hard Dependencies
	@Test (priority = 3,dependsOnMethods = {"doUserReg","thirdTest"}, groups = {"functional","smoke"})
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	
	//if dependents method is failing, but still wanted to execute this test case- Soft Dependencies
	@Test (priority = 3, dependsOnMethods = "doUserReg", alwaysRun = true, groups = {"functional","smoke"})
	public void thirdTest() {
		System.out.println("Executing third testcase");
	}
	
	@Test (priority = 4, groups = "bvt")
	public void fourthTest() {
		System.out.println("Executing fourth testcase");
	}
	
	
}
