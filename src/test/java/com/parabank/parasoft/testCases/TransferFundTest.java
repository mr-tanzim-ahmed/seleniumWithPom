package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.TransferCompletePage;
import com.parabank.parasoft.pages.TransferErrorPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferFundTest extends BaseTest{

    @Test
    public void checkTransferErrorMessage(){
        TransferErrorPage transferCompletePage = page.goTo(LoginPage.class)
                .fillUserName(getUserName())
                .fillPassword(getPassword())
                .clickLoginButton()
                .clickTransferFundPage()
                .blankAmountAndTransfer();
        Assert.assertTrue(transferCompletePage.transferErrorMessage());
    }
    @Test
    public void checkTransferSuccessfullMessage(){
        TransferCompletePage transferCompletePage = page.goTo(LoginPage.class)
                .fillUserName(getUserName())
                .fillPassword(getPassword())
                .clickLoginButton()
                .clickTransferFundPage()
                .putAmountAndTransfer("30");
        Assert.assertTrue(transferCompletePage.transferSuccessfulMessage());
    }
}
