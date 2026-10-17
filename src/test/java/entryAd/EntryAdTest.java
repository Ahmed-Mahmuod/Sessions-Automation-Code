package entryAd;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EntryAdTest extends BaseTest {
    @Test
    public void testModal(){
        var entryAdPage = homePage.clickEntryAdLink();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        entryAdPage.clickClose();
        entryAdPage.clickRestartlink();
        assertEquals(entryAdPage.getHeaderText(), "Entry Ad",
                "The header text is incorrect");
    }
}
