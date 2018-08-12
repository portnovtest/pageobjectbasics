package comw2a.testcases;

import comw2a.base.Page;
import org.testng.annotations.AfterSuite;

public class BaseTest {

    @AfterSuite
    public void tearDown(){
        Page.quit();
    }
}
