package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownload {

  private final WebDriver driver;

  public UploadAndDownload(WebDriver driver) {
    this.driver = driver;
  }


  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");
  private final By upDownLocator = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Upload and Download\")]");// FIXME: 19.02.2023 cant see xpath

  private final By downloadButton = By.id("downloadButton");
  private final By uploadFile = By.xpath("//input[@id=\"uploadFile\"]");
  private final By resultOfUpload = By.xpath("//p[@id=\"uploadedFilePath\"]");

  //setters
  public String getResultOfUpload() {
    return driver.findElement(resultOfUpload).getText();
  }
  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }

  public void setDownloadButton() {
    driver.findElement(downloadButton).click();
  }


  //getters
  public WebElement setUploadFile() {
    return driver.findElement(uploadFile);
  }

  public WebElement getUpAndDownLoadLocator() {
    return driver.findElement(upDownLocator);
  }

  public String getFileName() {
    return "demo.zip";
  }

  public String getFilePath() {
    return "/home/zac/Downloads/";
  }
}
