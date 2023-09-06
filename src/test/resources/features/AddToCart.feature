Feature: Add to Cart Functionality

  Background: 
    Given User is Open Application Url

  @Regration @all
  Scenario: Add Product to Cart
    Given Search valid product "SmartPhone"
    When clicks on add to cart button
    Then Product should display on Cart List

  @all @smoke
  Scenario: Remove Product From Cart
    Given Search valid product "SmartPhone"
    And clicks on add to cart button
    Then Product should display on Cart List
    When Click the remove checkBox
    And Clicks of update Shopping cart button
    Then Product should remove from Cart List
