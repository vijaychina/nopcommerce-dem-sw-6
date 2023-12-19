package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Desktops'])[3]")
    WebElement desktops;

    public void clickOnDesktop() {
        clickOnElement(desktops);
        log.info("Enter On Desktops " + desktops.toString());
    }
}