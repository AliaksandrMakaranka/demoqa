package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
//dateAndTimePickerInput
  //setters
  public void setWidgets() {
    driver.findElement(widgets).click();
  }

  public void setDatePicker() {
    driver.findElement(datePicker).click();

  }

  public void setSelectDate(String s) {
    driver.findElement(selectDate).click();

    Actions actions = new Actions(driver);

    actions.keyDown(Keys.CONTROL)
        .sendKeys(Keys.chord("A"))
        .keyUp(Keys.CONTROL)
        .sendKeys(Keys.BACK_SPACE)
        .release().build().perform();

    driver.findElement(selectDate).sendKeys(s);

    actions.sendKeys(Keys.ENTER)
        .release().build().perform();
  }


  public void setDateAndTime(String s) throws InterruptedException {
    driver.findElement(dateAndTime).click();
    Actions actions = new Actions(driver);

    actions.keyDown(Keys.CONTROL)
        .sendKeys(Keys.chord("A"))
        .keyUp(Keys.CONTROL)
        .sendKeys(Keys.BACK_SPACE)
        .release().build().perform();
    Thread.sleep(500);
    driver.findElement(selectDate).sendKeys(s);
    Thread.sleep(500);

    actions.sendKeys(Keys.ENTER)
        .release().build().perform();

  }


  public void setUpBeforeEach() {
    driver.get("https://demoqa.com");
    driver.manage().window().maximize();
    this.setWidgets();
    this.setDatePicker();
  }

}
