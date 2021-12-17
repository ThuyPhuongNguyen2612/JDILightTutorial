package pages.google;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;

public class HomePage extends WebPage {
    @UI("//input[@name='q']") public static TextField searchField;
    @UI("//div[@class='FPdoLc lJ9FBc']/descendant::input[@class='gNO89b']") public static Button searchButton;

}
