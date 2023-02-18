package pages.elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DriverFactory;

class ButtonsTest {
  Buttons buttons;
  WebDriver driver;
//todo before all and take out driver factory
  @BeforeEach
  void setUp() {
    ChromeDriver driver = DriverFactory.create();
    buttons = new Buttons(driver);
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
//      driver.close();
      driver.quit();
    }
  }
}