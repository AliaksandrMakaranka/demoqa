package com.demoqa.pages.elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {

  private final WebDriver driver;
  public CheckBox(WebDriver driver) {
    this.driver = driver;

  }
  private final By elementsLocator = By.xpath(
      "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]");
  private final By checkBox = By.xpath(
      "//span[@class=\"text\" and contains(text(), \"Check Box\")]");

  private final By expandAll = By.xpath("//*[@class=\"rct-icon rct-icon-expand-all\"]");
  private final By collapseAll = By.xpath("//*[@class=\"rct-icon rct-icon-collapse-all\"]");

  private final By checkBoxElements = By.xpath("//*[@class=\"rct-icon rct-icon-check\"]");

  public void setExpandAll() {

    //if not expand all anh open if it open?
    driver.findElement(expandAll).click();
  }

  public void setCollapseAll() {
    driver.findElement(collapseAll).click();
  }
  public void setCheckBoxElements() {
    List<WebElement> checkBox_Elem = driver.findElements(checkBoxElements);
  }

  public void setWORKING_PAGE() {
    String WORKING_PAGE = "https://demoqa.com/";
    driver.get(WORKING_PAGE);
  }

  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }

  public void setCheckBox() {
    driver.findElement(checkBox).click();
  }

  public void setUpBeforeEach() {
    this.setWORKING_PAGE();
    driver.manage().window().maximize();
    this.setElementsLocator();
    this.setCheckBox();
  }

}
