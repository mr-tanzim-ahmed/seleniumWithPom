package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPaymentCompletePage extends BasePage {

    public BillPaymentCompletePage(WebDriver driver) {
        super(driver);
    }

    public boolean hasBillPaymentCompleteMessage() {
        return getWebElements(By.xpath("//p[contains(text(),'Bill Payment to')]")).size() > 0;
    }

}
