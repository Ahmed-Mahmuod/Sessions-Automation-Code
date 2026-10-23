package waits;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitsTests extends BaseTest {
    @Test
    public void testWaits(){
        var exampleOnePage =homePage.clickDynamicLoadingLink().cliclExampleOneLink();
        exampleOnePage.clickStartButton();

        assertEquals(exampleOnePage.getLoadedMessage(),"Hello World!",
                "Example 1 text isn't displayed");

    }
}
