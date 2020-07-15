package tests;

import classpack.AddEntitilement;

import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testData.PaygradeData;

import javax.swing.*;
import java.util.logging.Logger;

public class AddEntitlementTest extends TestBase {
    public SoftAssert softAssert;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(AddEntitilement.class));

    @Test(priority = 1)
    public void RoleTest( ) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(AddEntitilement.isDashBoardDisplay(), "IS NOT DISPLAYED ");
        AddEntitilement.clickLeave();
        AddEntitilement.clickEntitlement();
        AddEntitilement.clickaddentitlement();
        AddEntitilement.checkbox("");
        AddEntitilement.setEmployee("employe");
        AddEntitilement.getSelectedleaveperdiotDropDown(1);
        AddEntitilement.getSelectedleaveperdiotDropDown(2);
        AddEntitilement.setentitlement("entitlement");
       // AddEntitilement.getSelectedsubunitDropDown(2);
        AddEntitilement.clickbtnsave();


    }
}
