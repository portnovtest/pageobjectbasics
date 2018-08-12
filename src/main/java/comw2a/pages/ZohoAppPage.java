package comw2a.pages;

import comw2a.base.Page;
import comw2a.pages.crm.CRMHomePage;
import org.openqa.selenium.By;

public class ZohoAppPage extends Page {


    public void goToChat(){

    }

    public CRMHomePage goToCRM(){

        click("crmlink_CSS");
        return new CRMHomePage();
    }

    public void goToSalesIQ(){
        driver.findElement(By.xpath("//p[text()[contains(.,'SalesIQ')]]")).click();
    }
}
