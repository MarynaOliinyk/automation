package com.qatestlab.prestashopautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class MainPage extends AbstractPage {

    private WebElement catalogButton;
    private WebElement categoriesButton;

    private By catalogsButtonLocator = By.xpath("//span[contains(text(),'Каталог')]");
    private By categoriesButtonLocator = By.xpath("//a[@class='title'][contains(text(),'категории')]");

    public MainPage(EventFiringWebDriver eventFiringWebDriver) {
        super(eventFiringWebDriver);
    }

    public void clickToCategories() {
        AbstractPage abstractPage = new AbstractPage(eventFiringWebDriver);
        catalogButton = eventFiringWebDriver.findElement(catalogsButtonLocator);
        abstractPage.moveToElement(catalogButton);
        categoriesButton = eventFiringWebDriver.findElement(categoriesButtonLocator);
        categoriesButton.click();
    }
}


