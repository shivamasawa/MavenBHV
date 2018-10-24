package tests;

import org.testng.annotations.Test;

import base.TestBaseSetup;
import page.HomePage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class HomePageTest extends TestBaseSetup {
	private WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}
	@Test
	public void verifyHomePage() {
		System.out.println("Home Page Test : ");
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.verifyHomePageTitle(), "Home Page Title doesn't match");
	}

}
