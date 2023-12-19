package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']//label")
    WebElement genderRadios;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement dateOfBirthYear;

    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerBtn;

    @CacheLookup
    @FindBy(className = "field-validation-error")
    WebElement fieldValidationErrors;

    @CacheLookup
    @FindBy(css = ".result")
    WebElement yourRegCompletedText;

    @CacheLookup
    @FindBy(css = ".button-1.register-continue-button")
    WebElement continueBtn;


    public String verifyRegisterText() {
        log.info("Getting register text " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void clickOnRadioButton() {
        clickOnElement(genderRadios);
    }

    public void enterFirstName(String value) {
        log.info("Enter first name " + firstNameField.toString());
        sendTextToElement(firstNameField, value);
    }

    public void enterLastName(String value) {
        log.info("Enter last name " + lastNameField.toString());
        sendTextToElement(lastNameField, value);
    }

    public void selectDate(String value) {
        log.info("Enter Date " + dateOfBirthDay.toString());
        selectByVisibleTextFromDropDown(dateOfBirthDay, value);
    }

    public void selectMonth(String value) {
        log.info("Enter Date " + dateOfBirthMonth.toString());
        selectByVisibleTextFromDropDown(dateOfBirthMonth, value);
    }

    public void selectYear(String value) {
        log.info("Enter Date " + dateOfBirthYear.toString());
        selectByVisibleTextFromDropDown(dateOfBirthYear, value);
    }

    public void enterEmail(String value) {
        log.info("Enter Email " + emailField.toString());
        sendTextToElement(emailField, value);
    }

    public void enterPassword(String value) {
        log.info("Enter Password " + passwordField.toString());
        sendTextToElement(passwordField, value);
    }

    public void enterConfirmPassword(String value) {
        log.info("Enter confirmPassword " + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, value);
    }

    public void clickOnRegisterButton() {
        log.info("Click On Register Button " + registerBtn.toString());
        clickOnElement(registerBtn);
    }

    public String getValidationText() {
        log.info("Getting Validation Text " + fieldValidationErrors.toString());
        return getTextFromElement(fieldValidationErrors);
   }

}