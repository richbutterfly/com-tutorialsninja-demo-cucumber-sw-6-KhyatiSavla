package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.Homepage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsSteps {
    @When("I mouse hover and click on desktop tab")
    public void iMouseHoverAndClickOnDesktopTab() {
        new Homepage().clickOnDesktopsTab();
    }

    @And("I click on show all desktops")
    public void iClickOnShowAllDesktops() {
        new Homepage().clickOnShowAllDesktops();
    }

    @And("I click on sort by position")
    public void iClickOnSortByPosition() {
    }

    @And("I select product sort by {string}")
    public void iSelectProductSortBy(String zToA) {
        new DesktopPage().clickOnSortBy(zToA);
    }

    @Then("I should see product arrange in alphabetical order successfully")
    public void iShouldSeeProductArrangeInAlphabeticalOrderSuccessfully() {
        Assert.assertEquals(new DesktopPage().getProductsNameList(), new DesktopPage().getSortedProductList());
    }

    @And("I select currency {string}")
    public void iSelectCurrency(String arg0) {
        new Homepage().clickOnCurrencyDropDown();
    }

    @And("I select product {string}")
    public void iSelectProduct(String productName) {
        new DesktopPage().clickOnHPLP3065(productName);
    }

    @Then("I should navigate to {string} product page")
    public void iShouldNavigateToProductPage(String productName) {
        Assert.assertEquals(productName, new ProductPage().verifyProductText());
    }

    @And("I select date {string},{string},{string}")
    public void iSelectDate(String arg0, String arg1, String arg2) {
        new ProductPage().datePicker();
    }

    @And("I add quantity {string} for product")
    public void iAddQuantityForProduct(String quantity) {
        new ProductPage().enterQuantity(quantity);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCart();
    }

    @Then("I should see product added successfully message")
    public void iShouldSeeProductAddedSuccessfullyMessage() {
        Assert.assertTrue(new ProductPage().verifySuccessText().contains("Success: You have added HP LP3065 to your shopping cart!"));
    }

    @And("I click on shopping cart button")
    public void iClickOnShoppingCartButton() {
        new ProductPage().clickOnShoppingCart();
    }

    @Then("I should see shopping cart text")
    public void iShouldSeeShoppingCartText() {
        Assert.assertTrue(new ShoppingCartPage().verifyTextShoppingCart().contains("Shopping Cart"));
    }

    @And("I should see {string} product name")
    public void iShouldSeeProductName(String arg0) {
        Assert.assertEquals("HP LP3065", new ShoppingCartPage().verifyTextHPLP3065());
    }

    @And("I should see {string} delivery date")
    public void iShouldSeeDeliveryDate(String arg0) {
        Assert.assertTrue(new ShoppingCartPage().verifyTextDeliveryDate().contains("2022-11-30"));
    }

    @And("I should see {string} model name")
    public void iShouldSeeModelName(String arg0) {
        Assert.assertEquals("Product 21", new ShoppingCartPage().verifyModelName());
    }

    @And("I should see total price")
    public void iShouldSeeTotalPrice() {
        Assert.assertEquals("£74.73", new ShoppingCartPage().verifyTotalAmount());
    }
}
