package com.demoqa.pages.elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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
  void setCheckBoxElementsExpandsAllTest() {
    checkBox.setExpandAll();
  }

  @Test
  public void checkAllElementsTest() {
    checkBox.setCheckBoxElements();

    String expectedResult = checkBox.getSelectedResult();
    String actualResult = checkBox.getActualResultAllCheckbox();

    Assertions.assertThat(expectedResult).isEqualTo(actualResult);
  }


}