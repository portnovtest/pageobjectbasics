package comw2a.pages.crm.accounts;

import comw2a.base.Page;
import org.openqa.selenium.By;

public class AccountsPage extends Page {



    public CreateAccountPage gotoCreateAccounts(){

        click("createaccountbtn_CSS");
        return new CreateAccountPage();
    }

    public void gotoImportAccounts(){

    }
}
