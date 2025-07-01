package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends Page {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try {
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("Element not found: " + locator);
        }
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        List<WebElement> elements = null;
        try {
            elements = driver.findElements(locator);
        } catch (Exception e) {
            System.out.printf("Element not found: " + locator);
        }
        return elements;
    }

    @Override
    public String getElementText(By locator) {
        return getWebElement(locator).getText();
    }

    @Override
    public void clickElement(By locator) {
        setWait(locator);
        getWebElement(locator).click();
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public void setWait(By locator) {
        wait.until(ExpectedConditions.visibilityOf(getWebElement(locator)));
    }
}
