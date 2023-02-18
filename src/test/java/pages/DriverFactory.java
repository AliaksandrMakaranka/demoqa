package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

  private static final String MAIN_PAGE = "https://demoqa.com/";

  //TODO make for before each
  public static void  create() {
    WebDriver driver = new ChromeDriver();
    driver.get(MAIN_PAGE);
    driver.manage().window().maximize();
  }

}
