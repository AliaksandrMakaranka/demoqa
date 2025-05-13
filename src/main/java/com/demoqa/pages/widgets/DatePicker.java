package com.demoqa.pages.widgets;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePicker extends BasePage {
    @FindBy(id = "datePickerMonthYearInput")
    private WebElement datePickerInput;

    @FindBy(id = "dateAndTimePickerInput")
    private WebElement dateAndTimePickerInput;

    public DatePicker(WebDriver driver) {
        super(driver);
    }

    public void selectDate(String date) {
        sendKeys(datePickerInput, date);
    }

    public void selectDateAndTime(String dateAndTime) {
        sendKeys(dateAndTimePickerInput, dateAndTime);
    }
}
