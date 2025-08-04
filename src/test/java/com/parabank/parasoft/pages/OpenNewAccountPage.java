package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenNewAccountPage extends BasePage {

    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public OpenNewAccountPage selectAccountType(String accountType) {
        getSelect(By.xpath("//select[@id='type']")).selectByVisibleText(accountType);

        //After selecting , stay this pages
        return this;
    }

    public OpenNewAccountPage selectFromAccount(int index) {
        getSelect(By.xpath("//select[@id='fromAccountId']")).selectByIndex(index);
        return this;
    }

    public AccountOpenedPage clickOpenNewAccountButton() {
        clickElement(By.xpath("//input[@value='Open New Account']"));
        return goTo(AccountOpenedPage.class);
    }

}
