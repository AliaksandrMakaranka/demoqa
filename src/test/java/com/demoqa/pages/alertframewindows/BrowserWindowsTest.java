package com.demoqa.pages.alertframewindows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BrowserWindowsTest {

  WebDriver driver;
  BrowserWindows bw;

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    bw = new BrowserWindows(driver);
    bw.setUpBeforeEach();
  }

  @Test
  void tabButtonTest() {
    bw.setNewTabButton();
    bw.setBrowserTabs();

    String actualResult = driver.getCurrentUrl();
    String expectedResult = "https://demoqa.com/sample";
    Assertions.assertThat(expectedResult).isEqualTo(actualResult);

    driver.close();
  }

  @Test
  void windowButtonTest() {
    assert driver.getWindowHandles().size() == 1;
    bw.setNewWindowButton();
    assert driver.getWindowHandles().size() == 2;

    String winHandleBefore = driver.getWindowHandle();

    bw.setNewWindows();

    String actualResult = driver.getCurrentUrl();
    String expectedResult = "https://demoqa.com/sample";

    driver.close();
    driver.switchTo().window(winHandleBefore);

    Assertions.assertThat(expectedResult).isEqualTo(actualResult);
  }

  @Test
  void msgWindowButtonTest() {
    bw.setNewMsgWindowButton();
    //todo with popup msg about:blank
  }

  @AfterEach
  void tearDown() {
  }
}