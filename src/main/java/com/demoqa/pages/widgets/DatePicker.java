package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {
  private final WebDriver driver;
  public DatePicker(WebDriver driver) {
    this.driver = driver;
  }

  private final By widgets = By.xpath(
      "//div[@class=\"card-body\"] /h5[contains(text(), \"Widgets\")]");

  private final By datePicker = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Date Picker\")]");
  private final By selectDate = By.id("datePickerMonthYearInput");

  private final By dateAndTime = By.id("dateAndTimePickerInput");

  //setters
  public void setWidgets() {
    driver.findElement(widgets).click();
  }

  public void setDatePicker() {
    driver.findElement(datePicker).click();
  }

  public void setSelectDate(String s) throws InterruptedException {
    driver.findElement(selectDate).click();

    driver.findElement(selectDate).clear();
    Thread.sleep(1000);
    driver.findElement(selectDate).sendKeys(s);
  }

  public void setDateAndTime() {
    driver.findElement(dateAndTime).sendKeys();
  }




  public void setUpBeforeEach() {
    driver.get("https://demoqa.com");
    driver.manage().window().maximize();
    this.setWidgets();
    this.setDatePicker();
  }

}
