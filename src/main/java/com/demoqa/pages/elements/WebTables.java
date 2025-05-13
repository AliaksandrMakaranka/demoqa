package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTables extends CommonActions {
    @FindBy(id = "addNewRecordButton")
    private WebElement addButton;

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "userEmail")
    private WebElement userEmailInput;

    @FindBy(id = "age")
    private WebElement ageInput;

    @FindBy(id = "salary")
    private WebElement salaryInput;

    @FindBy(id = "department")
    private WebElement departmentInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "searchBox")
    private WebElement searchBox;

    @FindBy(id = "basic-addon2")
    private WebElement searchButton;

    @FindBy(id = "delete-record-4")
    private WebElement deleteButton;

    @FindBy(id = "edit-record-4")
    private WebElement editButton;

    public WebTables(WebDriver driver) {
        super(driver);
    }

    public void clickAddButton() {
        click(addButton);
    }

    public void fillForm(String firstName, String lastName, String userEmail, String age, String salary, String department) {
        sendKeys(firstNameInput, firstName);
        sendKeys(lastNameInput, lastName);
        sendKeys(userEmailInput, userEmail);
        sendKeys(ageInput, age);
        sendKeys(salaryInput, salary);
        sendKeys(departmentInput, department);
        click(submitButton);
    }

    public void search(String text) {
        sendKeys(searchBox, text);
        click(searchButton);
    }

    public void clickDeleteButton() {
        click(deleteButton);
    }

    public void clickEditButton() {
        click(editButton);
    }
}


