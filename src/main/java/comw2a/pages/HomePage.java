package comw2a.pages;

import comw2a.base.Page;
import org.openqa.selenium.By;

public class HomePage extends Page {

    public void goToSignUp(){

        driver.findElement(By.cssSelector(".zh-signup")).click();
    }

    public LoginPage goToLogin(){

        click("loginlink_CSS");
        return new LoginPage();
    }

    public void goToSupport(){

        driver.findElement(By.cssSelector(".zh-user-account>a:nth-child(2)")).click();
    }
    public void goToCustomers(){

    }

    public void goToLearnMore(){

    }

    public void validateFooterLinks(){

    }
}
