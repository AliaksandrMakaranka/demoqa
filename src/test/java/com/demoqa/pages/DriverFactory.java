package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

  private static final String MAIN_PAGE = "https://demoqa.com/";

  //TODO make for before each
  public static WebDriver create() {//fixme broken use other method
    WebDriver driver = new ChromeDriver();
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
    return driver;
  }

}
