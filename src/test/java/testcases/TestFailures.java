package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailures extends BaseTest {
	
	@Test
	public void doLogin() {
		Assert.fail("Failing test case");
		
	}

}
