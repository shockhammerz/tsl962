package appTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
	@Test(description = "Login with Valid Details")
	public void validLoginTest() throws Exception {
		App ap = new App();
		boolean status = ap.userLogin("userdemo", "password");
		Assert.assertTrue(status,"Login Failed with valid Credential"); // Checking Status is true or not
	}
	
	@Test(description = "Login with Invalid Details")
	public void invalidLoginTest() throws Exception {
		App ap = new App();
		boolean status = ap.userLogin("userdemo", "password123");
		Assert.assertFalse(status); // Checking Status is true or not
	}
}
