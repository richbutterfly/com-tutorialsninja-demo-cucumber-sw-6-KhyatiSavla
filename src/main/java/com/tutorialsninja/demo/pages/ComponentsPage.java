package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class);

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;

    public String verifyComponentsText() {
        log.info("Getting text from : " + componentsText.toString());
        return getTextFromElement(componentsText);
    }
}
