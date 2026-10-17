package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By nestedFrameLink = By.linkText("Nested Frames");
    public FramesPage(WebDriver driver){
        this.driver = driver;
    }
    public NestedFramesPage clickNestedFramesLink(){
        driver.findElement(nestedFrameLink).click();
        return new NestedFramesPage(driver);
    }




}
