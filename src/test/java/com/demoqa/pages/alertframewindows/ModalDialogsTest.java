package com.demoqa.pages.alertframewindows;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
  void setShowSmallModal() {

  }

  @Test
  void setShowLargeModal() {
  }

  @AfterEach
  void tearDown() {
  }
}