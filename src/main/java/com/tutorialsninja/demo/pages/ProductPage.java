package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='HP LP3065']")
    WebElement productHPLP;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMsgForMacBook;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(id = "//input[@id='input-quantity']")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement textMacBook;

    public String verifyProductText() {
        log.info("Getting text from : " + productHPLP.toString());
        return getTextFromElement(productHPLP);
    }

    public void clickOnAddToCart() {
        log.info("Clicking on Add to Cart : " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String verifySuccessText() {
        log.info("Getting text from : " + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCart() {
        log.info("Clicking on Shopping cart : " + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

    public void enterQuantity(String qty) {
        log.info("Entering quantity : " + quantity.toString());
        sendTextToElement(quantity, "1");
    }

    public String verifyTextMacBook() {
        log.info("Getting text from : " + textMacBook.toString());
        return getTextFromElement(textMacBook);
    }

    public String verifySuccessMsgForMacBook() {
        log.info("Getting text from : " + successMsgForMacBook.toString());
        return getTextFromElement(successMsgForMacBook);
    }

    public void datePicker() {
        String year = "2023";
        String month = "November";
        String date = "27";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }
}
