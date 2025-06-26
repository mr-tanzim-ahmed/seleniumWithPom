package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }
    //After fillup the user name , it will stay this page
    public LoginPage fullUserName(String userName){
        getWebElement(By.id("username")).sendKeys(userName);
        return this;
    }
    //Same as user name,
    public LoginPage fullPassword(String password){
        getWebElement(By.name("password")).sendKeys(password);
        return this;
    }
    //After clicking login button, It will goes Overview Page
    public OverviewPage clickLoginButton(){
        clickElement(By.xpath("//input[@value='Log In']"));
        return getPage(OverviewPage.class);
    }
    public CustomerLookUpPage clickForgotPassword(){
        clickElement(By.cssSelector("a[href='lookup.htm']"));
        return getPage(CustomerLookUpPage.class);
    }
    public RegisterPage clickRegister(){
        clickElement(By.cssSelector("a[href='register.htm']"));
        return getPage(RegisterPage.class);
    }

}
