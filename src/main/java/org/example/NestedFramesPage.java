package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrame ="frame-top";
    private String leftFrame ="frame-left";
    private String middleFrame ="frame-middle";
    private String bottomFrame ="frame-bottom";
    private String rightFrame ="frame-right";
    private WebDriverWait wait;
    private By body = By.tagName("body");
    public NestedFramesPage(WebDriver driver){this.driver = driver;}

    public String getLeftFrameText(){
        switchToFrame(topFrame);
        switchToFrame(leftFrame);
        String leftText = driver.findElement(body).getText();
        switchToDefaultFrame();
        return leftText;
    }
    public String getBottomFrameText(){
        switchToFrame(bottomFrame);
        String bottomText =  driver.findElement(body).getText();
        switchToDefaultFrame();
        return bottomText;
    }


    public void switchToFrame(String frameName){
        driver.switchTo().frame(frameName);
    }
    public void switchToDefaultFrame(){
        driver.switchTo().defaultContent();
    }
}
