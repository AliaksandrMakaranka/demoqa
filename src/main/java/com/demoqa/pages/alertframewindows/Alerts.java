package com.demoqa.pages.alertframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts {

  private final WebDriver driver;

  public Alerts(WebDriver driver) {
    this.driver = driver;
  }

  //path to working directory
  private final By alertFrameWindows = By.xpath(
      "//div[@class=\"card-body\"] /h5[contains(text(), \"Alerts, Frame & Windows\")]");
  private final By browserWindows = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Alerts\")]");

  //buttons
  private final By alertButton = By.id("alertButton");
  private final By timerAlertButton = By.id("timerAlertButton");
  private final By confirmButton = By.id("confirmButton");
  private final By promtButton = By.id("promtButton");

  private final By confirmResult = By.id("confirmResult");
  private final By promptResult = By.id("promptResult");

  //setters

  public void setAlertFrameWindows() {
    driver.findElement(alertFrameWindows).click();
  }

  public void setBrowserWindows() {
    driver.findElement(browserWindows).click();
  }

  public void setAlertButton() {
    driver.findElement(alertButton).click();
  }

  public void setTimerAlertButton() {
    driver.findElement(timerAlertButton).click();
  }

  public void setConfirmButton() {
    driver.findElement(confirmButton).click();
  }

  public void setPromtButton() {
    driver.findElement(promtButton).click();
  }

  public void setPromptResult() {
    String text = driver.findElement(promptResult).getText();
    System.out.println(text);
  }

  public void setConfirmResult() {
    WebElement element = driver.findElement(confirmResult);
    if (element.getText().contains("Ok")) {
      System.out.println("You selected Ok");
    } else {
      System.err.print("Cancel");
    }
  }

  public void setUpBeforeEach() {
    driver.get("https://demoqa.com");
    driver.manage().window().maximize();
    this.setAlertFrameWindows();
    this.setBrowserWindows();
  }
}
