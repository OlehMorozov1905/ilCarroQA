package com.ilCarro.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    public LoginPage enterData(String email, String password) {
        type(emailInput, email);
        type(passwordInput, password);
        return this;
    }
    @FindBy(xpath = "//button[contains(text(),'Y’alla!')]")
    WebElement yallaButton;
    public LoginPage clickOnYallaButton() {
        click(yallaButton);
        return this;
    }

    @FindBy(xpath = "//h2[contains(text(),'Logged in success')]")
    WebElement message;
    public LoginPage isMessageDisplayed(String text) {
        assert message.getText().contains(text);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Ok')]")
    WebElement okButton;
    public HomePage clickOnOKButton() {
        click(okButton);
        return new HomePage(driver);
    }
}
