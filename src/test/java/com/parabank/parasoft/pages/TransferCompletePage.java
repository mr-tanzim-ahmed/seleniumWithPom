package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferCompletePage extends BasePage{

    public TransferCompletePage(WebDriver driver) {
        super(driver);
    }
    //span[class=error]
    public boolean transferSuccessfulMessage(){
        return getWebElements(By.cssSelector("h1[class=title]")).size() > 0;
    }
}
