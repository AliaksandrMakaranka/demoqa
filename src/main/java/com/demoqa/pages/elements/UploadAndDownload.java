package com.demoqa.pages.elements;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadAndDownload extends CommonActions {
    @FindBy(id = "uploadFile")
    private WebElement uploadFile;

    @FindBy(id = "downloadButton")
    private WebElement downloadButton;

    @FindBy(id = "uploadedFilePath")
    private WebElement uploadedFilePath;

    public UploadAndDownload(WebDriver driver) {
        super(driver);
    }

    public void uploadFile(String filePath) {
        sendKeys(uploadFile, filePath);
    }

    public void clickDownloadButton() {
        click(downloadButton);
    }

    public String getUploadedFilePath() {
        return getText(uploadedFilePath);
    }
}
