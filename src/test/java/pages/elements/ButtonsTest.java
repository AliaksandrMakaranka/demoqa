package pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ButtonsTest {

  private static final String MAIN_PAGE = "https://demoqa.com/";//todo one constant for all methods
  Buttons buttons;
  WebDriver driver;

  //todo before all and take out driver factory
  @BeforeAll
  public static void setUpClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    buttons = new Buttons(driver);
    driver.get(MAIN_PAGE);
    buttons.setElementsLocator();
    buttons.setButtons();
  }

  @Test
  public void doubleClickTest() {
    buttons.setDoubleClickMeButton();

    String expectedResult = "You have done a double click";
    Assertions.assertThat(buttons.getDoubleClickMeMessage()).isEqualTo(expectedResult);
  }

  @Test
  public void rightClickTest() {
    buttons.setRightClickMeButton();

    String expectedResult = "You have done a right click";
    Assertions.assertThat(buttons.getRightClickMeMessage()).isEqualTo(expectedResult);
  }

  @Test
  public void oneClickTest() {
    buttons.setClickMeButton();

    String expectedResult = "You have done a dynamic click";
    Assertions.assertThat(buttons.getClickMeMessage()).isEqualTo(expectedResult);
  }

  @AfterEach
  void tearDown() {
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }
}