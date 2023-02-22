package com.demoqa.pages.alertframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserWindows {

  private final WebDriver driver;

  public BrowserWindows(WebDriver driver) {
    this.driver = driver;
  }


  //path to working directory
  private final By alertFrameWindows = By.xpath(
      "//div[@class=\"card-body\"] /h5[contains(text(), \"Alerts, Frame & Windows\")]");
  private final By browserWindows = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Browser Windows\")]");

  //buttons
  private final By tabButton = By.id("tabButton");
  private final By windowButtonWrapper = By.id("windowButtonWrapper");
  private final By msgWindowButtonWrapper = By.id("msgWindowButtonWrapper");

  //setters


}
