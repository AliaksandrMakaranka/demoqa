package com.demoqa.pages.elements;

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

  private final By checkBoxElements = By.xpath(
      "//*[@class=\"rct-icon rct-icon-check\"]");//default isn't enable

  private final By homeIfCollapse = By.xpath(
      "//*[@class=\"rct-icon rct-icon-uncheck\"]"); //x1 if uncolapse all = x17
  private final By selectedResult = By.xpath("//div[@class=\"display-result mt-4\"]");


  public String getActualResultAllCheckbox() {
    return "You have selected :\nhome\ndesktop\nnotes\ncommands\ndocuments\nworkspace\nreact\nangular\nveu\noffice\npublic\nprivate\nclassified\ngeneral\ndownloads\nwordFile\nexcelFile";
  }

  public String getSelectedResult() {
    return driver.findElement(selectedResult).getText();
  }

  public void setExpandAll() {

    //if not expand all anh open if it open?
    driver.findElement(expandAll).click();
  }

  public void setCollapseAll() {
    driver.findElement(collapseAll).click();
  }

  public void setCheckBoxElements() {
    WebElement e = driver.findElement(homeIfCollapse);
    if (!e.isSelected()) {
      e.click();
    }
    //todo
  }


  public void setElementsLocator() {
    driver.findElement(elementsLocator).click();
  }

  public void setCheckBox() {
    driver.findElement(checkBox).click();
  }

  public void setUpBeforeEach() {
    driver.get("https://demoqa.com");
    driver.manage().window().maximize();
    this.setElementsLocator();
    this.setCheckBox();
  }


}
