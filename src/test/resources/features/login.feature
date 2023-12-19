@regression
Feature: NopCommerce demo Login Test
  As a user,I am able to login successfully

  @author_vijay @smoke
  Scenario: User Should Navigate To Login Page SuccessFully
    Given     I am on Home Page
    When      Click on login link
    Then      Navigate to LoginPage
    And       verify that "Welcome, Please Sign In!" message display

  @author_vijay  @smoke @regression
  Scenario: Verify The Error Message With InValid Credentials
    Given     I am on Home Page
    When      Click on login link
    And       Enter EmailId "white123@gmail.com"
    And       Enter Password "white123"
    And       Click on Login Button
    Then      Verify that the Error message

  @author_vijay @regression
  Scenario: Verify That User Should Log In SuccessFully With Valid Credentials
    Given     I am on Home Page
    When      Click on login link
    And       Enter EmailId "pink123@gmail.com"
    And       Enter Password "pink123"
    And       Click on Login Button
    Then      Verify that LogOut link is display

  @author_vijay @regression
  Scenario: Verify That User Should LogOut SuccessFully
    Given     I am on Home Page
    When      Click on login link
    And       Enter EmailId "pink123@gmail.com"
    And       Enter Password "pink123"
    And       Click on Login Button
    And       Click on LogOut Link
    Then      Verify that LogIn Link Display