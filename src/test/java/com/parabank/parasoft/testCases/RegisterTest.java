package com.parabank.parasoft.testCases;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OverviewPage;
import com.parabank.parasoft.pages.RegisterPage;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.openqa.selenium.By;
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
    @Test
    public void registrationShouldSucceed(){
        OverviewPage registrationPage = page.goTo(LoginPage.class)
                .clickRegister()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getStateFull())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhoneNumber(LoremIpsum.getInstance().getPhone())
                .fillSSN(LoremIpsum.getInstance().getPhone())
                .fillUsername(LoremIpsum.getInstance().getFirstName())
                .fillPassword("sqa")
                .fillConfirmPassword("sqa")
                .clickRegisterButton();
        Assert.assertTrue(registrationPage.hasLogoutButton(), "Registration Should Successfully");
    }

    //Negative Test Case
    @Test(enabled = true)
    public void checkBlankFormSubmissionError(){
        RegisterPage registerPage = page.goTo(LoginPage.class)
                .clickRegister()
                .clickRegisterButtonWithoutFullingForm();
        //Total input fields are 11
        Assert.assertTrue(registerPage.hasRegistrationError(9));
    }

    @Test
    public void firstNameErrorMessageShouldBeDisplayed(){
        RegisterPage registerPage = page.goTo(LoginPage.class)
                .clickRegister()
                .clickRegisterButtonWithoutFullingForm();
        Assert.assertEquals(registerPage.getFirstNameErrorMessage(), "First name is required.");
    }


}
