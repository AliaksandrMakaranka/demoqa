package pages.elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DriverFactory;

class RadioButtonTest {

  WebDriver driver;
  RadioButton radioButton;


  @BeforeEach
  public void setUp() {
    ChromeDriver driver = DriverFactory.create();
    radioButton = new RadioButton(driver);
    radioButton.setElementsLocator();//TODO duplicate line
    radioButton.setRadioButton();
  }

  @Test
  public void pushYesRadioButtonTest() {
    radioButton.setYesRadioButton();

    String newResultButton = radioButton.getResultButton();
    Assertions.assertThat(newResultButton).isNotNull().isNotEmpty();
    //wanna refactor
  }

  @Test
  public void pushImpressiveButtonTest() {
    radioButton.setImpressiveRadioButton();

    String newResultButton = radioButton.getResultButton();
    Assertions.assertThat(newResultButton).isNotNull().isNotEmpty();
    //duplicate code
  }

  @AfterEach
  public void teardown() {
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }
}