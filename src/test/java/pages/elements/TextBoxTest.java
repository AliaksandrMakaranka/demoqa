package pages.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTest {

  private static final String MAIN_PAGE = "https://demoqa.com/";
  WebDriver driver;
  TextBox textBox;

  @BeforeEach
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
    textBox = new TextBox(driver);
  }

  @Test
  public void fillAllFieldsWithCorrectEmailTest() {
    textBox.setElementsLocator();
    textBox.setTextBox();
    textBox.setFullName("Mike Tyson");
    textBox.setEmail("support@reddit.com");
    textBox.setCurrentAddress("Madison Square Garden");
    textBox.setPermanentAddress("Gym");
    textBox.setSubmitButton();

    String newResultEmail = textBox.getResultEmail();
    Assertions.assertThat(newResultEmail).isNotNull().isNotEmpty().containsAnyOf("@", ".");
  }

}