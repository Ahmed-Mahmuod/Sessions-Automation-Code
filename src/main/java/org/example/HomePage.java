package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticatuinLink = By.linkText("Form Authentication");//اتاكد من الكلمة لما تبقي متصل بالنت

    public  HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickAuthenticatuinLink(){
        driver.findElement(formAuthenticatuinLink).click();
        return new LoginPage(driver);
    }

}
