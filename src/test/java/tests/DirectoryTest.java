package tests;

import classpack.Directory;
import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.util.logging.Logger;

public class DirectoryTest extends TestBase {
    public SoftAssert softAssert;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Directory.class));

    @Test(priority = 1)
    public void RoleTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(Directory.isDashBoardDisplay(), "IS NOT DISPLAYED ");
        Directory.isDashBoardDisplay();
        Directory.clickdirectory();
        softAssert.assertTrue(Directory.isdirctorydisplayed(),"is not displayed dirctory");
        Directory.setname("j");
        Directory.getSelectedjobtitleDropDown("CEO");
        Directory.getSelectedlocationDropDown(2);
        Directory.btnsearch();

    }
}