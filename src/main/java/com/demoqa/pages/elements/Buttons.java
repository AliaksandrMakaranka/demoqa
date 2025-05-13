package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buttons extends CommonActions {
    @FindBy(id = "doubleClickBtn")
    private WebElement doubleClickButton;

    @FindBy(id = "rightClickBtn")
    private WebElement rightClickButton;

    @FindBy(id = "clickMe")
    private WebElement clickMeButton;

    @FindBy(id = "doubleClickMessage")
    private WebElement doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    private WebElement rightClickMessage;

    @FindBy(id = "dynamicClickMessage")
    private WebElement dynamicClickMessage;

    public Buttons(WebDriver driver) {
        super(driver);
    }

    public void doubleClick() {
        click(doubleClickButton);
    }

    public void rightClick() {
        click(rightClickButton);
    }

    public void clickMe() {
        click(clickMeButton);
    }

    public String getDoubleClickMessage() {
        return getText(doubleClickMessage);
    }

    public String getRightClickMessage() {
        return getText(rightClickMessage);
    }

    public String getDynamicClickMessage() {
        return getText(dynamicClickMessage);
    }
}
