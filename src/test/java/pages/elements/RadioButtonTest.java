package pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class RadioButtonTest {
  private static final String MAIN_PAGE = "https://demoqa.com/";
  WebDriver driver;
  RadioButton radioButton;
  @BeforeEach
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
    radioButton = new RadioButton(driver);
    radioButton.setElementsLocator();
    radioButton.setRadioButton();
    //duplicate code
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
    if(driver != null) {
      driver.close();
      driver.quit();
    }
  }
}