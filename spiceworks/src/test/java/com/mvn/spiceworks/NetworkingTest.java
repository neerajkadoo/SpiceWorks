package com.mvn.spiceworks;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.NetworkingPageClasses;
import utilities.Constants;

public class NetworkingTest {

	private WebDriver driver;
	NetworkingPageClasses network;

	@BeforeMethod
	public void setUp() throws Exception {
		// Start Firefox
		driver = new FirefoxDriver();

		// Import URL from constants file
		String baseURL = Constants.communityPage;

		network = new NetworkingPageClasses(driver);
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open Community Page URL
		driver.get(baseURL);

	}

	@Test
	public void networkTabTest() throws InterruptedException {
		// CLick on Login button on the community page
		network.login();

		// Enter email ID on the Login form
		network.emailid();

		// Enter Password on the login form
		network.password();

		// Click on Login In button on login form
		network.clickLoginButton();

		Thread.sleep(5000);

		// Check if the user is logged in to the community
		network.isUserNameDisplayed();

		// Click on Categories dropdown
		network.clickCategories();

		// CLick Networking option
		network.lcickNetworkingOptions();

		// Check resource header on networking page
		network.isResourceHeaderDisplayed();

		// Click on resources header
		network.clickResourcesHeader();

		// Check of Vendor pages option is avaiable
		network.isVendorPagesAvailable();

		// click on See all option under Popular tab
		network.clickSeeAll();

		// click groups tab
		network.clickGroupsTab();

		// Check Cisco is available on Groups tab
		network.isCiscoAvailable();

		// Click on Resource tab
		network.clickResourcesTab();

		// Check if image is available for Seven Habits of Highly Successful
		// MSPs
		network.isImageAvailable();
	}

	@AfterMethod
	public void afterClass() {
		driver.close();
	}
}
