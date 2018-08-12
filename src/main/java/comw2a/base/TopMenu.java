package comw2a.base;

import comw2a.pages.crm.accounts.AccountsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {

    /*
     *
     * TopMenu ISA Page ???
     *
     * HomePage HASA TopMenu
     * AccountsPage HASA TopMenu
     *
     * Page HASA TopMenu
     *
     *
     */

    WebDriver driver;

    public TopMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoHome(){

    }
    public void gotoFeeds(){

    }
    public void gotoLeads(){

    }
    public AccountsPage gotoAccounts(){

       Page.click("accountstab_CSS");
        return new AccountsPage();
    }
    public void gotoContacts(){

    }

    public void signOut(){

    }


}
