package com.parabank.parasoft.testCases;

import com.parabank.parasoft.pages.BasePage;
import com.parabank.parasoft.pages.Page;
import com.parabank.parasoft.util.ParaBankUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    Page page;

    @BeforeMethod
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().timeouts().implicitlyWait(ParaBankUtil.WAIT_TIME, TimeUnit.SECONDS);
        page = new BasePage(driver);
    }

    @AfterMethod
    public void closeBrowser() {

        driver.quit();
    }

}
