package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksChromeDriver {
  private final ChromeDriver chromeDriver;
  public LinksChromeDriver(ChromeDriver chromeDriver) {
    this.chromeDriver = chromeDriver;
  }

  private final String workingPage = "https://demoqa.com/links";
  private final By createdCode201 = By.id("created");

  public void setWorkingPage() {
    chromeDriver.get(workingPage);
  }

  public void setCreatedCode201() {
    chromeDriver.findElement(createdCode201).click();
  }
}
