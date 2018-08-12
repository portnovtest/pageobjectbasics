package comw2a.pages;

import comw2a.base.Page;

public class LoginPage extends Page {

    public ZohoAppPage doLogin(String username, String password){
        type("email_CSS", username);
        type("password_CSS", password);
        click("signbtn_CSS");
        return new ZohoAppPage();

    }
}
