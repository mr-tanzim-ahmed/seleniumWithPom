package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.util.ParaBankUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    //private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    @Test
    public void checkLoginPage() {
        LoginPage loginPage = page.goTo(LoginPage.class);
        Assert.assertTrue(loginPage.isLoginPage());
    }

    @Test
    public void checkLoginPageTitle() {
        LoginPage loginPage = page.goTo(LoginPage.class);
        String title = loginPage.getPageTitle();
        Assert.assertEquals(title, ParaBankUtil.LOGIN_PAGE_TITLE, "Login Page Title Matched");
    }

    @Test
    public void checkLoginPageUrl() {
        LoginPage checkLoginPage = page.goTo(LoginPage.class);
        String url = checkLoginPage.getPageUrl();
        System.out.println(url);
        Assert.assertTrue(url.contains("https://parabank.parasoft.com/parabank/index.htm"));
    }

    @Test
    public void loginShouldFailWithUsername() {
        LoginPage loginPage = page.goTo(LoginPage.class);
        loginPage = loginPage
                .fillUserName("afrgvnyte")
                .clickLoginButtonAndStay();
        Assert.assertTrue(loginPage.hasLoginError(), "Login Should fail with only username");
    }

    @Test
    public void loginShouldFailWithPassword() {
        LoginPage loginPage = page.goTo(LoginPage.class);
        loginPage = loginPage
                .fillPassword("asdsada")
                .clickLoginButtonAndStay();
        Assert.assertTrue(loginPage.hasLoginError(), "Login Should fail with only password");
    }

}
