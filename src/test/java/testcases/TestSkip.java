package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip extends BaseTest {
	@Test
	public void skipTest() {
		throw new SkipException("Skippig the test as condition is not matching");
	}
}
