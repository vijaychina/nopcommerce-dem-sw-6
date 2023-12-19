package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("Click on Computer tab")
    public void clickOnComputerTab() {
        new HomePage().clickOnComputer();
    }

    @Then("Verify {string} text")
    public void verifyText(String message) {
        String actualText = new HomePage().getComputerText();
        Assert.assertEquals(actualText, "Computers");
    }

    @And("Click on Desktops link")
    public void clickOnDesktopsLink() {
        new ComputerPage().clickOnDesktop();
    }

    @Given("I am on computer page")
    public void iAmOnComputerPage() {
    }

    @Then("Click on product name {string}")
    public void clickOnProductName(String computer) {
        new DesktopsPage().clickOnBuildYourComputer();
    }

    @And("Select processor {string}")
    public void selectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("Select RAM {string}")
    public void selectRAM(String ram) {
        new BuildYourOwnComputerPage().sendRAMName(ram);
    }

    @And("Select HDD {string}")
    public void selectHDD(String hdd) {
        new BuildYourOwnComputerPage().sendHDDName(hdd);
    }

    @And("Select OS {string}")
    public void selectOS(String os) {
        new BuildYourOwnComputerPage().sendOSName(os);
    }

    @And("Select Software {string}")
    public void selectSoftware(String software) {
        new BuildYourOwnComputerPage().sendSoftwareName(software);
    }

    @And("Click on {string} Button")
    public void clickOnButton(String button) {
        new BuildYourOwnComputerPage().clickOnAddToCart();


    }
}