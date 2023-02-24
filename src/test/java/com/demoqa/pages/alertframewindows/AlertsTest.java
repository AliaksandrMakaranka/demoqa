package com.demoqa.pages.alertframewindows;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class AlertsTest {

  WebDriver driver;
  Alerts al;

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    al = new Alerts(driver);
    al.setUpBeforeEach();
    //todo asserts
  }


  @Test
  void alertButtonTest() {
    al.setAlertButton();

    Alert alert = driver.switchTo().alert();
    String actualResult = alert.getText();
    String expectedResult = "You clicked a button";

//    alert.accept(); //alert working both accept or dismiss
    alert.dismiss();
    Assertions.assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  void timerAlertButtonTest() {
    al.setTimerAlertButton();


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.alertIsPresent());

    Alert alert = driver.switchTo().alert();
    String text = alert.getText();
    System.out.println(text);
    alert.accept();

  }

  @Test
  void confirmButtonOkTest() {
    al.setConfirmButton();

    Alert alert = driver.switchTo().alert();
//    alert.dismiss();
    alert.accept();
    al.setConfirmResult();
  }

  @Test
  void promtButtonTest() {
    al.setPromtButton();

    Alert alert = driver.switchTo().alert();
    alert.sendKeys("selenium");
    alert.accept();

    al.setPromptResult();
  }


}