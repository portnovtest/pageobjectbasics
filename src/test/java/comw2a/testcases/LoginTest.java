package comw2a.testcases;

import comw2a.pages.HomePage;
import comw2a.pages.LoginPage;
import comw2a.pages.ZohoAppPage;
import comw2a.utilities.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Hashtable;


public class LoginTest extends BaseTest {

    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void LoginTest(Hashtable<String,String> data){
        HomePage home = new HomePage();
        LoginPage lp = home.goToLogin();
        lp.doLogin(data.get("username"),data.get("password"));
    }
}
