package com.demoqa.pages.alertframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalDialogs {
  private final WebDriver driver;

  public ModalDialogs(WebDriver driver) {
    this.driver = driver;
  }

  private final By alertFrameWindows = By.xpath(
      "//div[@class=\"card-body\"] /h5[contains(text(), \"Alerts, Frame & Windows\")]");
  private final By modalDialogs = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Modal Dialogs\")]");

  private final By showSmallModal = By.id("showSmallModal");
  private final By showLargeModal = By.id("showLargeModal");

  //setters

  public void setAlertFrameWindows() {
    driver.findElement(alertFrameWindows).click();
  }

  public void setModalDialogs() {
    driver.findElement(modalDialogs).click();
  }

  public void setShowSmallModal() {
    driver.findElement(showSmallModal).click();
  }

  public void setShowLargeModal() {
    driver.findElement(showLargeModal).click();
  }

  public void setUpBeforeEach() {
    driver.get("https://demoqa.com");
    driver.manage().window().maximize();
    this.setAlertFrameWindows();
    this.setModalDialogs();
  }
}

