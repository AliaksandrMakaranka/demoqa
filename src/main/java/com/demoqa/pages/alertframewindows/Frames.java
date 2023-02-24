package com.demoqa.pages.alertframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {

  private final WebDriver driver;

  public Frames(WebDriver driver) {
    this.driver = driver;
  }

  //path to working directory
  private final By alertFrameWindows = By.xpath(
      "//div[@class=\"card-body\"] /h5[contains(text(), \"Alerts, Frame & Windows\")]");
    private final By frames = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Frames\")]");


  private final By sampleHeading = By.id("sampleHeading");

  //setters
  public void setAlertFrameWindows() {
    driver.findElement(alertFrameWindows).click();
  }

  public void setFrames() {
    driver.findElement(frames).click();
  }

  public void setSampleHeading() {
    driver.switchTo().frame(driver.findElement(sampleHeading));
  }

  public void setUpBeforeEach() {
    driver.get("https://demoqa.com");
    driver.manage().window().maximize();
    this.setAlertFrameWindows();
    this.setFrames();
  }
}
