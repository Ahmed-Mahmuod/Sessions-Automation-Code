package base;

import org.example.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class BaseTest {
    private WebDriver driver;
    //private By linkLocator = By.tagName("a");
    //private By inputLink = By.linkText("Inputs");
    protected HomePage homePage;
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

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
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

