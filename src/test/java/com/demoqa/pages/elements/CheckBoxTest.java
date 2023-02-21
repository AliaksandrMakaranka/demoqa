package com.demoqa.pages.elements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CheckBoxTest {

  //  WebDriver driver;
  WebDriver driver;
  CheckBox checkBox;

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    checkBox = new CheckBox(driver);
    checkBox.setUpBeforeEach();
  }

  @Test
  void setCheckBoxElements() {
    checkBox.setExpandAll();
  }
}