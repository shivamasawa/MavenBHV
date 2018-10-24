package page;

import org.openqa.selenium.WebDriver;
public class HomePage {
	protected WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyHomePageTitle() {
		String expectedTitle = "Business News Daily: Small Business Solutions & Inspiration";
		return getPageTitle().contains(expectedTitle);
	}

}
