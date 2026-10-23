package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By ExampleLinkOne = By.partialLinkText("Example 1");
    public DynamicLoadingPage(WebDriver driver) {this.driver = driver;}
    public ExampleOnePage cliclExampleOneLink(){
        driver.findElement(ExampleLinkOne).click();
        return new ExampleOnePage(driver);
    }
}
