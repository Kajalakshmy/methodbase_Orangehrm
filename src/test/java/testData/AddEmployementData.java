package testData;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelUtil;

public class AddEmployementData extends ExcelUtil {
    private static final Logger LOGGER = Logger.getLogger(AddEmployementData.class);

    public AddEmployementData () {super("src\\test\\resources\\ExcelSheet\\Admin.xlsx");}
    @DataProvider(name ="OrangeHRMLogin")
    public Object[][] OrangeHRMLogin() {

        int rows = getRowCount("AddEmployementData");
        int col = getColumnCount("AddEmployementData");


        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("AddEmployementData", i, j);
            }
        }
        return data;

    }
}


