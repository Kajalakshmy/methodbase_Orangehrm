package classpack;

import controllers.MethodBase;
import controllers.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class AddEntitilement  extends PageBase {
    private static By DashBoard;
    public SoftAssert softAssert;
    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(AddEntitilement.class));

    private static By leavetype = By.xpath("//*[@id=\"entitlements_leave_type\"]");
    private static By leaveperdiot= By.xpath("//*[@id=\"period\"]");
   // private static By subunit= By.xpath("//*[@id=\"entitlements_filters_subunit\"]");
    public static boolean isDashBoardDisplay() {
        return MethodBase.isDisplayed_ByXpath("//*[@id=\"menu_dashboard_index\"]/b");
    }


    public static void clickLeave(){
        MethodBase.click_ById("menu_leave_viewLeaveModule");
    }

    public static void clickEntitlement(){
        MethodBase.click_ByXpath("//*[@id=\"menu_leave_Entitlements\"]");
    }

    public static void clickaddentitlement(){
        MethodBase.click_ByXpath("//*[@id=\"menu_leave_addLeaveEntitlement\"]");
    }

    public static void checkbox(String name){
        MethodBase.setText_ByXpath("//*[@id=\"entitlements_filters_bulk_assign\"]","ds");
    }
    public static void setEmployee(String emname){
        MethodBase.setText_ByXpath("//*[@id=\"entitlements_employee_empName\"]","Employee");
    }

    public static void getSelectedleavetypeDropDown(int kkk) {
        Select dropDownOptiontype = new Select(getDriver().findElement(leavetype));
        dropDownOptiontype.selectByIndex(kkk);
    }

    public static void getSelectedleaveperdiotDropDown(int vvv) {
        Select dropDownOptiontype = new Select(getDriver().findElement(leaveperdiot));
        dropDownOptiontype.selectByIndex(vvv);
    }
 //   public static void getSelectedsubunitDropDown(int eee) {
   //     Select dropDownOptiontype = new Select(getDriver().findElement(subunit));
     //   dropDownOptiontype.selectByIndex(eee);
   // }


    public static void setentitlement(String entitlement){
        MethodBase.setText_ByXpath("//*[@id=\"entitlements_entitlement\"]","en");
    }
    public static void clickbtnsave(){
        MethodBase.click_ByXpath("//*[@id=\"btnSave\"]");
    }


}
