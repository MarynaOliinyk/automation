package com.qatestlab.prestashopautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

class AbstractPage {
    protected EventFiringWebDriver eventFiringWebDriver;
    private WebDriverWait webDriverWait;

    AbstractPage(EventFiringWebDriver eventFiringWebDriver) {
        this.eventFiringWebDriver = eventFiringWebDriver;
        webDriverWait= new WebDriverWait(eventFiringWebDriver.getWrappedDriver(),3000L);
    }

    void moveToElement(WebElement webElement) {
        Actions builder = new Actions(eventFiringWebDriver);
        builder.moveToElement(webElement).perform();
    }
    public WebElement waitForExpectedCondition(ExpectedCondition expectedCondition) {
        return (WebElement) webDriverWait.until(expectedCondition);
    }
}
