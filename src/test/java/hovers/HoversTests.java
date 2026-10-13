package hovers;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends BaseTest {
    @Test
    public void testHovers(){
        int index = 1;
        var hoversPage = homePage.clickHoversLink();
        var figureCaption = hoversPage.hoverOverFigure(index);
        assertTrue(figureCaption.isCaptionDisplayed(),
                "The caption is not displayed");
        assertEquals(figureCaption.getName(),
                "name: user"+index,
                " The name is not correct");
        assertEquals(figureCaption.getLinkText(),"View profile",
                " The link text is not correct");
        assertTrue(figureCaption.getLinkURL().contains("/users/"+index),
                " The link URl is not correct");
    }
}
