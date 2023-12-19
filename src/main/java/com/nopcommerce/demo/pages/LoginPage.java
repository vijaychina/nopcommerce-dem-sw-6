package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logout;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement logInLink;


    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("email " + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("password " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("login button " + loginButton.toString());
    }

    public String getLogOutText() {
        log.info(" Verify Logout Text " + errorMessage.toString());
        String message = getTextFromElement(logout);
        return message;
    }

    public String getErrorMessage() {
        log.info("Getting Text from " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void clickOnLogOutLink() {
        log.info("logout Link " + logout.toString());
        clickOnElement(logout);
    }

    public String getLogInText() {
        log.info("Getting Login text " + logInLink.toString());
        String message = getTextFromElement(logInLink);
        return message;


    }
}