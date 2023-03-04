package com.demoqa.pages.widgets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
  void setSelectDate() {
    String date = "06/05/2025";
    dp.setSelectDate(date);

    //todo asserts

  }

  @Test
  void setDateAndTime() throws InterruptedException {
    String date = "March 12, 2023 05:32 PM";
    dp.setDateAndTime(date);//fixme
  }
}