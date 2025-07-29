package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPaymentPage extends BasePage {
    public BillPaymentPage(WebDriver driver) {
        super(driver);
    }

    public BillPaymentPage fillPayeeName(String name) {
        getWebElement(By.cssSelector("input[name='payee.name']")).sendKeys(name);
        return this;
    }

    public BillPaymentPage fillPayeeAddress(String address) {
        getWebElement(By.cssSelector("input[name='payee.address.street']")).sendKeys(address);
        return this;
    }

    public BillPaymentPage fillPayeeCity(String city) {
        getWebElement(By.cssSelector("input[name='payee.address.city']")).sendKeys(city);
        return this;
    }

    public BillPaymentPage fillPayeeState(String state) {
        getWebElement(By.cssSelector("input[name='payee.address.state']")).sendKeys(state);
        return this;
    }

    public BillPaymentPage fillPayeeZipCode(String zipCode) {
        getWebElement(By.cssSelector("input[name='payee.address.zipCode']")).sendKeys(zipCode);
        return this;
    }

    public BillPaymentPage fillPayeePhoneNumber(String phoneNumber) {
        getWebElement(By.cssSelector("input[name='payee.phoneNumber']")).sendKeys(phoneNumber);
        return this;
    }

    public BillPaymentPage fillPayeeAccountNumber(String accountNumber) {
        getWebElement(By.cssSelector("input[name='payee.accountNumber']")).sendKeys(accountNumber);
        return this;
    }

    public BillPaymentPage fillVerifyAccountNumber(String verifyAccountNumber) {
        getWebElement(By.cssSelector("input[name='verifyAccount']")).sendKeys(verifyAccountNumber);
        return this;
    }

    public BillPaymentPage fillAmount(String amount) {
        getWebElement(By.cssSelector("input[name='amount']")).sendKeys(amount);
        return this;
    }

    public BillPaymentPage fillFromAccount(int index) {
        getSelect(By.cssSelector("select[name='fromAccountId']")).selectByIndex(index);
        return this;
    }

    public BillPaymentCompletePage clickSendPaymentButton() {
        clickElement(By.cssSelector("input[value='Send Payment']"));
        return goTo(BillPaymentCompletePage.class);
    }

}
