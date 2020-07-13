package classpack;

import controllers.MethodBase;
import controllers.PageBase;
import org.apache.log4j.Logger;
import org.testng.asserts.SoftAssert;

public class LoginPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    public static void isLoginPageDisplay() {
        MethodBase.isDisplayed_ById("logInPanelHeading");
    }

    public static void setUserName( String name) {
        MethodBase.setText_ByXpath("//*[@id=\"txtUsername\"]", name);
    }

    public static void setPassword(String password) {
        MethodBase.setText_ByXpath("//*[@id=\"txtPassword\"]",password);

    }
    public static void clickLogin() {
        MethodBase.clickButton_ByXpath("//*[@id=\"btnLogin\"]");
    }

//     public static void isLoginAlertDisplay() {
//     MethodBase.isDisplayed_ById("spanMessage");

    public static void isLoginAlertDisplay() {
        MethodBase.isDisplayed_ById("spanMessage");
    }

}

