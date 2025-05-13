package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicProperties extends CommonActions {
    @FindBy(id = "enableAfter")
    private WebElement enableAfterButton;

    @FindBy(id = "colorChange")
    private WebElement colorChangeButton;

    @FindBy(id = "visibleAfter")
    private WebElement visibleAfterButton;

    public DynamicProperties(WebDriver driver) {
        super(driver);
    }

    public boolean isButtonEnabled() {
        return enableAfterButton.isEnabled();
    }

    public String getButtonColor() {
        return colorChangeButton.getCssValue("color");
    }

    public boolean isButtonVisible() {
        return visibleAfterButton.isDisplayed();
    }
}
