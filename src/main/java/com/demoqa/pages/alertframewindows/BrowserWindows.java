package com.demoqa.pages.alertframewindows;

import java.util.ArrayList;
import java.util.List;
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
  private final By newTabButton = By.id("tabButton");
  private final By newWindowButton = By.id("windowButton");
  private final By newMsgWindowButton = By.id("messageWindowButton");

  //setters
  public void setAlertFrameWindows() {
    driver.findElement(alertFrameWindows).click();
  }

  public void setBrowserWindows() {
    driver.findElement(browserWindows).click();
  }

  public void setNewTabButton() {
    driver.findElement(newTabButton).click();
  }

  public void setNewWindowButton() {
    driver.findElement(newWindowButton).click();
  }

  public void setNewMsgWindowButton() {
    driver.findElement(newMsgWindowButton).click();
  }

  public void setBrowserTabs() {
    List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(browserTabs.get(1));
  }

  public void setNewWindows() {
    for (String winHandle : driver.getWindowHandles()) {
      driver.switchTo().window(winHandle);
    }
  }

  public void setUpBeforeEach() {
    driver.get("https://demoqa.com");
    driver.manage().window().maximize();
    this.setAlertFrameWindows();
    this.setBrowserWindows();
  }
}
