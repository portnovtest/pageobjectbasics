package comw2a.testcases;

import comw2a.base.Page;
import comw2a.pages.ZohoAppPage;
import comw2a.pages.crm.accounts.AccountsPage;
import comw2a.pages.crm.accounts.CreateAccountPage;
import comw2a.utilities.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class CreateAccountTest {

    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void createAccountTest(Hashtable<String,String> data){

        ZohoAppPage zp = new ZohoAppPage();
        zp.goToCRM();
        AccountsPage account = Page.menu.gotoAccounts();
        CreateAccountPage cap = account.gotoCreateAccounts();
        cap.createAccount(data.get("accountname"));
    }
}
