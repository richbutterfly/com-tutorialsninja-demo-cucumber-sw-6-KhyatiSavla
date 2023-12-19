package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(LogOutPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement textAccountLogOut;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement continueAfterLogOut;

    public String verifyTextAccountLogOut() {
        log.info("Getting text from : " + textAccountLogOut.toString());
        return getTextFromElement(textAccountLogOut);
    }

    public void clickOnContinueAfterLogOut() {
        log.info("Clicking on Login Button : " + continueAfterLogOut.toString());
        clickOnElement(continueAfterLogOut);
    }
}
