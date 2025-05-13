package com.demoqa.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger.info("Initialized page: " + this.getClass().getSimpleName());
    }

    protected void click(WebElement element) {
        logger.info("Clicking on element: " + element);
        element.click();
    }

    protected void sendKeys(WebElement element, String text) {
        logger.info("Sending keys to element: " + element + " with text: " + text);
        element.sendKeys(text);
    }

    protected String getText(WebElement element) {
        logger.info("Getting text from element: " + element);
        return element.getText();
    }
} 