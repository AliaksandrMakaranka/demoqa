package com.demoqa.pages.alertframewindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModalDialogs extends BasePage {
    @FindBy(id = "showSmallModal")
    private WebElement showSmallModalButton;

    @FindBy(id = "showLargeModal")
    private WebElement showLargeModalButton;

    @FindBy(id = "closeSmallModal")
    private WebElement closeSmallModalButton;

    @FindBy(id = "closeLargeModal")
    private WebElement closeLargeModalButton;

    @FindBy(id = "example-modal-sizes-title-sm")
    private WebElement smallModalTitle;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement largeModalTitle;

    public ModalDialogs(WebDriver driver) {
        super(driver);
    }

    public void clickShowSmallModal() {
        click(showSmallModalButton);
    }

    public void clickShowLargeModal() {
        click(showLargeModalButton);
    }

    public void clickCloseSmallModal() {
        click(closeSmallModalButton);
    }

    public void clickCloseLargeModal() {
        click(closeLargeModalButton);
    }

    public String getSmallModalTitle() {
        return getText(smallModalTitle);
    }

    public String getLargeModalTitle() {
        return getText(largeModalTitle);
    }
}

