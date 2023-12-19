package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class);
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    WebElement desktopTab;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement laptopsAndNoteBooks;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
    WebElement showAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllComponents']")
    WebElement showAllComponents;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-caret-down']")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement poundSterling;

     public void selectMenu(String menu) {
         //listOfProductsElement(topMenuList, menu);
         WebElement menuList = driver.findElement(By.linkText(menu));
         Actions actions = new Actions(driver);
         actions.moveToElement(menuList).click().build().perform();
         log.info("Select menu option : " + menu.toString());
     }

    public void mouseHooverOnDesktops() {
        selectMenu("Desktops");
    }

    public void clickOnShowAllDesktops() {
        log.info("Clicking on Show All Desktops : " + showAllDesktops.toString());
        clickOnElement(showAllDesktops);
    }

    public void mouseHooverOnLaptopsAndNotebooks() {
        selectMenu("Laptops & Notebooks");
    }

    public void clickOnShowAllLaptopsAndNotebooks() {
        log.info("Clicking on Show All Laptops And Notebooks : " + showAllLaptopsAndNotebooks.toString());
        clickOnElement(showAllLaptopsAndNotebooks);
    }

    public void mouseHooverOnComponents() {
        selectMenu("Components");
    }

    public void clickOnComponents() {
        log.info("Clicking on Components : " + components.toString());
        clickOnElement(components);
    }

    public void clickOnShowAllComponents() {
        log.info("Clicking on Show All Components : " + showAllComponents.toString());
        clickOnElement(showAllComponents);
    }

    public void clickOnCurrencyDropDown() {
        log.info("Clicking on Currency Drop Down : " + currency.toString());
        clickOnElement(currency);
    }

    public void clickOnPoundSterling() {
        log.info("Clicking on Pound Sterling : " + poundSterling.toString());
        clickOnElement(poundSterling);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class = 'list-inline']//a"));
        for (WebElement list : options) {
            if (option.equalsIgnoreCase(list.getText())) {
                list.click();
                break;
            }
        }
    }

    public void clickOnMyAccount() {
        selectMyAccountOptions("My Account");
    }

    public void clickOnDesktopsTab() {
        log.info("Clicking on Desktops tab : " + desktopTab.toString());
        mouseHoverToElementAndClick(desktopTab);
    }

    public void clickOnLaptopsAndNoteBooksTab() {
        log.info("Clicking on Laptops And NoteBooks Tab : " + laptopsAndNoteBooks.toString());
        mouseHoverToElementAndClick(laptopsAndNoteBooks);
    }
}
