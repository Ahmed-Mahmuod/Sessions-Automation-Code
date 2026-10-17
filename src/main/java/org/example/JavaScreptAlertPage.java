package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScreptAlertPage {
    private WebDriver driver;
    private By alertButton = By.xpath("//button[contains(.,' Alert')]");
    private By confirmButton = By.xpath("//button[contains(.,' Confirm')]");
    private By promptButton = By.xpath("//button[contains(.,' Prompt')]");
    private By resultMessage = By.id("result");
    public JavaScreptAlertPage(WebDriver driver){this.driver = driver;}

    public void  clickAlertButton(){
        driver.findElement(alertButton).click();
    }
    public void  clickConfirmButton(){
        driver.findElement(confirmButton).click();
    }
    public void  clickPromptButton(){
        driver.findElement(promptButton).click();
    }
    public void  acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }
    public void dismissConfirmAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void setPromptText(String promptText){
        driver.switchTo().alert().sendKeys(promptText);
    }
    public String getResultMessage(){
        return driver.findElement(resultMessage).getText();
    }

}
