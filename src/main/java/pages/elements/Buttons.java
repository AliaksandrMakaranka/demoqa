package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
  private final WebDriver driver;


  public Buttons(WebDriver driver) {
    this.driver = driver;
  }
  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");
  private final By buttons = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Buttons\")]");

  //buttons
  private final By doubleClickMeButton = By.id("doubleClickBtn");
  private final By rightClickMeButton = By.id("rightClickBtn");
  private final By clickMeButton = By.id("e0B2R");

  //setter
  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }

  public void setButtons() {
    driver.findElement(buttons).click();
  }
  public void setDoubleClickMeButton() {

    driver.findElement(buttons).click();
  }
  public void setRightClickMeButton() {
    driver.findElement(buttons).click();
  }
  public void setClickMeButton() {
    driver.findElement(buttons).click();
  }

//getter
  public String getDoubleClickMeMessage() {
    return driver.findElement(By.id("doubleClickMessage")).getText();
  }
  public String getRightClickMeMessage() {
    return driver.findElement(By.id("rightClickMessage")).getText();
  }
  public String getClickMeMessage() {
    return driver.findElement(By.id("dynamicClickMessage")).getText();
  }


}
