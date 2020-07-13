package tests;

import classpack.LoginPage;
import classpack.PayGradePage;
import com.google.gson.internal.$Gson$Preconditions;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testData.PaygradeData;

import java.util.logging.Logger;


public class PayGradeTest extends TestBase {
    public SoftAssert softAssert;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PayGradePage.class));

    @Test(priority = 1, dataProviderClass = PaygradeData.class, dataProvider = "OrangeHRMpay")
    public void RoleTest(String payGrade_name) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(PayGradePage.isDashBoardDisplay(), "IS NOT DISPLAYED ");
        PayGradePage.clickAdmin();
        PayGradePage.clickJob();
        PayGradePage.clickPayGrade();
        softAssert.assertTrue(PayGradePage.ispayGradeDisplay(), "is not displayed paygrade ");
        PayGradePage.clickAdd();
        softAssert.assertTrue(PayGradePage.ispayaddDisplay(), "IS NOT DISPLAYED ");
        PayGradePage.setName(payGrade_name);
        PayGradePage.Clicksave();


    }

}