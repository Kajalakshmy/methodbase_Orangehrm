package testData;

import org.apache.log4j.Logger;

import org.testng.annotations.DataProvider;
import utils.ExcelUtil;

public class PaygradeData extends ExcelUtil {
    private static final Logger LOGGER = Logger.getLogger(PaygradeData.class);

    public PaygradeData () {super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");}
    @DataProvider(name ="OrangeHRMpay")
    public Object[][] OrangeHRMpay() {

        int rows = getRowCount("paygradedata");
        int col = getColumnCount("paygradedata");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("paygradedata", i, j);
            }
        }
        return data;

    }
}

