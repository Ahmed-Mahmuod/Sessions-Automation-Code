package keyPresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeyPressesTest extends BaseTest {
    @Test
    public void testKeys(){
        var keyPressesPage=homePage.clickKeyPressLink();
        keyPressesPage.setText(Keys.chord(Keys.SHIFT,"a"));
        assertEquals(keyPressesPage.getResultMassage(),
                "You entered: A",
                "Massage is incorrect");

    }
}
