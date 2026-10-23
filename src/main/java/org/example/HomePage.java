package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
//    private By formAuthenticatuinLink = By.linkText("Form Authentication");//اتاكد من الكلمة لما تبقي متصل بالنت
    public  HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickAuthenticatuinLink(){
//      driver.findElement(formAuthenticatuinLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHoversLink (){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPressLink(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaScreptAlertPage clickJavaScreptLink(){
        clickLink("JavaScript Alerts");
        return new JavaScreptAlertPage(driver);
    }
    public FileUploadPage clickFileUploadLink(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public EntryAdPage clickEntryAdLink(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }
    public FramesPage clickFramesLink(){
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDomLink(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollpage clickInfinitScrollpage (){
        clickLink("Infinite Scroll");
        return new InfiniteScrollpage(driver);
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
