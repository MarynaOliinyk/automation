package com.qatestlab.prestashopautomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static com.qatestlab.prestashopautomation.utils.TestData.Login.BASE_URL;

public class WebDriverBase {

    protected static EventFiringWebDriver eventFiringWebDriver;
    static EventHandler handler = new EventHandler();

    @BeforeTest
    public static void setUp() {
        WebDriver driver = DriverManager.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10000l, TimeUnit.SECONDS);
        eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.register(handler);
        eventFiringWebDriver.get(BASE_URL);
    }

    @AfterTest
    public static void tearDown() {
        eventFiringWebDriver.quit();
    }
}

