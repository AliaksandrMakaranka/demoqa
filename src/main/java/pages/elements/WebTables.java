package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTables {
  private final WebDriver driver;
  public WebTables(WebDriver driver) {
    this.driver = driver;
  }
  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");
  private final By webTables = By.xpath(
        "//span[@class=\"text\" and contains(text(), \"Web Tables\")]");

  //sort fields
  private final By sortFirstName = By.xpath("//div[contains(text(), \"First Name\")]");
  private final By sortLastName = By.xpath("//div[contains(text(), \"Last Name\")]");
  private final By sortAge = By.xpath("//div[contains(text(), \"Age\")]");
  private final By sortEmail = By.xpath("//div[contains(text(), \"Email\")]");
  private final By sortSalary = By.xpath("//div[contains(text(), \"Salary\")]");
  private final By sortDepartment = By.xpath("//div[contains(text(), \"Department\")]");
  private final By sortAction = By.xpath("//div[contains(text(), \"Action\")]");

  //edit and delete button (first in line)
  private final By actionEdit = By.xpath("//span[@title=\"Edit\"]");
  private final By actionDelete = By.xpath("//span[@title=\"Delete\"]");

  //search line
  private final By searchBox = By.xpath("//input[@placeholder=\"Type to search\"]");

  //no rows found
  private final By noRowsFound = By.xpath("//div[@class=\"rt-noData\"]");

  //add button
  private final By addNewRecordButton = By.xpath("//button[@id=\"addNewRecordButton\"]");

  //register form after push addNewRecordButton
  private final By regFirstName = By.id("firstName");
  private final By regLastName = By.id("lastName");
  private final By regUserEmail = By.id("userEmail");
  private final By regAge = By.id("age");
  private final By regSalary = By.id("salary");
  private final By regDepartment = By.id("department");
  private final By regSubmitButton = By.id("submit");

  //lines in tables
  private final By firstLine = By.xpath("(//div[@class=\"rt-tr-group\"])[1]");
  /**
   * fourthLine time mok for check new user default 3
   * todo search last add new user
   */
  private final By fourthLine = By.xpath("(//div[@class=\"rt-tr-group\"])[4]");

  //todo add prev and next button, page counter , rows (base 10)
//setters
  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }

  public void setWebTables() {
    driver.findElement(webTables).click();
  }

  public void setSortFirstName() {
    driver.findElement(sortFirstName).click();
  }

  public void setSortLastName() {
    driver.findElement(sortLastName).click();
  }

  public void setSortAge() {
    driver.findElement(sortAge).click();
  }

  public void setSortEmail() {
    driver.findElement(sortEmail).click();
  }

  public void setSortSalary() {
    driver.findElement(sortSalary).click();
  }

  public void setSortDepartment() {
    driver.findElement(sortDepartment).click();
  }

  public void setSortAction() {
    driver.findElement(sortAction).click();
  }

  public void setActionEdit() {
    driver.findElement(actionEdit).click();
  }

  public void setActionDelete() {
    driver.findElement(actionDelete).click();
  }

  public void setSearchBox(String search) {
    driver.findElement(searchBox).clear();
    driver.findElement(searchBox).sendKeys(search);
  }

  public void setAddNewRecordButton() {
    driver.findElement(addNewRecordButton).click();
  }

  public void setRegFirstName(String firstName) {
    driver.findElement(regFirstName).clear();
    driver.findElement(regFirstName).sendKeys(firstName);
  }

  public void setRegLastName(String lastName){
    driver.findElement(regLastName).clear();
    driver.findElement(regLastName).sendKeys(lastName);
  }

  public void setRegUserEmail(String userEmail) {
    driver.findElement(regUserEmail).clear();
    driver.findElement(regUserEmail).sendKeys(userEmail);
  }

  public void setRegAge(String age) {
    driver.findElement(regAge).clear();
    driver.findElement(regAge).sendKeys(age);
  }

  public void setRegSalary(String salary) {
    driver.findElement(regSalary).clear();
    driver.findElement(regSalary).sendKeys(salary);
  }

  public void setRegDepartment(String department) {
    driver.findElement(regDepartment).clear();
    driver.findElement(regDepartment).sendKeys(department);
  }

  public void setRegSubmitButton() {
    driver.findElement(regSubmitButton).click();
  }

  //getters

  public String getFirstLine() {
    return driver.findElement(firstLine).getText();
  }
  public String getFourthLine() {
    return driver.findElement(fourthLine).getText();
  }

  public String getNoRowsFound() {
    return driver.findElement(noRowsFound).getText();
  }

  public String getUser(String userMail) {
    //some code for return usermail
    //вернут ьвсю строку по задоному эмэйлу
    //TODO
    return driver.findElement(By.cssSelector(".rt-tr-group .rt-td:nth-child(4)")).getText();
  }
}


