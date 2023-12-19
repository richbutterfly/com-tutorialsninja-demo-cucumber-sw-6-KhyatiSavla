package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement myAccountCreatedText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement textMyAccount;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueAfterRegisterAccount;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueAfterLogOut;

    @CacheLookup
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='My Account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[@class= 'btn btn-primary']")
    WebElement continueButton1;

    public String verifyYourAccountHasBeenCreated() {
        log.info("Getting text from : " + myAccountCreatedText.toString());
        return getTextFromElement(myAccountCreatedText);
    }

    public String verifyTextMyAccount() {
        log.info("Getting text from : " + textMyAccount.toString());
        return getTextFromElement(textMyAccount);
    }

    public void clickOnContinueAfterRegisterAccount() {
        log.info("Clicking on continue after register account : " + continueAfterRegisterAccount.toString());
        clickOnElement(continueAfterRegisterAccount);
    }

    public void clickOnContinueAfterLogOut() {
        log.info("Clicking on continue after log out : " + continueAfterLogOut);
        clickOnElement(continueAfterLogOut);
    }

    public void clickOnMyAccountLink() {
        log.info("Clicking on My Account Link : " + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public void clickOnContinue1() {
        log.info("Clicking on continue button : " + continueButton1.toString());
        clickOnElement(continueButton1);
    }
}
