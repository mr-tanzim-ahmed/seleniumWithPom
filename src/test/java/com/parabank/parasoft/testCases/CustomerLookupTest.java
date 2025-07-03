package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.pages.CustomerLookupPage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.util.ParaBankUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerLookupTest extends BaseTest{

    @Test
    public void checkCustomerLookupPage(){
        LoginPage loginPage = page.goTo(LoginPage.class);
        // clickForgotPassword() method returns to CustomerLookupPage
        CustomerLookupPage customerLookupPage =  loginPage.clickForgotPassword();
        Assert.assertTrue(customerLookupPage.hasLookupForm(), "Lookup form check");
    }

}
