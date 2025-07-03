package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLookupPage extends BasePage{
    //Customer LookUp Page actually a "forgot login info" in Login page
    public CustomerLookupPage(WebDriver driver) {
        super(driver);
    }
    public boolean hasLookupForm(){
        return getWebElements(By.cssSelector("#lookupForm")).size() > 0;
    }
}
