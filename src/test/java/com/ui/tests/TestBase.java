package com.ui.tests;

import static com.constants.Browser.EDGE;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;

import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LoggerUtility;

public class TestBase {

	HomePage homePage;
	Logger logger = LoggerUtility.getLogger(this.getClass());

	@BeforeMethod(description = "Load the Home Page of the Application")
	public void setUp() {
		homePage = new HomePage(EDGE);
		logger.info("Loads the Homepage of the Application");
	}

	public BrowserUtility getInstance() {
		return homePage;
	}

}
