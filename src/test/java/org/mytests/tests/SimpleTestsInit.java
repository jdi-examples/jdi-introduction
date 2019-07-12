package org.mytests.tests;

import org.mytests.uiobjects.example.site.JdiTestSite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.logger.LogLevels.STEP;
import static com.epam.jdi.light.settings.WebSettings.logger;
import static com.epam.jdi.light.ui.html.PageFactory.initElements;

public interface SimpleTestsInit {
    @BeforeSuite(alwaysRun = true)
    default void setUp() {
        logger.setLogLevel(STEP);
        initElements(JdiTestSite.class);
        logger.info("Run Tests");
    }

    @AfterSuite(alwaysRun = true)
    default void teardown() {
        killAllSeleniumDrivers();
    }
}
