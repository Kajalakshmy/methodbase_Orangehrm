package testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelUtil;

public class AddEntitlementData extends ExcelUtil {
    private static final Logger LOGGER = Logger.getLogger(AddEntitlementData.class);

    public AddEntitlementData () {super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");}
    @DataProvider(name ="OrangeHRMpay")
    public Object[][] OrangeHRMpay() {

        int rows = getRowCount("EntitlementData");
        int col = getColumnCount("EntitlementData");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("EntitlementData", i, j);
            }
        }
        return data;

    }
}

