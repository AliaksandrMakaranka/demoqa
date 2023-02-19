package com.demoqa.pages.elements;

import com.demoqa.pages.elements.TextBox;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTest {

  private static final String MAIN_PAGE = "https://demoqa.com/";//todo one constant for all methods
  WebDriver driver;
  TextBox textBox;

  @BeforeAll
  public static void setUpClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    driver.get(MAIN_PAGE);
    textBox = new TextBox(driver);
    textBox.setElementsLocator();
    textBox.setTextBox();
  }

  @Test
  public void fillAllFieldsWithCorrectEmailTest() {
    textBox.setFullName("Mike Tyson");
    textBox.setEmail("support@reddit.com");
    textBox.setCurrentAddress("Madison Square Garden");
    textBox.setPermanentAddress("Gym");
    textBox.setSubmitButton();

    String newResultEmail = textBox.getResultEmail();
    Assertions.assertThat(newResultEmail).isNotNull().isNotEmpty().containsAnyOf("@", ".");
    //todo
    //add min max length for email
  }

  @Test
  public void fillAllFieldsWithoutEmailTest() {
    textBox.setFullName("no name");
    textBox.setCurrentAddress("just street");
    textBox.setPermanentAddress("earth");
    textBox.setSubmitButton();

    //if element no such element exception we fill form but
  }

  @Test
  public void fillOnlyPerAddressTest() {
    textBox.setPermanentAddress("USA");
    textBox.setSubmitButton();

    String newResultPermanentAddress = textBox.getResultPermanentAddress();
    Assertions.assertThat(newResultPermanentAddress).isNotEmpty().isNotNull();
  }

  @Test
  public void fillOnlyFullNameTest() {
    textBox.setFullName("admin' or '1'='1';#");
    textBox.setSubmitButton();

    String newResultFullName = textBox.getResultName();
    Assertions.assertThat(newResultFullName).isNotNull().isNotEmpty();
  }

  @Test
  public void fillCurrentAddressTest() {
    textBox.setCurrentAddress("`'False | or And /****/ \'\''\tab");
    textBox.setSubmitButton();

    String newResultCurrentAddress = textBox.getResultCurrentAddress();
    Assertions.assertThat(newResultCurrentAddress).isNotEmpty().isNotNull();
  }

  @Test
  public void fillAllFieldWithMail() {
    textBox.setFullName("qw@wq.wq\tqw@wq.wq");
    textBox.setSubmitButton();

    String newResultName = textBox.getResultName();
    String newResultMail = textBox.getResultEmail();

    Assertions.assertThat(newResultName).containsAnyOf(".wq");
    Assertions.assertThat(newResultMail).containsAnyOf(".wq");
  }

  @AfterEach
  public void teardown() {
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }

}