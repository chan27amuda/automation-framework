package com.ui.pages;

import static com.constants.Env.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;

public final class HomePage extends BrowserUtility {

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath(".//a[contains(text(),'Sign in')]");

	public HomePage(Browser browserName, boolean isHeadless) {
		super(browserName, isHeadless);// To call the Parent Class Constructor from the Child Constructor
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
	}

	public HomePage(WebDriver driver) {
		super(driver); // To Call the Parent Class constructor from the child constructor
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
	}

	public LoginPage goToLoginPage() { // Page Functions
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

}
