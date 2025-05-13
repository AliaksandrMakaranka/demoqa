package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButton extends CommonActions {
    @FindBy(id = "yesRadio")
    private WebElement yesRadio;

    @FindBy(id = "impressiveRadio")
    private WebElement impressiveRadio;

    @FindBy(id = "noRadio")
    private WebElement noRadio;

    @FindBy(id = "result")
    private WebElement result;

    public RadioButton(WebDriver driver) {
        super(driver);
    }

    public void clickYesRadio() {
        click(yesRadio);
    }

    public void clickImpressiveRadio() {
        click(impressiveRadio);
    }

    public void clickNoRadio() {
        click(noRadio);
    }

    public String getResultText() {
        return getText(result);
    }
}
