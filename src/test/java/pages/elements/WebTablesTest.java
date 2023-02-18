package pages.elements;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

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
    webTables = new WebTables(driver);
    webTables.setElementsLocator();
    webTables.setWebTables();
  }

  @Test
//  @RepeatedTest(2)
  public void addNewUser() {
    var expectedUser = createFakeUser();
    var userMail = expectedUser.getEmail();

    assertDoesNotThrow(() -> addUser(expectedUser), "Input user was: " + expectedUser);

    var actualUser = assertDoesNotThrow(() -> webTables.getUser(userMail),
        "some error message");
    Assertions.assertThat(actualUser).isEqualTo(expectedUser.toString());

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
      driver.close();
      driver.quit();
    }
  }
}