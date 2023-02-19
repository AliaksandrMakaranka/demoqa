package com.demoqa.pages.elements;

import com.demoqa.pages.Helper;
import com.demoqa.pages.elements.Links;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LinksTest {

  Links links;
  WebDriver driver;
  private static final String MAIN_PAGE = "https://demoqa.com/";//todo one constant for all methods


  @BeforeAll
  public static void setUpClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
    links = new Links(driver);
    links.setElementsLocator();
    links.setLinks();
  }

  @Test
  public void createStatusCode() throws IOException {
    List<WebElement> list = driver.findElements(By.tagName("a"));
    for (WebElement element : list) {
      System.out.println(element);
      String url = element.getAttribute("href");
      Helper helper = new Helper();
      helper.statusCode(url);//fixme
    }
  }

  @Test
  public void openNewWindowTest() {
    String newWindowURL = driver.findElement(By.linkText("Home")).getAttribute("href");
    //todo
    driver.navigate().to(newWindowURL);

  }

  @AfterEach
  void tearDown() {
    if (driver != null) {
//      driver.close();
//      driver.quit();
      System.out.println("@AfterEach disabled");
    }
  }

  @AfterAll
  public static void tearDownClass() {
    System.out.println("After all disabled");
  }
}