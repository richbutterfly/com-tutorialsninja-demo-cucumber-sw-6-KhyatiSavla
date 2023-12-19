package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.Homepage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {

    @When("I mouse hoover on Desktops tab and click")
    public void iMouseHooverOnDesktopsTabAndClick() {
        new Homepage().clickOnDesktopsTab();
    }

    @And("I click on Show All Desktops option")
    public void iClickOnShowAllDesktopsOption() {
        new Homepage().selectMenu("Show AllDesktops");
    }

    @Then("I should navigate to desktops page successfully")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        Assert.assertEquals(new DesktopPage().getDesktopsText(), "Desktops", "Desktops page is not displayed");
    }

    @When("I mouse hoover on Laptops & Notebooks tab and click")
    public void iMouseHooverOnLaptopsNotebooksTabAndClick() {
        new Homepage().clickOnLaptopsAndNoteBooksTab();
    }

    @And("I click on Show All Laptops & Notebooks")
    public void iClickOnShowAllLaptopsNotebooks() {
        new Homepage().selectMenu("Show AllLaptops & Notebooks");
    }
    @Then("I should navigate to Laptops & Notebooks page successfully")
    public void iShouldNavigateToLaptopsNotebooksPageSuccessfully() {
        Assert.assertEquals(new LaptopsAndNotebookPage().verifyTextLaptopsAndNotebooks(),"Laptops & Notebooks", "Laptops And Notebook Page is not displayed");
    }

    @When("I mouse hoover on Components tab and click")
    public void iMouseHooverOnComponentsTabAndClick() {
        new Homepage().clickOnComponents();
    }

    @And("I click on Show All Components under components tab")
    public void iClickOnShowAllComponentsUnderComponentsTab() {
        new Homepage().selectMenu("Show AllComponents");
    }

    @Then("I should navigate successfully to Components page")
    public void iShouldNavigateSuccessfullyToComponentsPage() {
        Assert.assertEquals(new ComponentsPage().verifyComponentsText(),"Components", "Components page is not displayed");
    }
}
