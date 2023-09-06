@abcd
Feature: Register Functionality

  Background: 
    Given User is Open Application Url
    And User Navigate to Register Page
@Regration @all @smoke
  Scenario: Register with Mandetory Field
    When User Enter Details into Below Fields
      | FirstName       | Selenium   |
      | LastName        | Java       |
      | Password        | Selenium99 |
      | ConfirmPassword | Selenium99 |
    And Clicks On "Register" button
    Then User Should able  to successfully Register
    And Get Successfull Register massage

@Regration @all 
  Scenario: Register With all Field
    And Clicks on gender button
    When User Enter Details into Below Fields
      | FirstName       | Selenium1   |
      | LastName        | Java1       |
      | Password        | Selenium999 |
      | ConfirmPassword | Selenium999 |
    And Clicks On "Register" button
    Then User Should able  to successfully Register
    And Get Successfull Register massage

 @all @smoke
  Scenario Outline:  Register With Duplicate Email

    When User Enter Details into Below Fields
      | FirstName       | Selenium1   |
      | LastName        | Java1       |
      | Password        | Selenium999 |
      | ConfirmPassword | Selenium999 |
    And Enter duplicate Email <Email>
    And Clicks On "Register" button
    Then User Should Not able  to Register
    And User should get Warrning massage for duplicate Email

    Examples: 
      | Email                  |
      | selenium9779@gmail.com |
      
@Regration @all @smoke
  Scenario: Register Without empty Field
    When Clicks On "Register" button
    Then User Should Not able  to Register
    And User should get Warrning massage for each mandatory Field
