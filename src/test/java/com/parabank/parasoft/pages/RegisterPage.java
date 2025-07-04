package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public boolean hasRegistratioForm(){
        return getWebElements(By.id("customerForm")).size() > 0;
    }
    public RegisterPage fillFirstName(String firstName){
        setInputText(By.id("customer.firstName"),firstName);
        return  this;
    }
}
