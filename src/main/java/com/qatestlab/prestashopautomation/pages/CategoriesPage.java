package com.qatestlab.prestashopautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.AssertJUnit.assertEquals;

public class CategoriesPage extends AbstractPage{

    private WebElement addCategoriesButton;
    private WebElement inputNamesField;
    private WebElement saveCategories;
    private WebElement alert;
    private WebElement filter;
    private WebElement newCategories;

    private By addCategoriesButtonLocator = By.id("page-header-desc-category-new_category");
    private By inputNamesFieldLocator = By.id("name_1");
    private By saveButtonLocator = By.id("category_form_submit_btn");
    private By allertSuccessLocator = By.xpath("//div[@class='alert alert-success']");
    private By newCategoriesLocator = By.xpath("//td[contains(text(),'New')]");
    private By filtrByNameLocator = By.xpath("//tr[@class='nodrag nodrop']//th[3]//span[1]");

    public CategoriesPage(EventFiringWebDriver eventFiringWebDriver) {
        super(eventFiringWebDriver);
    }

    public void addAndCheckNewOfCategories(String namesOfNewCategories) {
        addCategoriesButton = eventFiringWebDriver.findElement(addCategoriesButtonLocator);
        addCategoriesButton.click();
        inputNamesField = eventFiringWebDriver.findElement(inputNamesFieldLocator);
        inputNamesField.sendKeys(namesOfNewCategories);
        saveCategories = eventFiringWebDriver.findElement(saveButtonLocator);
        saveCategories.click();
        alert = eventFiringWebDriver.findElement(allertSuccessLocator);
        waitForExpectedCondition(ExpectedConditions.visibilityOf(alert));
        filter = eventFiringWebDriver.findElement(filtrByNameLocator);
        filter.click();
        newCategories = eventFiringWebDriver.findElement(newCategoriesLocator);
        assertEquals(newCategories.getText(), (namesOfNewCategories));
    }
}
