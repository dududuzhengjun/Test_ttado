package PagesTest;

import Pages.ModifiedData;
import Utils.ExcelUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class ModifiedDataTest {
    ModifiedData modifieddata = new ModifiedData();

    @BeforeTest
    public void openBrowser () {
        modifieddata.openBrowser();
    }

    @Test(dataProvider = "data")
    public void modifiedData (Map<String,String> map) {
        modifieddata.modifiedData(map);
    }

    @DataProvider(name = "data")
    public Iterator<Object[]> getExcelData() {
        return new ExcelUtils("修改档案资料");
    }

}
