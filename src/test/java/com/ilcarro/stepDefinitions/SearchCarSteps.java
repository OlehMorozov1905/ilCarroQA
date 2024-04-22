package com.ilcarro.stepDefinitions;

import com.ilCarro.Pages.HomePage;
import com.ilCarro.Pages.SearchCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.Pages.BasePage.driver;

public class SearchCarSteps {
    @And("User clicks on search link")
    public void click_on_search_link() {
        new HomePage(driver).clickOnSearchLink();
    }
    @And("User enters data into the form")
    public void enter_data_into_the_form() {
        new SearchCarPage(driver).enterDataIntoTheForm("Ashdod", "4/25/2024 - 4/27/2024");
    }
    @And("User clicks on the Yalla button")
    public void click_on_the_Yalla_button() {
        new SearchCarPage(driver).clickOnTheYallaButton();
    }
    @Then("User verifies found car is displayed")
    public void verify_found_car_is_displayed() {
        new SearchCarPage(driver).verifyFoundCarIsDisplayed();
    }
}
