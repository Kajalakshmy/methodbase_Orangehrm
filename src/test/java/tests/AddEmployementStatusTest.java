package tests;

import classpack.AddEmployementStatus;
import classpack.PayGradePage;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testData.AddEmployementData;
import testData.PaygradeData;

import java.util.logging.Logger;

public class AddEmployementStatusTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddEmployementData.class));
    @Test(priority = 1 ,dataProviderClass = AddEmployementData.class, dataProvider = "OrangeHRMLogin")
    public void RoleTest(String empStatus_name){
        softAssert = new SoftAssert();
        softAssert.assertTrue(AddEmployementStatus.isDashBoardDisplay(), "IS NOT DISPLAYED ");
        AddEmployementStatus.clickAdmin();
        AddEmployementStatus.clickJob();
        AddEmployementStatus.clickEmployementstatus();
        softAssert.assertTrue(AddEmployementStatus.isEmployementstatusDisplay(), "is not displayed paygrade ");
        AddEmployementStatus.clickAdd();
        AddEmployementStatus.setName(empStatus_name);
        AddEmployementStatus.clickbtnsave();



    }

}
