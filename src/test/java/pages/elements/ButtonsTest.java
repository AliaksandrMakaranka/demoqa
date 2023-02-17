package pages.elements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DriverFactory;

class ButtonsTest {
  Buttons buttons;
  WebDriver driver;

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
  }

  @AfterEach
  void tearDown() {
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }
}