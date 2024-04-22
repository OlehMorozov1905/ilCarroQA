package com.ilCarro.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchCarPage extends BasePage{

    public SearchCarPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "city")
    WebElement cityInput;
    @FindBy(id = "dates")
    WebElement datesInput;
    @FindBy(css = "html")
    WebElement html;
    public SearchCarPage enterDataIntoTheForm(String city, String dates) {
        type(cityInput, city);
        pause(500);
        selectCity();
        type(datesInput, dates);
        click(html);
        return this;
    }
    @FindBy(xpath = "//button[contains(text(),'Y’alla!')]")
    WebElement yallaButton;
    public SearchCarPage clickOnTheYallaButton() {
        click(yallaButton);
        return this;
    }
    @FindBy (xpath = "//div[@class='car-img-container ng-star-inserted'][1]")
    WebElement foundСar;
    public SearchCarPage verifyFoundCarIsDisplayed() {
        assert foundСar.isDisplayed();
        return this;
    }
}
