package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicProperties {

  private final WebDriver driver;

  public DynamicProperties(WebDriver driver) {
    this.driver = driver;
  }
  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");

  private final By dynamicProperties = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Upload and Download\")]");

  //setter
  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }

  public void setDynamicProperties() {
    driver.findElement(dynamicProperties).click();
  }


}
