@regression
Feature:NopCommerce demo Login Test
  As a user,I am able to Register successfully


  @author_vijay @smoke  @regression
  Scenario: Verify User Should Navigate To Register Page Successfully
    Given     I am on home page
    When      I Click on Register Link
    Then      I Verify "Register" text

  @author_vijay @sanity
  Scenario Outline: Verify That FirstName LastName EmailPassword And ConfirmPassword Fields Are Mandatory
    Given     I am on home page
    When      I Click on Register Link
    And       Click on "REGISTER" button
    Then      Verify the error message "<errormessage>"
    Examples:  | errorMessage |
    |First name is required.|
    |Last name is required. |
    |Email is required.     |
    |Password is required.  |
    |Password is required.  |

  @author_vijay @regression
  Scenario: Verify That User Should Create Account Successfully
    Given     I am on Home Page
    When      I Click on Register Link
    And       Select gender "Male"
    And       Enter firstname "vijaykumar"
    And       Enter lastname "china"
    And       Select day "12"
    And       Select month "12"
    And       Select year "1981"
    And       Enter email "vc123@gmail.com"
    And       Enter password "vc123"
    And       Enter Confirm Password "vc123"
    And       Click on "REGISTER" button
    Then      Verify message "Your registration completed"