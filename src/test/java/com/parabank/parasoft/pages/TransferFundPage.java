package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TransferFundPage extends BasePage{

    public TransferFundPage(WebDriver driver){
        super(driver);
    }
    public TransferCompletePage putAmountAndTransfer(String amount){
        setInputText(By.xpath("//input[@id='amount']"),amount);
        getSelect(By.cssSelector("#fromAccountId")).selectByIndex(0);
        getSelect(By.cssSelector("#toAccountId")).selectByIndex(0);
        clickElement(By.xpath("//input[@value='Transfer']"));
        return goTo(TransferCompletePage.class);
    }
    public TransferErrorPage blankAmountAndTransfer(){
        clickElement(By.cssSelector("input[value='Transfer']"));
    return goTo(TransferErrorPage.class);
    }
}
