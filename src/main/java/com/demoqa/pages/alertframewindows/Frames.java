package com.demoqa.pages.alertframewindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Frames extends BasePage {
    @FindBy(id = "frame1")
    private WebElement frame1;

    @FindBy(id = "frame2")
    private WebElement frame2;

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeading;

    public Frames(WebDriver driver) {
        super(driver);
    }

    public void switchToFrame1() {
        driver.switchTo().frame(frame1);
    }

    public void switchToFrame2() {
        driver.switchTo().frame(frame2);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public String getSampleHeading() {
        return getText(sampleHeading);
    }
}
