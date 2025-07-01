package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void checkRegistrationPage(){
        LoginPage loginPage = page.goTo(LoginPage.class);
        //clickRegister() return type RegistrationPage,
        //After Clicking login button,from LoginPage to goTo RegesiterPage
        RegisterPage registerPage = loginPage.clickRegister();
        Assert.assertTrue(registerPage.hasRegistratioForm());
    }
}
