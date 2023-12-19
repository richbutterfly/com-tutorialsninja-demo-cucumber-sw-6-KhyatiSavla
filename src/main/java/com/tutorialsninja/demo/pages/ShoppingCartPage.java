package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class);
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement textShoppingCart;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'HP LP3065')])[2]")
    WebElement textHPLP3065;

    @CacheLookup
    @FindBy(xpath = "//small[normalize-space()='Delivery Date:2011-04-22']")
    WebElement textDeliveryDate;

    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement modelName;

    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[6]")
    WebElement totalAmount;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'MacBook')])[2]")
    WebElement textMacBook;

    @CacheLookup
    @FindBy(xpath = "(//input[@name='quantity[85528]'])[1]")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "(//i[@class='fa fa-refresh'])[1]")
    WebElement updateSymbol;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement textModifiedCart;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOut;

    public String verifyTextShoppingCart() {
        log.info("Getting text from : " + textShoppingCart.toString());
        return getTextFromElement(textShoppingCart);
    }

    public String verifyTextHPLP3065() {
        log.info("Getting text from : " + textHPLP3065.toString());
        return getTextFromElement(textHPLP3065);
    }

    public String verifyTextDeliveryDate() {
        log.info("Getting text from : " + textDeliveryDate.toString());
        return getTextFromElement(textDeliveryDate);
    }

    public String verifyModelName() {
        log.info("Getting text from : " + modelName.toString());
        return getTextFromElement(modelName);
    }

    public String verifyTotalAmount() {
        log.info("Getting text from : " + totalAmount.toString());
        return getTextFromElement(totalAmount);
    }

    public String verifyTextMacBook() {
        log.info("Getting text from : " + textMacBook.toString());
        return getTextFromElement(textMacBook);
    }

    public void clickOnUpdateSymbol() {
        log.info("Clicking on Update Symbol : " + updateSymbol.toString());
        clickOnElement(updateSymbol);
    }

    public String verifyTheModifyCartText() {
        log.info("Getting text from : " + textModifiedCart.toString());
        return getTextFromElement(textModifiedCart);
    }

    public void clickOnCheckOutButton() {
        log.info("Clicking on CheckOut Button : " + checkOut.toString());
        clickOnElement(checkOut);
    }


    public void changeQty() {
        log.info("Changing the quantity into : " + quantity.toString());
        quantity.clear();
        sendTextToElement(quantity, "2");
    }
}
