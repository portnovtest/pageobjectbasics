package comw2a.pages.crm.accounts;

import comw2a.base.Page;
import org.openqa.selenium.By;

public class CreateAccountPage extends Page {

    public void createAccount(String accountName){
       type("accountname_CSS", accountName);
    }
}
