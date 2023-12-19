package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AccountPage;
import com.tutorialsninja.demo.pages.Homepage;
import com.tutorialsninja.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    @Then("I should navigate to Login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals(new LoginPage().verifyReturningCustomerText(), "Returning Customer");
    }

    @And("I click on {string} from My account options")
    public void iClickOnFromMyAccountOptions(String option) {
        new Homepage().selectMyAccountOptions(option);
    }

    @And("I enter Email address")
    public void iEnterEmailAddress() {
        new LoginPage().enterEmailId("prime04@gmail.com");
    }

    @And("I enter Password")
    public void iEnterPassword() {
        new LoginPage().enterPassword("khyati123");
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String arg0) {
        Assert.assertEquals(new AccountPage().verifyTextMyAccount(), "My Account");
    }

    @And("I click on My Account Link")
    public void iClickOnMyAccountLink() {
        new AccountPage().clickOnMyAccountLink();
    }
}
