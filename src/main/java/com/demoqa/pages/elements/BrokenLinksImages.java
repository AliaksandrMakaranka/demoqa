package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenLinksImages extends CommonActions {
    @FindBy(id = "valid-image")
    private WebElement validImage;

    @FindBy(id = "broken-image")
    private WebElement brokenImage;

    @FindBy(id = "valid-link")
    private WebElement validLink;

    @FindBy(id = "broken-link")
    private WebElement brokenLink;

    public BrokenLinksImages(WebDriver driver) {
        super(driver);
    }

    public void clickValidLink() {
        click(validLink);
    }

    public void clickBrokenLink() {
        click(brokenLink);
    }

    public boolean isImageDisplayed(WebElement image) {
        return image.isDisplayed();
    }
}
