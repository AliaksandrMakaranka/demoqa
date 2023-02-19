package pages.elements;

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
import pages.Helper;

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
  public void createStatusCode() {
    links.setHomeLocatorNewWindow();

    //TODO javascript:void(0)  make code status
  }

  @Test
  public void openNewWindowTest() throws IOException {
    links.setHomeLocatorNewWindow();
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
    System.out.println("After all");
  }
}