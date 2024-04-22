package com.ilcarro.stepDefinitions;

import com.ilCarro.Pages.HomePage;
import com.ilCarro.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.Pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on Login link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enters valid data")
    public void enter_valid_data() {
        new LoginPage(driver).enterData("pulp_fiction2024@gmail.com", "Chelsea$1905");
    }
    @And("User clicks on Yalla button")
    public void click_on_Yalla_button() {
        new LoginPage(driver).clickOnYallaButton();
    }
    @Then("User verifies Success Message is displayed")
    public void verify_Success_Message() {
        new LoginPage(driver).isMessageDisplayed("Logged in success");
    }
}
