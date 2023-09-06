Feature: Login Functionality

  Background: 
    Given User is Open Application Url
    And User Navigate to Login Page

  @Regration @all @smoke
  Scenario Outline: Login With Valid Credentials
    When User Enter  valid Email <email>
    And User Enter valid Password <password>
    And Clicks on "Login" button
    Then User Should be able to login Successfully

    Examples: 
      | email                  | password     |
      | selenium9779@gmail.com | selenium9779 |
      | Selenium993@gmail.com  | Selenium99   |
      | Selenium9993@gmail.com | Selenium999  |

  @Regration @all 
  Scenario: Login with invalid Credentials
    When User Enter  Invalid Email 
    And User Enter  Invalid Password
    And Clicks on "Login" button
    Then User Should Not able to login Successfully
    And User should get Warrning massage

   @all @smoke
  Scenario Outline: 
    : Login with Invalid Email and Valid Password

    When User Enter  Invalid Email
    And User Enter valid Password <password>
    And Clicks on "Login" button
    Then User Should Not able to login Successfully
    And User should get Warrning massage

    Examples: 
      | password     |
      | selenium9779 |

@Regration @all @smoke
  Scenario Outline: Login with Valid Email and Invalid Password

    When User Enter  valid Email <email>
    And User Enter  Invalid Password
    And Clicks on "Login" button
    Then User Should Not able to login Successfully
    And User should get Warrning massage

    Examples: 
      | email                  |
      | selenium9779@gmail.com |

 @Regration @all @smoke
  Scenario: Login with empty fields
    When User Not Enter Email
    And user Not Enter Password
    And Clicks on "Login" button
    Then User Should Not able to login Successfully
    And User should get Warrning massage

  @Regration @all 
  Scenario: Forget password Link is available on login page or not
    When user is click on "Forget password" link
    Then user is navigate to Forget password link
