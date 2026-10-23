package navigate;

import base.BaseTest;
import org.testng.annotations.Test;



public class NavigationTests extends BaseTest {
    @Test
    public void navigationTest(){
        homePage.clickDynamicLoadingLink().cliclExampleOneLink();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refresh();
        getWindowManager().goToUrl("https://www.google.com");
    }
}
