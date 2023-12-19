package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomer;

    @CacheLookup
    @FindBy(name = "email")
    WebElement emailId;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passWord;

    @CacheLookup
    @FindBy(css = "input[value='Login']")
    WebElement loginButton;

    public void enterEmailId(String email) {
        log.info("Entering email Id into : " + emailId.toString());
        sendTextToElement(emailId, email);
    }

    public void enterPassword(String password) {
        log.info("Entering password into : " + passWord.toString());
        sendTextToElement(passWord, password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login Button : " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String verifyReturningCustomerText() {
        log.info("Getting text from : " + returningCustomer.toString());
        return getTextFromElement(returningCustomer);
    }
}
