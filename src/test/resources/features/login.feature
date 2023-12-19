Feature: Login Test
  As a user,
  I want to Login on tutorials ninja website successfully

  Background: I am on HomePage

  @smoke
  Scenario: verify User Should Navigate To Login Page Successfully
    When  I click on My account link
    And   I click on "Login" from options
    Then  I should navigate to Login page successfully

  @regression
  Scenario: Verify That User Should Login And Logout Successfully
    When  I click on My account link
    And   I click on "Login" from My account options
    And I enter Email address
    And I enter Password
    And I click on Login button
    Then I should see the text "My Account"
    And I click on My Account Link
    And I click on Log out option
    Then I should succeessfully logged out form that account
    And I should see the homepage