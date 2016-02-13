package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetworkingPageClasses {

	WebDriver driver;

	public NetworkingPageClasses(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Find Login element on community webpage
	@FindBy(css = "li.guest-user-navmenu > a:nth-child(1) > span:nth-child(1)")
	WebElement login;

	// Click on Login
	public void login() {
		login.click();
	}

	// Find email ID field
	@FindBy(css = "div.modal:nth-child(16) > div:nth-child(2) > form:nth-child(6) > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)")
	WebElement email;

	// Enter Email ID
	public void emailid() {
		email.sendKeys("nkadoo@gmail.com");
		;
	}

	// Find Password fiels
	@FindBy(css = "div.modal:nth-child(16) > div:nth-child(2) > form:nth-child(6) > div:nth-child(5) > div:nth-child(2) > input:nth-child(1)")
	WebElement password;

	// Enter password
	public void password() {
		password.sendKeys("Submit15");
	}

	// Find Login button on Sign in form
	@FindBy(css = "div.modal:nth-child(16) > div:nth-child(2) > form:nth-child(6) > div:nth-child(6) > button:nth-child(1)")
	WebElement loginButton;

	// Click on LoginIn button
	public void clickLoginButton() {
		loginButton.click();
	}

	// Find element user name after login to community
	@FindBy(css = ".global-user-menu > a:nth-child(1) > span:nth-child(2)")
	WebElement userName;

	// Check if the user name is abailable on login
	public boolean isUserNameDisplayed() {
		return userName.isDisplayed();
	}

	// Find Categories dropdown
	@FindBy(css = ".domestic-nav > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")
	WebElement categoriesDropDown;

	// Click on Categories dropdown
	public void clickCategories() {
		categoriesDropDown.click();
	}

	// Find Networking option on categories dropdown
	@FindBy(css = ".open > ul:nth-child(2) > li:nth-child(10) > a:nth-child(1)")
	WebElement networkingOption;

	// Click on Networking option under categories dropdown
	public void lcickNetworkingOptions() {
		networkingOption.click();
	}

	// Find resources Header on the networking page
	@FindBy(css = ".domestic-nav > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
	WebElement resourcesHeader;

	// Check if the resources header is displayed
	public boolean isResourceHeaderDisplayed() {
		return resourcesHeader.isDisplayed();
	}

	// CLick on Resurces header
	public void clickResourcesHeader() {
		resourcesHeader.click();
	}

	// Find Vendor pages under resources header
	@FindBy(css = ".open > ul:nth-child(2) > li:nth-child(6) > a:nth-child(1)")
	WebElement vendorPages;

	// Check of vendor pages is displayed under Resoureces header
	public boolean isVendorPagesAvailable() {
		return vendorPages.isDisplayed();
	}

	// Find SeeAll option under Popular tab
	@FindBy(css = "a.see-all:nth-child(1)")
	WebElement seeAll;

	// CLick on See All option under popular tab
	public void clickSeeAll() {
		seeAll.click();
	}

	// Find Groups tab
	@FindBy(css = ".nav-tabs > li:nth-child(6) > a:nth-child(1)")
	WebElement groupsTab;

	// CLick on Groups tab
	public void clickGroupsTab() {
		groupsTab.click();
	}

	// Find Cisco appears on Groups tab
	@FindBy(css = ".groups > li:nth-child(3) > a:nth-child(1)")
	WebElement ciscoGroup;

	// Check if cisco is available
	public boolean isCiscoAvailable() {
		return ciscoGroup.isDisplayed();
	}

	// Find resources tab
	@FindBy(css = ".nav-tabs > li:nth-child(4) > a:nth-child(1)")
	WebElement resourceTab;

	// Click on Resources tab
	public void clickResourcesTab() {
		resourceTab.click();
	}

	// Find Seven habits of hightaly successful MSPs
	@FindBy(css = ".components > li:nth-child(2) > div:nth-child(1)")
	WebElement sevenhabits;

	// Check if image present for seven habits of hightaly successful MSPs
	public boolean isImageAvailable() {
		sevenhabits.getCssValue(".components > li:nth-child(2) > div:nth-child(1) > img:nth-child(1)");
		return true;

	}
}
