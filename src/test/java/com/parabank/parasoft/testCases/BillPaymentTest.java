package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.BillPaymentCompletePage;
import com.parabank.parasoft.pages.BillPaymentPage;
import com.parabank.parasoft.pages.LoginPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BillPaymentTest extends BaseTest{
    LoremIpsum loremIpsum = LoremIpsum.getInstance();
    @Test
    public void billPaymentServiceShouldSucceed(){
        BillPaymentCompletePage billPaymentPage = page.goTo(LoginPage.class)
                .doLogin(getUserName(),getPassword())
                .clickBillPayPage()
                .fillPayeeName(loremIpsum.getName())
                .fillPayeeAddress(loremIpsum.getCity())
                .fillPayeeCity(loremIpsum.getCity())
                .fillPayeeState(loremIpsum.getStateFull())
                .fillPayeeZipCode(loremIpsum.getZipCode())
                .fillPayeePhoneNumber(loremIpsum.getPhone())
                .fillPayeeAccountNumber("12345")
                .fillVerifyAccountNumber("12345")
                .fillAmount("100.00")
                .fillFromAccount(0)//selectors 1st value
                .clickSendPaymentButton();
        Assert.assertTrue(billPaymentPage.hasBillPaymentCompleteMessage());
    }
}
