package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Links extends CommonActions {
    @FindBy(id = "simpleLink")
    private WebElement simpleLink;

    @FindBy(id = "dynamicLink")
    private WebElement dynamicLink;

    @FindBy(id = "created")
    private WebElement createdLink;

    @FindBy(id = "no-content")
    private WebElement noContentLink;

    @FindBy(id = "moved")
    private WebElement movedLink;

    @FindBy(id = "bad-request")
    private WebElement badRequestLink;

    @FindBy(id = "unauthorized")
    private WebElement unauthorizedLink;

    @FindBy(id = "forbidden")
    private WebElement forbiddenLink;

    @FindBy(id = "invalid-url")
    private WebElement invalidUrlLink;

    @FindBy(id = "linkResponse")
    private WebElement linkResponse;

    @FindBy(id = "elementsLocator")
    private WebElement elementsLocator;

    @FindBy(id = "links")
    private WebElement links;

    public Links(WebDriver driver) {
        super(driver);
    }

    public void clickSimpleLink() {
        click(simpleLink);
    }

    public void clickDynamicLink() {
        click(dynamicLink);
    }

    public void clickCreatedLink() {
        click(createdLink);
    }

    public void clickNoContentLink() {
        click(noContentLink);
    }

    public void clickMovedLink() {
        click(movedLink);
    }

    public void clickBadRequestLink() {
        click(badRequestLink);
    }

    public void clickUnauthorizedLink() {
        click(unauthorizedLink);
    }

    public void clickForbiddenLink() {
        click(forbiddenLink);
    }

    public void clickInvalidUrlLink() {
        click(invalidUrlLink);
    }

    public String getLinkResponse() {
        return getText(linkResponse);
    }

    public void setElementsLocator() {
        click(elementsLocator);
    }

    public void setLinks() {
        click(links);
    }
}
