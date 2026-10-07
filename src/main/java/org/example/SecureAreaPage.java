package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By messageLocator = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public String getMessageText(){
        return driver.findElement(messageLocator).getText();
    }
}
