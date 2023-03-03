package com.demoqa.pages.widgets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DatePickerTest {
  WebDriver driver;
  DatePicker dp;

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    dp = new DatePicker(driver);
    dp.setUpBeforeEach();

  }

  @Test
  void setSelectDate() throws InterruptedException {
    dp.setSelectDate("08232017");
  }

  @Test
  void setDateAndTime() {
  }
}