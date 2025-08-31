package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferErrorPage extends BasePage{

    public TransferErrorPage(WebDriver driver) {
        super(driver);
    }
    public boolean transferErrorMessage(){
        return getWebElements(By.cssSelector("div[id='showError'] h1[class='title']")).size() > 0;
    }
}
