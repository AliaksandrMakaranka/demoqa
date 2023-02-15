package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
  private final WebDriver driver;
  public RadioButton(WebDriver driver) {
    this.driver = driver;
  }

  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");
  private final By radioButton = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Radio Button\")]");

  //radio button
  private final By yesRadioButton = By.xpath("//label[@for=\"yesRadio\"]");
  private final By impressiveRadioButton = By.xpath("//label[@for=\"impressiveRadio\"]");

  //text
  private final By resultButton = By.xpath("//span[@class=\"text-success\"]");

  //setters
  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }
  public void setRadioButton() {
    driver.findElement(radioButton).click();
  }
  public void setYesRadioButton() {
    driver.findElement(yesRadioButton).click();
  }
  public void setImpressiveRadioButton() {
    driver.findElement(impressiveRadioButton).click();
  }
  public String getResultButton() {
    return driver.findElement(resultButton).getText();
  }


}
