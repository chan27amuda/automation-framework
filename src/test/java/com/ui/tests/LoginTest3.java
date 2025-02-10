package com.ui.tests;

import static com.constants.Browser.*;
import com.ui.pages.HomePage;

public class LoginTest3 {

	public static void main(String[] args) {

		HomePage homePage = new HomePage(EDGE);
		String userName = homePage.goToLoginPage().doLoginWith("pesax82429@sectorid.com", "Password@1234")
				.getUserName();
		System.out.println("User Logged into the Application is: " + userName);
	}

}
