Feature: Top Menu Test
  As a user,
  I want to check all the top menu options are working properly

  Background: I am on Homepage
@sanity
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    When  I mouse hoover on Desktops tab and click
    And   I click on Show All Desktops option
    Then  I should navigate to desktops page successfully

  @smoke
  Scenario: Verify User Should Navigate To Laptops And Notebooks Page Successfully
    When  I mouse hoover on Laptops & Notebooks tab and click
    And   I click on Show All Laptops & Notebooks
    Then  I should navigate to Laptops & Notebooks page successfully

  @regression
  Scenario: Verify User Should Navigate To Components Page Successfully
    When  I mouse hoover on Components tab and click
    And   I click on Show All Components under components tab
    Then  I should navigate successfully to Components page