package org.mytests.tests.example;

import org.mytests.tests.SimpleTestsInit;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.TestData.DEFAULT_USER;
import static org.mytests.uiobjects.example.site.JdiTestSite.homePage;
import static org.mytests.uiobjects.example.site.pages.HomePage.loginForm;
import static org.mytests.uiobjects.example.site.pages.HomePage.userIcon;

public class SimpleJdiExample extends SimpleTestsInit {

    @Test
    public void loginTest() {
        homePage.open();
        userIcon.click();
        loginForm.loginAs(DEFAULT_USER);
        homePage.checkOpened();
    }
}
