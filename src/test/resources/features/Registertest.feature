Feature: Register Test
  As a user,
  I want to register on tutorials ninja website successfully

  Background: I am on HomePage

  @sanity
  Scenario: Verify User Should Navigate To Register Page Successfully
    When  I click on My account link
    And   I click on "Register" from options
    Then  I should navigate to Register page successfully

  @regression
  Scenario: Verify That User Register Account Successfully
    When  I click on My account link
    And   I click on "Register" from options
    And   I enter All the mandatory field for registration
    And   I select Subscribe Yes radio button
    And   I click on Privacy Policy check box
    And   I click on Continue button
    Then  I verify the message “Your Account Has Been Created!”
    When  I click on Continue button after that
    And   I click on My Account Link  on account page
    And   I click on Log out option
    Then  I should succeessfully logged out form that account
    And   I should see the homepage