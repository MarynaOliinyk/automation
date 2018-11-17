package com.qatestlab.prestashopautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginPage extends AbstractPage {

    private WebElement emailField;
    private WebElement passwordField;
    private WebElement loginButton;

    private By emailLocator = By.id("email");
    private By passwordLocator = By.id("passwd");
    private By submitButtonLocator = By.name("submitLogin");

    public LoginPage(EventFiringWebDriver eventFiringWebDriver) {
        super(eventFiringWebDriver);
    }

    public void logIn(String email, String password) {
        emailField = eventFiringWebDriver.findElement(emailLocator);
        emailField.sendKeys(email);
        passwordField = eventFiringWebDriver.findElement(passwordLocator);
        passwordField.sendKeys(password);
        loginButton = eventFiringWebDriver.findElement(submitButtonLocator);
        loginButton.click();
    }
}



