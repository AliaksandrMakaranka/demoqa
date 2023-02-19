package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Links {

  private final WebDriver driver;

  public Links(WebDriver driver) {
    this.driver = driver;
  }

  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");
  private final By links = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Links\")]");

  //Following links will open new tab
  private final By homeLocatorNewWindow = By.id("simpleLink");

  //Following links will send an api call
  private final By createdCode201 = By.id("created");
  private final By noContentCode204 = By.id("no-content");
  private final By moveCode301 = By.id("moved");
  private final By badRequestCode400 = By.id("bad-request");
  private final By unauthorizedCode401 = By.id("unauthorized");
  private final By forbiddenCode403 = By.id("forbidden");
  private final By invalidUrlCode404 = By.id("invalid-url");

  //setter
  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }
  public void setLinks() {
    driver.findElement(links).click();
  }

  public void setCreatedCode201() {
    //void or WebElement
    //todo make proble with javascript:void(0) and find solution
    driver.findElement(createdCode201).click();
  }

  public void setHomeLocatorNewWindow() {
    driver.findElement(homeLocatorNewWindow).click();
  }

  public WebElement getHomeLocatorNewWindow() {
    return driver.findElement(homeLocatorNewWindow);
  }
}
