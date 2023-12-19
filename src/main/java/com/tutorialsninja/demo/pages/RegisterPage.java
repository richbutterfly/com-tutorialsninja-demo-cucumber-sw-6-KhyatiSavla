package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement textRegisterAccount;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephoneField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement yesRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacyPolicyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public void enterFirstName (String firstname){
        log.info("Entering First Name into : " + firstNameField.toString());
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName (String lastname){
        log.info("Entering Last Name into : " + lastNameField.toString());
        sendTextToElement(lastNameField,lastname);
    }
    public void enterEmailId (String email){
        log.info("Entering email Id into : " + emailField.toString());
        sendTextToElement(emailField,email);
    }
    public void enterTelephone (String telephone){
        log.info("Entering Telephone into : " + telephoneField.toString());
        sendTextToElement(telephoneField,telephone);
    }
    public void enterPassword (String password){
        log.info("Entering Password into : " + passwordField.toString());
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        log.info("Entering Confirm Password into : " + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnYesRadioButton(){
        log.info("Clicking on Yes Radio Button : " + yesRadioButton.toString());
        clickOnElement(yesRadioButton);
    }
    public void clickOnPrivatePolicyCheckBox (){
        log.info("Clicking on Private Policy CheckBox : " + privacyPolicyCheckBox.toString());
        clickOnElement(privacyPolicyCheckBox);
    }
    public void clickOnContinueButton(){
        log.info("Clicking on Continue Button : " + continueButton.toString());
        clickOnElement(continueButton);
    }
    public void clickOnContinueBtn(){
        log.info("Clicking on Continue : " + continueBtn.toString());
        clickOnElement(continueBtn);
    }

    public String verifyTextRegisterAccount (){
        log.info("Getting text from : " + textRegisterAccount.toString());
        return getTextFromElement(textRegisterAccount);
    }

}
