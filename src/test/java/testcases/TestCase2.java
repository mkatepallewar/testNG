package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest {
	
	@Test(groups = "smoke")
	public void validateTitle() {
		String expected_title="Google";
		String actual_title="Yahoo";
		
		Assert.assertEquals(actual_title, expected_title);
	}
	

}
