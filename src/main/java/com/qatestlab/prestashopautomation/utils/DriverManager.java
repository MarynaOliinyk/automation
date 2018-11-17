package com.qatestlab.prestashopautomation.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    public static WebDriver getDriver(String browser) {
        switch (browser) {
            case "firefox":
                FirefoxDriverManager.getInstance().setup();
                return new FirefoxDriver();
            case "chrome":
            default:
                ChromeDriverManager.getInstance().setup();
                return new ChromeDriver();
        }
    }
}
