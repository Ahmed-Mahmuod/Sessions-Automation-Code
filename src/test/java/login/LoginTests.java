package login;



import base.BaseTest;
import org.example.LoginPage;
import org.example.SecureAreaPage;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {
    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickAuthenticatuinLink();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String message = secureAreaPage.getMessageText();
        assertTrue(message.contains("You logged into a secure area!"),"You didn't login!!!");
    }
}
