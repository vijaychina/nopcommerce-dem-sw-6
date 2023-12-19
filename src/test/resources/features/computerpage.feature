@regression
Feature: NopCommerce demo
  As a user, I am able to navigate to the different page

  @author_vijay @smoke @regression
  Scenario: Verify User Should Navigate To Computer Page Successfully
    Given     I am on Home Page
    When      Click on Computer tab
    Then      Verify "Computer" text

  @author_vijay @regression
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    Given     I am on home page
    When      Click on Computer tab
    And       Click on Desktops link
    Then      Verify "Desktops" text

  @author_vijay @sanity
  Scenario Outline: Verify That User Should Build YouOwnComputer And Add Them To Cart Successfully
    Given             I am on computer page
    When              Click on Computer tab
    And               Click on Desktops link
    Then              Click on product name "Build your own computer"
    And               Select processor "<processor>"
    And               Select RAM "<ram>"
    And               Select HDD "<hdd>"
    And               Select OS "<os>"
    And               Select Software "<software>"
    And               Click on "ADD TO CART" Button


    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00] |