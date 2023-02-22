package com.demoqa.pages.elements;

import com.demoqa.pages.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
  @Disabled
  public void createStatusCode() throws IOException {
    List<WebElement> list = driver.findElements(By.tagName("a"));
    for (WebElement element : list) {
      System.out.println(element);
      String url = element.getAttribute("href");
      Helper helper = new Helper();
      helper.statusCode(url);//fixme mayby wrong import check it
    }
  }

  @Test
  public void openNewWindowTest() {//status code
    links.setHomeLocatorNewWindow();
    //todo make assert
    String originalWindow = driver.getWindowHandle();
    for (String windowHandle : driver.getWindowHandles()) {
      if (!originalWindow.contentEquals(windowHandle)) {
        driver.switchTo().window(windowHandle);
        System.out.println(windowHandle);
        break;
      }
    }
    String expectedResult = "DEMOQA";
    String actualResult = driver.getTitle();

    Assertions.assertThat(expectedResult).isEqualTo(actualResult);
  }

  @Test
  public void responseNoContentCodeTest() {

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
    System.out.println("After all disabled");//fixme delete ALL methods
  }
}