package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By imputFiled = By.id("target");
    private By resultMassage = By.id("result");
    public KeyPressesPage(WebDriver driver) {this.driver = driver;}

    public void setText(String text){
        driver.findElement(imputFiled).sendKeys(text);
    }
    public String getResultMassage(){
        return driver.findElement(resultMassage).getText();
    }

}
