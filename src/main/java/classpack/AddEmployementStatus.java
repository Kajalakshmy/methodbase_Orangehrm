package classpack;

import controllers.MethodBase;
import controllers.PageBase;
import org.testng.asserts.SoftAssert;
import java.util.logging.Logger;

public class AddEmployementStatus extends PageBase {
    public SoftAssert softAssert;
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(AddEmployementStatus.class));

    public static void clickAdmin() {
        MethodBase.click_ByXpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
    }

        public static void clickJob() {
            MethodBase.click_ByXpath("//*[@id=\"menu_admin_Job\"]");

    }

        public static void clickEmployementstatus (){
        MethodBase.click_ByXpath("//*[@id=\"menu_admin_employmentStatus\"]");
        }

        public static void clickAdd(){
        MethodBase.click_ByXpath("//*[@id=\"btnAdd\"]");

    }

        public static void setName(){
        MethodBase.setText_ByID("empStatus_name");
    }

        public static void clickbtnsave(){
        MethodBase.click_ByXpath("//*[@id=\"btnSave\"]");
    }

        public static void cancel(){
        MethodBase.click_ByXpath("//*[@id=\"btnCancel\"]");
        }


}
