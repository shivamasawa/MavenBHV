package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBaseSetup;
import page.LoginPage;

public class LoginPageTest extends TestBaseSetup {
	private WebDriver driver;
	private LoginPage loginPage;
	@BeforeClass
	public void setUp() {
		driver = getDriver();
		loginPage = new LoginPage(driver);
	}
	@Test
	public void verifyLoginPage() {
		System.out.println("Login Page Test : ");
		Assert.assertTrue(loginPage.verifyLoginPageTitle(), "Home Page Title doesn't match");
	}

}
