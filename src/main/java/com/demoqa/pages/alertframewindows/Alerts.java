package com.demoqa.pages.alertframewindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alerts extends BasePage {
    @FindBy(id = "alertButton")
    private WebElement alertButton;

    @FindBy(id = "timerAlertButton")
    private WebElement timerAlertButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "promtButton")
    private WebElement promptButton;

    @FindBy(id = "confirmResult")
    private WebElement confirmResult;

    @FindBy(id = "promptResult")
    private WebElement promptResult;

    public Alerts(WebDriver driver) {
        super(driver);
    }

    public void clickAlertButton() {
        click(alertButton);
    }

    public void clickTimerAlertButton() {
        click(timerAlertButton);
    }

    public void clickConfirmButton() {
        click(confirmButton);
    }

    public void clickPromptButton() {
        click(promptButton);
    }

    public String getConfirmResult() {
        return getText(confirmResult);
    }

    public String getPromptResult() {
        return getText(promptResult);
    }
}
