package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.AccountOpenedPage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OpenNewAccountPage;
import com.parabank.parasoft.pages.OverviewPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest {

    @Test(enabled = false) //for understanding
    public void savingsOpenNewAccountShouldSucceed() {
        //LoginPage > OverviewPage > Open New Account
        OverviewPage overviewPage = page.goTo(LoginPage.class)
                .doLogin(getUserName(), getPassword());

        OpenNewAccountPage accountPage = overviewPage
                .clickOpenNewAccountButton();

        AccountOpenedPage openedPage = accountPage
                .selectAccountType("SAVINGS")
                .selectFromAccount(0)
                .clickOpenNewAccountButton();
        Assert.assertTrue(openedPage.hasAccountOpenedId());
    }

    @Test(enabled = true) //alternative
    public void savingsOpenNewAccountShouldSucceed2(){
        AccountOpenedPage openedPage = page.goTo(LoginPage.class)
                .doLogin(getUserName(),getPassword())
                .clickOpenNewAccountButton()
                .selectAccountType("SAVINGS")
                .selectFromAccount(0)
                .clickOpenNewAccountButton();
        Assert.assertTrue(openedPage.hasAccountOpenedId());
    }

}
