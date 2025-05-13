package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBox extends CommonActions {
    @FindBy(id = "userName")
    private WebElement userNameInput;

    @FindBy(id = "userEmail")
    private WebElement userEmailInput;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "output")
    private WebElement output;

    public TextBox(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String userName, String userEmail, String currentAddress, String permanentAddress) {
        sendKeys(userNameInput, userName);
        sendKeys(userEmailInput, userEmail);
        sendKeys(currentAddressInput, currentAddress);
        sendKeys(permanentAddressInput, permanentAddress);
        click(submitButton);
    }

    public String getOutputText() {
        return getText(output);
    }

    public void setElementsLocator() {
        // Use common method
    }

    public void setTextBox() {
        // Use common method
    }

    public void setFullName(String fullName) {
        sendKeys(userNameInput, fullName);
    }

    public void setEmail(String email) {
        sendKeys(userEmailInput, email);
    }

    public void setCurrentAddress(String address) {
        sendKeys(currentAddressInput, address);
    }

    public void setPermanentAddress(String address) {
        sendKeys(permanentAddressInput, address);
    }

    public void setSubmitButton() {
        click(submitButton);
    }

    public String getResultEmail() {
        // Use common method
        return getText(output);
    }

    public String getResultPermanentAddress() {
        // Use common method
        return getText(output);
    }

    public String getResultName() {
        // Use common method
        return getText(output);
    }

    public String getResultCurrentAddress() {
        // Use common method
        return getText(output);
    }
}
