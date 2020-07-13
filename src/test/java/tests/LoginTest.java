package tests;

import classpack.LoginPage;
import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testData.LoginData;

public class LoginTest extends TestBase {
   private static final Logger LOGGER = Logger.getLogger(LoginTest.class);
    @Test(priority = 0,groups = "REGRESSION",dataProviderClass = LoginData.class, dataProvider = "OrangeHRMLogin")

    public void LoginCorrect(String uname, String password){
       softAssert = new SoftAssert();

        LoginPage.setUserName(uname);

        LoginPage.setPassword(password);
        LoginPage.clickLogin();


    }
    }
