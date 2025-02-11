package com.ui.tests;

import static com.constants.Browser.*;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest {

	HomePage homePage;

	@BeforeMethod(description = "Load the Home Page of the Application")
	public void setUp() {
		homePage = new HomePage(EDGE);
	}

	@Test(description = "Verifies with the Valid User is able to login to the application", groups = { "e2e",
			"sanity" })
	public void loginTest() {

		assertEquals(homePage.goToLoginPage().doLoginWith("pesax82429@sectorid.com", "Password@1234").getUserName(),
				"Cha Am");
	}

}
