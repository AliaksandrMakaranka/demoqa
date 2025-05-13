package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {
    protected WebDriver driver;

    public CommonActions(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        element.click();
    }

    public String getText(WebElement element) {
        return element.getText();
    }
} 