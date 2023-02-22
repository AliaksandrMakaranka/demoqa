package com.demoqa.pages.elements;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import com.demoqa.pages.elements.User;
import com.demoqa.pages.elements.WebTables;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Random;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WebTablesTest {

  WebTables webTables;
  WebDriver driver;
  private static final String MAIN_PAGE = "https://demoqa.com/";//todo one constant for all methods

  @BeforeAll
  public static void setUpClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  void setUp() {
    driver = new ChromeDriver();
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
    webTables = new WebTables(driver);
    webTables.setElementsLocator();
    webTables.setWebTables();
  }

  @Test
//  @RepeatedTest(2)
  public void addNewUser() {
    var expectedUser = createFakeUser();
    var userMail = expectedUser.getEmail();
//TODO solve the problem of getting all rows when an email matches!!!

    assertDoesNotThrow(() -> addUser(expectedUser), "Input user was: " + expectedUser);


//    var actualUser = assertDoesNotThrow(() -> webTables.getUser(userMail),
//        "some error message");

//    webTables.setSearchBox(userMail);
    System.out.println("var expectedUser = createFakeUser();: \n" + expectedUser);
    System.out.println("var userMail = expectedUser.getEmail();: \n" + userMail);
    //todo wrong email from usermail and expected user
//    Assertions.assertThat(actualUser).isEqualTo(expectedUser.toString());

  }

  //check for equals not exist user next one


  @Test
  public void removeUserVegaFromTablesTest() {
    webTables.setSearchBox("Vega");
    webTables.setActionDelete();
  }

  private User createFakeUser() {
    Random rnd = new Random();
    Faker faker = new Faker();
    return new User(
        faker.name().firstName(),
        faker.name().lastName(),
        faker.internet().emailAddress(),
        rnd.nextInt(18, 66),
        rnd.nextInt(1000, 50001),
        faker.team().name()
    );
  }


  private void addUser(User user) {
    webTables.setAddNewRecordButton();
    webTables.setRegFirstName(user.getName());
    webTables.setRegLastName(user.getLastName());
    webTables.setRegUserEmail(user.getEmail());
    webTables.setRegAge("" + user.getAge());
    webTables.setRegSalary("" + user.getSalary());
    webTables.setRegDepartment(user.getDepartment());
    webTables.setRegSubmitButton();
  }

  @Test
  public void editUserAldenFromTablesTest() {
    webTables.setSearchBox("Alden");
    webTables.setActionEdit();
    webTables.setRegFirstName("new First Name");
    webTables.setRegLastName("new Last Name");
    webTables.setRegUserEmail("changeemail@test.net");
    webTables.setRegAge("88");
    webTables.setRegSalary("1");
    webTables.setRegDepartment("the Best of The Best");
    webTables.setRegSubmitButton();

    //emails always unique?
    webTables.setSearchBox("changeemail@test.net");
    String firstLine = webTables.getFirstLine();//search by unique email always returns the first row

  }


  @Test
  public void tryUseFakerAndReturnStringWithAllParamTest() {
    //todo finish method
    User fakeUser = createFakeUser();
    addUser(fakeUser);
    String user = webTables.getUser(fakeUser.email);
    var userMail =  fakeUser.getEmail();
    //FIXME email actual =! expected generate new email
    System.out.println(user);
    System.out.println(userMail);
  }
  @Test
  public void notFoundUserTest() {
    webTables.setSearchBox("wrong name");

    String notUser = webTables.getNoRowsFound();
    Assertions.assertThat(notUser).isNotEmpty().isNotNull().contains("No rows found");
  }

  @AfterEach
  void tearDown() {
    if (driver != null) {
//      driver.close();
//      driver.quit();
    }
  }
}