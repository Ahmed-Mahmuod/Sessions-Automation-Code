package org.example;

import org.openqa.selenium.*;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By table=By.id("large-table");
    public LargeAndDeepDomPage(WebDriver driver){this.driver = driver;}

    public void scrollToTable(){
        var js =(JavascriptExecutor)driver;
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";
        js.executeScript(script,tableElement);
    }
}
