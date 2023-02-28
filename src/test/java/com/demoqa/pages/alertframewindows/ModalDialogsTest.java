package com.demoqa.pages.alertframewindows;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class ModalDialogsTest {
  WebDriver driver;
  ModalDialogs md;

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    md = new ModalDialogs(driver);
    md.setUpBeforeEach();
  }

  @Test
  void showSmallModalTest() {
    md.setShowSmallModal();
    String text = driver.switchTo().activeElement().getText();
    System.out.println(text);

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    List<WebElement> elements = wait.until(ExpectedConditions
        .presenceOfAllElementsLocatedBy(By.cssSelector(".close")));

    for (WebElement element : elements) {
      if (element.isDisplayed()) {
        element.click();
      }
    }
  }

  @Test
  void showLargeModalTest() {
    md.setShowLargeModal();
  }

  @AfterEach
  void tearDown() {
  }
}