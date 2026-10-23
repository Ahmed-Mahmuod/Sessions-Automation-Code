package base;

import com.google.common.io.Files;
import listener.MyListener;
import org.example.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.WindowManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.*;
import java.util.List;

public class BaseTest {
    private WebDriver driver;
    //private By linkLocator = By.tagName("a");
    //private By inputLink = By.linkText("Inputs");
    protected HomePage homePage;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver(getChromeOptions());
        setCookie();
        //driver.get("https://the-internet.herokuapp.com/");
        //homePage = new HomePage(driver);

//        System.out.println(driver.getTitle());
//        //driver.manage().window().maximize();
//        //driver.manage().window().fullscreen();
//        //driver.manage().window().setSize(new Dimension(430,932));
//        List<WebElement> links =driver.findElements(linkLocator);
//        System.out.printf("the num of links is: "+ links.size());
//        driver.findElement(inputLink).click();
        //driver.close();
        //driver.quit();
    }
//    public static void main(String[] args) {
//        BaseTest baseTest = new BaseTest();
//        baseTest.setup();
    @BeforeMethod
    public void goHome() {
        WebDriverListener listener = new MyListener();
        WebDriver decorated = new EventFiringDecorator<>(listener).decorate(driver);
        decorated.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(decorated);
    }

    @AfterMethod
    public void recordFailure(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return options;
    }
    private void setCookie() {
        Cookie cookie = new Cookie("Route","123");
        driver.manage().addCookie(cookie);
    }

}


