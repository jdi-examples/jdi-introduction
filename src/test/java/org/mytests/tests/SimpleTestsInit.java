package org.mytests.tests;

import org.mytests.uiobjects.example.site.JdiTestSite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.mytests.tests.example.SimpleJdiExample;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.composite.WebPage.openSite;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.light.settings.WebSettings.logger;

public interface SimpleTestsInit {

    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        openSite(JdiTestSite.class);
        logger.info("Run Tests");
    }


    @AfterSuite(alwaysRun = true)
    static void teardown() {
        killAllSeleniumDrivers();
    }
}

