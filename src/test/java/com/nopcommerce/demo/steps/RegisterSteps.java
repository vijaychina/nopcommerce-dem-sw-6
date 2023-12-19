package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I Click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I Verify {string} text")
    public void iVerifyText(String text) {
        String actualText = new RegisterPage().verifyRegisterText();
        Assert.assertEquals(actualText, "Register");
    }

    @And("Click on {string} button")
    public void clickOnButton(String button) {
        //new RegisterPage().clickOnRadioButton();
    }

    @Then("Verify the error message {string}")
    public void verifyTheErrorMessage(String message) {
    }

    @And("Select gender {string}")
    public void selectGender(String female) {
        new RegisterPage().clickOnRadioButton();
    }

    @And("Enter firstname {string}")
    public void enterFirstname(String name) {
        new RegisterPage().enterFirstName("vijaykumar");
    }

    @And("Enter lastname {string}")
    public void enterLastname(String name) {
        new RegisterPage().enterLastName("china");
    }

    @And("Select day {string}")
    public void selectDay(String day) {
        new RegisterPage().selectDate("12");
    }

    @And("Select month {string}")
    public void selectMonth(String month) {
        new RegisterPage().selectMonth("December");
    }

    @And("Select year {string}")
    public void selectYear(String year) {
        new RegisterPage().selectYear("1981");
    }

    @And("Enter email {string}")
    public void enterEmail(String email) {
        new RegisterPage().enterEmail("vc123@gmail.com");
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        new RegisterPage().enterPassword("vc123");
    }

    @And("Enter Confirm Password {string}")
    public void enterConfirmPassword(String password) {
        new RegisterPage().enterConfirmPassword("vc123");
    }

    @Then("Verify message {string}")
    public void verifyMessage(String message) {
        String actualText = new RegisterPage().getValidationText();
        Assert.assertEquals(actualText, "Your registration completed");
    }
}