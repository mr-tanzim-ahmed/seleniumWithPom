package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void checkLoginPage(){

        LoginPage loginPage = page.goTo(LoginPage.class);
        String url = loginPage.getPageUrl();

        Assert.assertTrue(loginPage.isLoginPage());


    }

}
