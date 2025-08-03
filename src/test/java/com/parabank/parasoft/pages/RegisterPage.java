package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasRegistratioForm() {
        return getWebElements(By.id("customerForm")).size() > 0;
    }

    public RegisterPage fillFirstName(String firstName) {
        setInputText(By.id("customer.firstName"), firstName);
        return this;
    }

    public RegisterPage fillLastName(String lastName) {
        setInputText(By.id("customer.lastName"), lastName);
        return this;
    }

    public RegisterPage fillAddress(String address) {
        setInputText(By.id("customer.address.street"), address);
        return this;
    }

    public RegisterPage fillCity(String city) {
        setInputText(By.id("customer.address.city"), city);
        return this;
    }

    public RegisterPage fillState(String state) {
        setInputText(By.id("customer.address.state"), state);
        return this;
    }

    public RegisterPage fillZipCode(String zipCode) {
        setInputText(By.id("customer.address.zipCode"), zipCode);
        return this;
    }

    public RegisterPage fillPhoneNumber(String phoneNumber) {
        setInputText(By.id("customer.phoneNumber"), phoneNumber);
        return this;
    }

    public RegisterPage fillSSN(String ssn) {
        setInputText(By.id("customer.ssn"), ssn);
        return this;
    }

    public RegisterPage fillUsername(String username) {
        getWebElement(By.cssSelector("input[name='customer.username']")).sendKeys(username);
        return this;
    }

    public RegisterPage fillPassword(String password) {
        getWebElement(By.cssSelector("input[name='customer.password']")).sendKeys(password);
        return this;
    }

    public RegisterPage fillConfirmPassword(String confirmPassword) {
        getWebElement(By.cssSelector("input[name='repeatedPassword']")).sendKeys(confirmPassword);
        return this;
    }

    public OverviewPage clickRegisterButton() {
        clickElement(By.xpath("//input[@value='Register']"));
        return goTo(OverviewPage.class);
    }

    public RegisterPage clickRegisterButtonAndStay() {
        clickElement(By.xpath("//input[@value='Register']"));
        return this;
    }

    public boolean hasRegistrationError(int errorCount) {
        setWait(By.cssSelector("span[class=error]"));
        return getWebElements(By.cssSelector("span[class=error]")).size() >= errorCount;
    }

    public RegisterPage clickRegisterButtonWithoutFullingForm() {
        clickElement(By.xpath("//input[@value='Register']"));
        return this;
    }

    public String getFirstNameErrorMessage() {
        return getElementText(By.xpath("//span[@id='customer.firstName.errors']"));
    }
}
