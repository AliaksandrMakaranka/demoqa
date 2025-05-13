package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User extends CommonActions {
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

    public User(WebDriver driver) {
        super(driver);
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
}
