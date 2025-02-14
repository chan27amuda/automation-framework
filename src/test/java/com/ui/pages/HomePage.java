package com.ui.pages;

import static com.constants.Env.*;

import org.openqa.selenium.By;

import com.constants.Browser;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;

public final class HomePage extends BrowserUtility {

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath(".//a[contains(text(),'Sign in')]");

	public HomePage(Browser browserName) {
		super(browserName);// To call the Parent Class Constructor from the Child Constructor
		goToWebsite(JSONUtility.readJSON(QA).getUrl());
	}

	public LoginPage goToLoginPage() { // Page Functions
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

}
