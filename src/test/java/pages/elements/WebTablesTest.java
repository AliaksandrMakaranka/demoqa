package pages.elements;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DriverFactory;

class WebTablesTest {
  @BeforeEach
  void setUp() {
    ChromeDriver driver = DriverFactory.create();
    WebTables webTables = new WebTables(driver);
    webTables.setElementsLocator();
    webTables.setWebTables();
  }
}