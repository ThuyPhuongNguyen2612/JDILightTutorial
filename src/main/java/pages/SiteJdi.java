package pages;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import pages.google.HomePage;
import pages.google.SearchResultPage;

@JSite("https://www.google.com")
public class SiteJdi {
    @Url("/") public static HomePage homePage;
    @Url("/search") public static SearchResultPage searchResultPage;
}
