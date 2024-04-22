package com.ilcarro.stepDefinitions;

import com.ilCarro.Pages.AddCarPage;
import com.ilCarro.Pages.HomePage;
import com.ilCarro.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Random;

import static com.ilCarro.Pages.BasePage.driver;

public class AddCarSteps {
    @And("User clicks on OK button in the dialog box")
    public void click_on_OK_button() {
        new LoginPage(driver).clickOnOKButton();
    }
    @And("User clicks on Let the car work link")
    public void click_on_Let_the_car_work_link() {
        new HomePage(driver).clickOnLetCarWorkLink();
    }
    Random random = new Random();
        int i = random.nextInt(1000)+1000;
    @And("User fills out the form")
    public void fill_the_form() {
        new AddCarPage(driver).fillForm(
                "Ashdod",
                "Lexus",
                "RX450h",
                "2014",
                "Hybrid",
                "5",
                "SUV",
                "999-" + i + "-988",
                "100",
                "Lexus is the best car");
    }
    @And("User clicks on Submit button")
    public void click_on_Submit_button() {
        new AddCarPage(driver).clickSubmitButton();
    }
    @Then("User verifies Message is displayed")
    public void verify_Message() {
        new AddCarPage(driver).is_Display_Message("Car added");
    }
}
