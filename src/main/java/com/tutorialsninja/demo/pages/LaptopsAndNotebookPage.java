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

public class LaptopsAndNotebookPage extends Utility {

    private static final Logger log = LogManager.getLogger(LaptopsAndNotebookPage.class);
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement textLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='MacBook']")
    WebElement selectProductMacBook;

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> productPriceList;


    public String verifyTextLaptopsAndNotebooks() {
        log.info("Getting text from : " + textLaptopsAndNotebooks.toString());
        return getTextFromElement(textLaptopsAndNotebooks);
    }

    public void clickOnSortBy(String sort) {
        log.info("Clicking on Sort By : " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, sort);
    }

    public void clickOnMacBook() {
        log.info("Clicking on Mac Book : " + selectProductMacBook.toString());
        clickOnElement(selectProductMacBook);
    }
    public List<Double> priceHighToLow() {

        List<WebElement> products = productPriceList;
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        log.info("Verify Product sorted  price High to low " + productPriceList.toString());
        return originalProductsPrice;
    }

    public List<Double> getPriceHighToLow() {
        Collections.sort(priceHighToLow(), Collections.reverseOrder());
        List<WebElement> products = productPriceList;
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        return afterSortByPrice;
    }
}
