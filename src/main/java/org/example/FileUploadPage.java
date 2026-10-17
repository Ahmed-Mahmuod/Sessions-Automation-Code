package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUploadButton = By.id("file-upload");
    private By fileSubmitButton = By.id("file-submit");
    private By uploadeFile = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {this.driver = driver;}
    public void uploadFile(String filePath) {
        driver.findElement(fileUploadButton).sendKeys(filePath);
        clickSubmitButton();
    }
    public void clickSubmitButton(){
        driver.findElement(fileSubmitButton).click();
    }
    public String getFileUploadText(){
        return driver.findElement(uploadeFile).getText();
    }

}
