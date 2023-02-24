package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicProperties {

  private final WebDriver driver;

  public DynamicProperties(WebDriver driver) {
    this.driver = driver;
  }

  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");

  private final By dynamicProperties = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Dynamic Properties\")]");

  private final By willEnableFiveSeconds = By.id("enableAfter");
  //todo make test cases for method
  private final By colorChangeAfterFiveSeconds = By.id("colorChange");
  private final By visibleAfterFiveSeconds = By.id("visibleAfter");


  //setter
  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }

  public void setDynamicProperties() {
    WebElement element = driver.findElement(dynamicProperties);
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
  }

  public void setWillEnableFiveSeconds() {
    WebElement element = driver.findElement(willEnableFiveSeconds);
    element.isSelected();
    element.click();
  }


}
