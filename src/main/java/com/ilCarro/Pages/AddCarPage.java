package com.ilCarro.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddCarPage extends BasePage{
    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.input-container input:nth-child(1)")
    WebElement locationInput;
    @FindBy(id = "make")
    WebElement manufactureInput;
    @FindBy(id = "model")
    WebElement modelInput;
    @FindBy(id = "year")
    WebElement yearInput;
    @FindBy(id = "fuel")
    WebElement fuelInput;
    @FindBy(id = "seats")
    WebElement seatsInput;
    @FindBy(id = "class")
    WebElement classInput;
    @FindBy(id = "serialNumber")
    WebElement serialNumberInput;
    @FindBy(id = "price")
    WebElement priceInput;
    @FindBy(id = "about")
    WebElement aboutInput;

    public AddCarPage fillForm(
            String city,
            String manufacture,
            String model,
            String year,
            String fuel,
            String seats,
            String claSS,
            String serialNumber,
            String price,
            String text) {

        type(locationInput, city);
        pause(500);
        selectCity();
//        ==========================
        type(manufactureInput, manufacture);
//        =================================
        type(modelInput, model);
//        =====================================
        type(yearInput, year);
//        =====================================
        Select select = new Select(fuelInput);
        select.selectByVisibleText(fuel);
//        ========================================================
        type(seatsInput, seats);
//        ===================================================
        type(classInput, claSS);
//        ===========================================
        type(serialNumberInput, serialNumber);
//        ===================================================
        type(priceInput, price);
//        ========================================
        type(aboutInput, text);
//        ============================================
        return this;
    }
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submitButton;
    public AddCarPage clickSubmitButton() {
        click(submitButton);
        return this;
    }
    @FindBy(xpath = "//h1[contains(text(),'Car added')]")
    WebElement message_;
    public AddCarPage is_Display_Message(String text) {
        pause(500);
        assert message_.getText().contains(text);
        return this;
    }
}
