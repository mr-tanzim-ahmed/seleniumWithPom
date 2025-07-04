package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    //I use size for avoiding exception
    public boolean hasLogoutButton() {
        return getWebElements(By.cssSelector("a[href='logout.htm']")).size() > 0;
    }

}
