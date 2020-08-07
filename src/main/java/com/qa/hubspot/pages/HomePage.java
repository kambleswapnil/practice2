package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;

	By header = By.cssSelector("h1.dashboard-selector__title");
	By accountName = By.cssSelector("span.account-name ");

	By primaryContactLink = By.id("nav-primary-contacts-branch");
	By secondarContactLInk = By.id("nav-secondary-contacts");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public String getHomePageHeaderText() {
		if(driver.findElement(header).isDisplayed()) {
			return driver.findElement(header).getText();
		}
		return null;
	}

	public String getLoggedInUser() {
		if(driver.findElement(accountName).isDisplayed()) {
			return driver.findElement(accountName).getText();
		}
		return null;
	}
}
