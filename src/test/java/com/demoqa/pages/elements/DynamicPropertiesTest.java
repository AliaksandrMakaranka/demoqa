package com.demoqa.pages.elements;

import static org.junit.jupiter.api.Assertions.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DynamicPropertiesTest {

  DynamicProperties dynamicProperties;
  WebDriver driver;

  private static final String MAIN_PAGE = "https://demoqa.com/";//todo one constant for all methods
  @BeforeAll
  public static void setUpClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    dynamicProperties = new DynamicProperties(driver);
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
    dynamicProperties.setElementsLocator();
    dynamicProperties.setDynamicProperties();
  }

  @Test
  void setElementsLocator() {

  }

  @Test
  void setDynamicProperties() {
  }

  @AfterEach
  void tearDown() {
  }
}