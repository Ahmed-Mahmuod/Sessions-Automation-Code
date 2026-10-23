package js;

import base.BaseTest;
import org.testng.annotations.Test;

public class JsExeuterTests extends BaseTest {
    @Test
    public void tableScrollTest (){
       homePage.clickLargeAndDeepDomLink().scrollToTable();
    }
    @Test
    public void scrollToParagraphTest (){
        homePage.clickInfinitScrollpage().scrollToParagraph(5);
    }
}
