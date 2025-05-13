package com.demoqa.pages.alertframewindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindows extends BasePage {
    @FindBy(id = "tabButton")
    private WebElement tabButton;

    @FindBy(id = "windowButton")
    private WebElement windowButton;

    @FindBy(id = "messageWindowButton")
    private WebElement messageWindowButton;

    public BrowserWindows(WebDriver driver) {
        super(driver);
    }

    public void clickTabButton() {
        click(tabButton);
    }

    public void clickWindowButton() {
        click(windowButton);
    }

    public void clickMessageWindowButton() {
        click(messageWindowButton);
    }
}
