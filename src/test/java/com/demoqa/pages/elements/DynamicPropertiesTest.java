package com.demoqa.pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DynamicPropertiesTest {

  DynamicProperties dynProp;
  WebDriver driver;

  private static final String MAIN_PAGE = "https://demoqa.com/";//todo one constant for all methods
  @BeforeAll
  public static void setUpClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    dynProp = new DynamicProperties(driver);
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
    dynProp.setElementsLocator();
    dynProp.setDynamicProperties();
  }

  @Test
  void setElementsLocator() {
    dynProp.setWillEnableFiveSeconds();
  }

  @Test
  void setDynamicProperties() {
  }

  @AfterEach
  void tearDown() {
  }
}