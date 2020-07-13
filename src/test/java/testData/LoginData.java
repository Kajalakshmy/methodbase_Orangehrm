package testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelUtil;

public class LoginData extends ExcelUtil {
    private static final Logger LOGGER = Logger.getLogger(LoginData.class);

    public LoginData () {
        super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");
    }
    @DataProvider
    public Object[][] OrangeHRMLogin() {

        int rows = getRowCount("logindata ");
        int col = getColumnCount("logindata ");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("logindata ", i, j);
            }
        }
        return data;

    }
}
