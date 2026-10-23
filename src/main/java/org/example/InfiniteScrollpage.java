package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollpage {
    private WebDriver driver;
    public InfiniteScrollpage(WebDriver driver){this.driver=driver;}
    private By paragraphs =By.className("jscroll-added");
 /**
 * @param index the number of Paragraph to scroll to
 * */
    public void scrollToParagraph(int index){
        var js =(JavascriptExecutor)driver;

        String script = "window.scrollTo(0,document.body.scrollHeight);";

        while (getNumberOfParagraph()<index){
            js.executeScript(script);
        }
    }
    public int getNumberOfParagraph(){
        return driver.findElements(paragraphs).size();
    }
}
