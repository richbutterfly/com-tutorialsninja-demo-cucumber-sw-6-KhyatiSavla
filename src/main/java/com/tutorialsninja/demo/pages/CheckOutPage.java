package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement textCheckOut;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement textNewCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckOut;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement emailId;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonLast;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement comments;

    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement agree;

    @CacheLookup
    @FindBy(xpath = "//input[@name = 'agree']")
    WebElement guestContinueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-warning alert-dismissible']")
    WebElement warningText;

    public String verifyCheckOutText() {
        log.info("Getting text from : " + textCheckOut.toString());
        return getTextFromElement(textCheckOut);
    }

    public String verifyNewCustomerText() {
        log.info("Getting text from : " + textNewCustomerText.toString());
        return getTextFromElement(textNewCustomerText);
    }

    public void clickOnGuestCheckOut() {
        log.info("Clicking on guest check out : " + guestCheckOut.toString());
        clickOnElement(guestCheckOut);
    }

    public void clickOnContinueButton() {
        log.info("Clicking on continue Button : " + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void enterFirstName(String firstname) {
        log.info("Entering First name : " + firstName.toString());
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname) {
        log.info("Entering Last name : " + lastName.toString());
        sendTextToElement(lastName, lastname);
    }

    public void enterEmail(String email) {
        log.info("Entering Email Id : " + emailId.toString());
        sendTextToElement(emailId, email);
    }

    public void enterPhoneNumber(String value) {
        log.info("Entering Phone number : " + telephone.toString());
        sendTextToElement(telephone, value);
    }

    public void enterAddress1(String value) {
        log.info("Entering email address : " + address1.toString());
        sendTextToElement(address1, value);
    }

    public void enterCity(String value) {
        log.info("Entering city : " + city.toString());
        sendTextToElement(city, value);
    }

    public void enterPostCode(String value) {
        log.info("Entering Post code : " + postcode.toString());
        sendTextToElement(postcode, value);
    }

    public void selectCountry(String value) {
        log.info("Selecting country from : " + country.toString());
        selectByVisibleTextFromDropDown(country, value);
    }

    public void selectRegion(String value) {
        log.info("Selecting Region from : " + region.toString());
        selectByVisibleTextFromDropDown(region, value);
    }

    public void clickOnLastContinueCheckOutButton() {
        log.info("Clicking on continue button for check out: " + continueButtonLast.toString());
        clickOnElement(continueButtonLast);
    }

    public void enterComments(String value) {
        log.info("Entering comments into : " + comments.toString());
        sendTextToElement(comments, value);
    }

    public void clickOnAgree() {
        log.info("Clicking on Agree button : " + agree.toString());
        clickOnElement(agree);
    }

    public void clickOnGuestContinue() {
        log.info("Clicking on continue button for guest: " + guestContinueButton.toString());
        clickOnElement(guestContinueButton);
    }

    public String verifyPaymentWarningText() {
        log.info("Getting warning text from : " + warningText.toString());
        return getTextFromElement(warningText);
    }
}
