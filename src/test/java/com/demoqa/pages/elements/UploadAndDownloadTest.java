package com.demoqa.pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class UploadAndDownloadTest {

  UploadAndDownload upD;
  WebDriver driver;
  private static final String MAIN_PAGE = "https://demoqa.com/";//todo one constant for all methods

  @BeforeAll
  public static void setUpClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    upD = new UploadAndDownload(driver);
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
    upD.setElementsLocator();
    //we use JE but simple method can't see line on the web
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
        upD.getUpAndDownLoadLocator());
  }

  @Test
  public void upLoadTest() {
    upD.setUploadFile().sendKeys(upD.getFilePath(), upD.getFileName());//fixme rename all sets

    String actualResult = upD.getResultOfUpload();
    String expectedResult = "C:\\fakepath\\" + upD.getFileName();
    Assertions.assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void fileDownloadTest() {
    upD.setDownloadButton();
    //todo assert for download files
  }

  @AfterEach
  void tearDown() {
    System.out.println("after each temporary off");
  }
}