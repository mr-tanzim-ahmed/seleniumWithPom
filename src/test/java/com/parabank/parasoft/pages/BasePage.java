package com.parabank.parasoft.pages;

import com.aventstack.extentreports.Status;
import com.parabank.parasoft.report.ReportTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage extends Page {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try {
            addInfo("Selenium WebDriver going to find a WebElement with " + locator + " locator");
            element = driver.findElement(locator);
            addInfo("Selenium WebDriver found a WebElement with " + locator + " locator");

        } catch (Exception e) {
            addFailInfo("Selenium WebDriver is not found a WebElement with "+locator+" locator");
            System.out.println("Element not found: " + locator);
        }
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        List<WebElement> elements = null;
        try {
            addInfo("Selenium WebDriver going to find a WebElements with " + locator + " locator");
            elements = driver.findElements(locator);
            addInfo("Selenium WebDriver found a WebElements with " + locator + " locator");
        } catch (Exception e) {
            addFailInfo("Selenium WebDriver is not found  WebElements with "+locator+" locator");
            System.out.printf("Element not found: " + locator);
        }
        return elements;
    }

    @Override
    public void setInputText(By locator, String text) {
        getWebElement(locator).clear();
        getWebElement(locator).sendKeys(text);
    }

    public String getPageTitle() {
        return driver.getTitle();
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

    @Override
    public Select getSelect(By locator) {
        //General Use: Select select = new Select(driver.findElement(locator);
        //Returns select object
        return new Select(getWebElement(locator));
    }

    //For Report
    public void addInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.FAIL, message);
        }
    }

    public void addFailInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.FAIL, message);
        }

    }

}
