package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FramesTest extends BaseTest {
    @Test
    public void testFrame(){
        var nestedFramesPage= homePage.clickFramesLink().clickNestedFramesLink();
        assertTrue(nestedFramesPage.getLeftFrameText().contains("LEFT"),"Left frame not found");
        assertTrue(nestedFramesPage.getBottomFrameText().contains("BOTTOM"),"BOTTOM frame not found");
    }
}
