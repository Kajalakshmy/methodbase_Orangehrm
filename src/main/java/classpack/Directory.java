package classpack;
import controllers.MethodBase;
import controllers.PageBase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import java.util.logging.Logger;

public class Directory extends PageBase {

    private static By jobtitle = By.id("searchDirectory_job_title");
    private static By location = By.id("searchDirectory_location");

    public static boolean isDashBoardDisplay() {
        return MethodBase.isDisplayed_ById("menu_dashboard_index");

    }

    public static void clickdirectory() {
        MethodBase.click_ByXpath("//*[@id=\"menu_directory_viewDirectory\"]/b");
    }

    public static boolean isdirctorydisplayed() {
        return MethodBase.isDisplayed_ByXpath("//*[@id=\"menu_directory_viewDirectory\"]/b");
    }

    public static void setname(String name) {
        MethodBase.setText_ByXpath("//*[@id=\"searchDirectory_emp_name_empName\"]", "ds");
    }


    public static void getSelectedjobtitleDropDown(String vddf) {
        Select dropDownOptiontype = new Select(getDriver().findElement(jobtitle));
        dropDownOptiontype.selectByVisibleText(vddf);
    }

    public static void getSelectedlocationDropDown(int kkk) {
        Select dropDownOptiontype = new Select(getDriver().findElement(location));
        dropDownOptiontype.selectByIndex(kkk);
    }

    public static void btnsearch(){
        MethodBase.click_ByXpath("//*[@id=\"searchBtn\"]");
    }
}
