package js;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlertsTest extends BaseTest {
    @Test
    public void testAlerts(){
        var javaScreptAlertPage = homePage.clickJavaScreptLink();
        javaScreptAlertPage.clickAlertButton();
        assertEquals(javaScreptAlertPage.getAlertMessage(),"I am a JS Alert",
                "The Alert massage  is incorrect");
        javaScreptAlertPage.acceptAlert();
        assertEquals(javaScreptAlertPage.getResultMessage(),"You successfully clicked an alert",
                "The Result massage is incorrect");
    }

    @Test
    public void testConfirm(){
        var javaScreptAlertPage = homePage.clickJavaScreptLink();
        javaScreptAlertPage.clickConfirmButton();
        assertEquals(javaScreptAlertPage.getAlertMessage(),"I am a JS Confirm",
                "The Alert Confirm massage  is incorrect");
        javaScreptAlertPage.dismissConfirmAlert();
        assertEquals(javaScreptAlertPage.getResultMessage(),"You clicked: Cancel",
                "The Result Confirm massage is incorrect");
    }

    @Test
    public void testPrompt(){
        var javaScreptAlertPage = homePage.clickJavaScreptLink();
        javaScreptAlertPage.clickPromptButton();
        assertEquals(javaScreptAlertPage.getAlertMessage(),"I am a JS prompt",
                "The Alert Prompt massage  is incorrect");
        javaScreptAlertPage.setPromptText("Route");
        javaScreptAlertPage.acceptAlert();
        assertEquals(javaScreptAlertPage.getResultMessage(),"You entered: Route",
                "The Result Prompt massage is incorrect");
    }

}
