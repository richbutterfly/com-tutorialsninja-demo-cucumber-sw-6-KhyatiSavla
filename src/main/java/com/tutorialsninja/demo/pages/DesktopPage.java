package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class);
    @CacheLookup
    @FindBy(tagName = "h2")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    WebElement productPath;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement productHPLP3065;

    public String getDesktopsText() {
        log.info("Getting text from : " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void clickOnSortBy(String sort) {
        log.info("Clicking on Sort By drop down  : " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, sort);
    }

    public void clickOnHPLP3065(String productName) {
        log.info("Clicking on HPLP3065 product : " + productHPLP3065.toString());
        clickOnElement(productHPLP3065);
    }

    public void selectProduct(String product) {
        log.info("Selecting product : " + productPath.toString());
        mouseHoverToElement(productPath);
    }

    public ArrayList<String> getProductsNameList() {
        List<WebElement> products = getListOfElements(productPath);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }

    // Sort By Reverse order
    public ArrayList<String> getSortedProductList() {
        Collections.reverse(getProductsNameList());
        List<WebElement> products = getListOfElements(productPath);
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        return afterSortByZToAProductsName;
    }

    public void selectProductByName(String product) {
        selectByVisibleTextFromDropDown(sortBy, product);
        log.info("Select option product sorted by " + product + "from sort by options " + sortBy.toString());
    }
    }
