package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.mytests.uiobjects.example.entities.User;
import org.openqa.selenium.WebElement;

public class LoginForm extends Form<User> {
    @Css("#name") TextField userName;
    @Css("#password")  TextField password;
    @Css("[type=submit]") Button enter;
}
