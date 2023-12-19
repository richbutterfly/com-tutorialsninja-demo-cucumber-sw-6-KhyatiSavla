package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AccountPage;
import com.tutorialsninja.demo.pages.Homepage;
import com.tutorialsninja.demo.pages.LogOutPage;
import com.tutorialsninja.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on My account link")
    public void iClickOnMyAccountLink() {
        new Homepage().clickOnMyAccount();
    }

    @And("I click on {string} from options")
    public void iClickOnFromOptions(String option) {
        new Homepage().selectMyAccountOptions(option);
    }

    @Then("I should navigate to Register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals(new RegisterPage().verifyTextRegisterAccount(),"Register Account");
    }

    @And("I enter All the mandatory field for registration")
    public void iEnterAllTheMandatoryFieldForRegistration() {
        new RegisterPage().enterFirstName("Khyati");
        new RegisterPage().enterLastName("Savla");
        new RegisterPage().enterEmailId("Khyati123@gmail.com");
        new RegisterPage().enterTelephone("04545455454");
        new RegisterPage().enterPassword("khyati123");
        new RegisterPage().enterConfirmPassword("khyati123");
    }


    @And("I select Subscribe Yes radio button")
    public void iSelectSubscribeYesRadioButton() {
        new RegisterPage().clickOnYesRadioButton();
    }

    @And("I click on Privacy Policy check box")
    public void iClickOnPrivacyPolicyCheckBox() {
        new RegisterPage().clickOnPrivatePolicyCheckBox();
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }

    @Then("I verify the message “Your Account Has Been Created!”")
    public void iVerifyTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new AccountPage().verifyYourAccountHasBeenCreated(),"Your Account Has Been Created!");
    }

    @When("I click on Continue button after that")
    public void iClickOnContinueButtonAfterThat() {
        new AccountPage().clickOnContinueAfterRegisterAccount();
    }
    @And("I click on My Account Link  on account page")
    public void iClickOnMyAccountLinkOnAccountPage() {
        new AccountPage().clickOnMyAccountLink();
    }

    @And("I click on Log out option")
    public void iClickOnLogOutOption() {
        new Homepage().selectMyAccountOptions("Logout");
    }

    @Then("I should succeessfully logged out form that account")
    public void iShouldSucceessfullyLoggedOutFormThatAccount() {
        Assert.assertEquals(new LogOutPage().verifyTextAccountLogOut(),"Account Logout");
    }

    @And("I should see the homepage")
    public void iShouldSeeTheHomepage() {
        new LogOutPage().clickOnContinueAfterLogOut();
    }


}
