package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBox extends CommonActions {

  @FindBy(id = "tree-node-home")
  private WebElement homeCheckbox;

  @FindBy(id = "result")
  private WebElement result;

  @FindBy(xpath = "//*[@class=\"rct-icon rct-icon-uncheck\"]")
  private WebElement expandAll;

  @FindBy(xpath = "//*[@class=\"rct-icon rct-icon-check\"]")
  private WebElement collapseAll;

  @FindBy(xpath = "//*[@class=\"rct-icon rct-icon-uncheck\"]")
  private WebElement homeIfCollapse;

  @FindBy(xpath = "//*[@stroke=\"currentColor\" and @viewBox=\"0 0 448 512\"]")
  private WebElement elementsLocator;

  @FindBy(xpath = "//span[@class=\"text\" and contains(text(), \"Check Box\")]")
  private WebElement checkBox;

  public CheckBox(WebDriver driver) {
    super(driver);
  }

  public String getActualResultAllCheckbox() {
    return "You have selected :\nhome\ndesktop\nnotes\ncommands\ndocuments\nworkspace\nreact\nangular\nveu\noffice\npublic\nprivate\nclassified\ngeneral\ndownloads\nwordFile\nexcelFile";
  }

  public String getSelectedResult() {
    return getText(result);
  }

  public void setExpandAll() {
    click(expandAll);
  }

  public void setCollapseAll() {
    click(collapseAll);
  }

  public void setCheckBoxElements() {
    if (!homeIfCollapse.isSelected()) {
      click(homeIfCollapse);
    }
  }

  public void setElementsLocator() {
    click(elementsLocator);
  }

  public void setCheckBox() {
    click(checkBox);
  }

  public void setUpBeforeEach() {
    driver.get("https://demoqa.com");
    driver.manage().window().maximize();
    this.setElementsLocator();
    this.setCheckBox();
  }

  public void clickHomeCheckbox() {
    click(homeCheckbox);
  }

  public String getResultText() {
    return getText(result);
  }
}
