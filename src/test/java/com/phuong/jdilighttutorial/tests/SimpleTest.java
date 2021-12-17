package com.phuong.jdilighttutorial.tests;

import com.epam.jdi.light.elements.composite.WebPage;
import com.phuong.jdilighttutorial.TestsInit;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.SiteJdi.homePage;
import static pages.SiteJdi.searchResultPage;
import static pages.google.HomePage.searchField;
import static pages.google.SearchResultPage.searchResultField;

public class SimpleTest implements TestsInit {

    @Test
    public void searchOnHomePage(){
        homePage.open();
        searchField.sendKeys("viet nam");
        searchField.sendKeys(Keys.ENTER);

        searchResultField.is().text(Matchers.containsString("viet nam"));

        Assert.assertTrue(WebPage.getUrl().contains("search?q=viet+nam"));
    }
    
}
