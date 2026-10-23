package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWindowsPage {
    private WebDriver driver;
    private By header =By.tagName("h3");
    public NewWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText(){
        return driver.findElement(header).getText();
    }

}
