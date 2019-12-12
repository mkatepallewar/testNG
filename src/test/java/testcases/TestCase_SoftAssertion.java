package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase_SoftAssertion {

	
	@Test(groups = {"functional","smoke"})
	public void validateTitle() {
		String expected_title="Google";
		String actual_title="Yahoo";
		System.out.println("Biggining ...");
		//Soft Assertions
		
		SoftAssert softAssert=new SoftAssert();
		System.out.println("Validating Title");
		softAssert.assertEquals(actual_title,expected_title, "Title is not matching: ");
		
		
		System.out.println("Validating Conditions");
		softAssert.assertEquals(true, false, "Codition is not matching: ");
		
		System.out.println("Validating Test1");
		softAssert.assertEquals(true, false, "Test1 is getting failed: ");
		
		
/*		Hard Assertion
 * 
 * 		System.out.println("Validating Title");
		Assert.assertEquals(actual_title,expected_title);
		
		
		System.out.println("Validating Conditions");
		Assert.assertEquals(true, false);;
		
		System.out.println("Validating Test1");
		Assert.assertEquals(true, false);
//		Assert.fail("Failing the test case as condition is not met");
 * 
 * 
 * 
 */
		System.out.println("Ending...");
		
		softAssert.assertAll();
	}
}
