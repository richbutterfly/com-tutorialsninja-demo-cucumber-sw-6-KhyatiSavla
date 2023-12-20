package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LaptopsAndNotebooksSteps {

    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }
    @When("I mouse hoover on tab Laptops & Notebooks and click")
    public void iMouseHooverOnTabLaptopsNotebooksAndClick() {
        new Homepage().clickOnLaptopsAndNoteBooksTab();
    }

    @And("I click on Show All  Laptops & Notebooks option")
    public void iClickOnShowAllLaptopsNotebooksOption() {
        new Homepage().selectMenu("Show AllLaptops & Notebooks");
    }

    @And("I click on Sort By {string}")
    public void iClickOnSortBy(String highToLow) {
        new LaptopsAndNotebookPage().clickOnSortBy(highToLow);
    }

    @Then("I verify the Product price will arrange in High to Low order")
    public void iVerifyTheProductPriceWillArrangeInHighToLowOrder() {
        Assert.assertEquals(new LaptopsAndNotebookPage().priceHighToLow(), new LaptopsAndNotebookPage().getPriceHighToLow());
    }
    @And("I select Product {string}")
    public void iSelectProductMacBook(String arg0) {
        new LaptopsAndNotebookPage().clickOnMacBook();
    }

    @Then("I can see the text {string}")
    public void iCanSeeTheTextMacBook(String arg0) {
        Assert.assertEquals(new ProductPage().verifyTextMacBook(),"MacBook");
    }

    @And("I click on ‘Add To Cart’ button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCart();
    }

    @Then("I can see the message {string}")
    public void iCanSeeTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals(new ProductPage().verifySuccessMsgForMacBook(),"Success: You have added MacBook to your shopping cart!","Error message");
    }

    @And("I click on link {string} displayed into success message")
    public void iClickOnLinkShoppingCartDisplayedIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCart();
    }

    @Then("I can able to see the text {string}")
    public void iCanAbleToSeeTheText(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().verifyTextShoppingCart(),"Shopping Cart (0.00kg)");
    }

    @Then("I can able to see the Product name {string}")
    public void iCanAbleToSeeTheProductName(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().verifyTextMacBook(),"MacBook");
    }

    @And("I change Quantity to {int}")
    public void iChangeQuantityTo(int arg0) {
        new ShoppingCartPage().changeQty();
    }

    @And("I click on {string} Tab")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateSymbol();
    }

    @Then("I can see the Total £{double}")
    public void iCanSeeTheTotal£(int arg0, int arg1) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheModifyCartText(),"Success: You have modified your shopping cart!");
    }

    @And("I click on {string} button")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @Then("I can see the Text {string}")
    public void iCanSeeTheTextNewCustomer() {
        Assert.assertEquals(new CheckOutPage().verifyCheckOutText(),"Checkout","Error message");
    }

    @And("I click on {string} radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        new CheckOutPage().clickOnGuestCheckOut();
    }

    @And("I click on {string} tab")
    public void iClickOnContinueTab() {
        new CheckOutPage().clickOnGuestContinue();
    }

    @And("I fill the mandatory fields")
    public void iFillTheMandatoryFields() {
        new CheckOutPage().enterFirstName("Khyati");
        new CheckOutPage().enterLastName("Savla");
        new CheckOutPage().enterEmail("Khyati123@gmail.com");
        new CheckOutPage().enterPhoneNumber("04545455454");
        new CheckOutPage().enterAddress1("11 Abc Road");
        new CheckOutPage().enterCity("London");
        new CheckOutPage().enterPostCode("AB1 CD2");
        new CheckOutPage().selectCountry("United Kingdom");
        new CheckOutPage().selectRegion("Greater London");
    }

    @And("I click on {string} Button")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnLastContinueCheckOutButton();
    }

    @And("I add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new CheckOutPage().enterComments("Handle it carefully");
    }

    @And("I check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        new CheckOutPage().clickOnAgree();
    }

    @Then("I can see the message {string} in middle page")
    public void iCanSeeTheMessageWarningPaymentMethodRequiredInMiddlePage() {
        Assert.assertEquals(new CheckOutPage().verifyPaymentWarningText(),"Warning: Payment method required!");
    }


}
