package navigate;

import base.BaseTest;
import org.example.NewWindowsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WindowsTests extends BaseTest {
    @Test
    public void SwitchToTabTest(){
        var newWindowPage = homePage.clickMultipleWindowsLink().clickLink();
        getWindowManager().switchToTab("New Window");
        String headerText = newWindowPage.getHeaderText();
        assertEquals(headerText,"New Window",
                "New Window Title incorrect");


    }

}
