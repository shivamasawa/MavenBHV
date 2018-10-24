package page;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyLoginPageTitle() {
		String expectedTitle = "Login :: Beehive HRMS ::  ";
		return getPageTitle().contains(expectedTitle);
	}

}
