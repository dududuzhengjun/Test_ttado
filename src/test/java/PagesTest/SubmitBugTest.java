package PagesTest;

import Pages.submitBUG;
import Utils.ExcelUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class SubmitBugTest {

    submitBUG page = new submitBUG();
    @BeforeTest
    public void addbug1 () {
        page.before();
    }
    @Test(dataProvider = "bug")
    public void addbug2 (Map<String,String> map) {

        page.submitbug(map);
    }
    @DataProvider(name = "bug")
    public Iterator<Object[]> getExcelData(){
        return new ExcelUtils("提交BUG");
    }
}
