package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {

  private static WebDriver driver;


  public TextBox(WebDriver driver) {
    this.driver = driver;
  }

  //locators for entry menu elements
  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");
  private final By textBox = By.xpath("//span[@class=\"text\" and contains(text(), \"Text Box\")]");

  //locators for fill text form
  private final By fullName = By.xpath("//input[@placeholder=\"Full Name\"]");
  private final By email = By.xpath("//input[@placeholder=\"name@example.com\"]");
  private final By currentAddress = By.xpath("//textarea[@placeholder=\"Current Address\"]");
  private final By permanentAddress = By.xpath("//textarea[@id=\"permanentAddress\"]");
  private final By submitButton = By.xpath("//button[@class=\"btn btn-primary\"]");

  //locator for control enter
  private final By resultName = By.xpath("//p[@id=\"name\"]");
  private final By resultEmail = By.xpath("//p[@id=\"email\"]");
  private final By resultCurrentAddress = By.xpath("//p[@id=\"currentAddress\"]");
  private final By resultPermanentAddress = By.xpath("//p[@id=\"permanentAddress\"]");

  //setters
  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }

  public void setTextBox() {
    driver.findElement(textBox).click();
  }

  public void setFullName(String username) {
    driver.findElement(fullName).sendKeys(username);
  }

  public void setEmail(String mail) {
    driver.findElement(email).sendKeys(mail);
  }

  public void setCurrentAddress(String address) {
    driver.findElement(currentAddress).sendKeys(address);
  }

  public void setPermanentAddress(String address) {
    driver.findElement(permanentAddress).sendKeys(address);
  }

  public void setSubmitButton() {
    driver.findElement(submitButton).click();
  }

  //getters
  public String getResultName() {
    return driver.findElement(resultName).getText();
  }

  public String getResultEmail() {
    return driver.findElement(resultEmail).getText();
  }

  public String getResultCurrentAddress() {
    return driver.findElement(resultCurrentAddress).getText();
  }

  public String getResultPermanentAddress() {
    return driver.findElement(resultPermanentAddress).getText();
  }

}
