package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleOnePage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
    private By loadedMessage =By.cssSelector("#finish > h4");
    public ExampleOnePage(WebDriver driver){this.driver = driver;}
    public void clickStartButton(){
        driver.findElement(startButton).click();
    }
    public String getLoadedMessage(){
//        try {
//            Thread.sleep(5000);
//        }catch (InterruptedException e){}
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadedMessage)));
        return driver.findElement(loadedMessage).getText();
    }
}
