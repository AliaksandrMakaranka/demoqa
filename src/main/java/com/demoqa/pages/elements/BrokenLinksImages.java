package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrokenLinksImages {
  private final WebDriver driver;

  public BrokenLinksImages(WebDriver driver) {
    this.driver = driver;
  }


  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");

  private final By brokenLinksImages = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Broken Links - Images\")]");


  //setter
  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }

  public void setBrokenLinksImages() {
    driver.findElement(brokenLinksImages).click();
  }

}
