package pages.elements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DriverFactory;

class WebTablesTest {
  WebTables webTables;
  @BeforeEach
  void setUp() {
    ChromeDriver driver = DriverFactory.create();
    webTables = new WebTables(driver);
    webTables.setElementsLocator();
    webTables.setWebTables();
  }

  @Test
  public void addNewUser() {
    webTables.setAddNewRecordButton();
    webTables.setRegFirstName("Tom");
    webTables.setRegLastName("Cat");
    webTables.setRegUserEmail("qwert@trewq.qwert");
    webTables.setRegAge("44");
    webTables.setRegSalary("1111");
    webTables.setRegDepartment("without");
    webTables.setRegSubmitButton();
  }



}