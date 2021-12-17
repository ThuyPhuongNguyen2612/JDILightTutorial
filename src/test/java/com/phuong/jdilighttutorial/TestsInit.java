package com.phuong.jdilighttutorial;

import org.testng.annotations.AfterSuite;
import pages.SiteJdi;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.elements.init.PageFactory.initElements;

public interface TestsInit {

    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        initElements(SiteJdi.class);
    }

}
