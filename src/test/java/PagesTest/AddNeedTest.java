package PagesTest;

import Pages.AddNeed;
import Utils.ExcelUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class AddNeedTest {
    AddNeed user = new AddNeed();
    @BeforeTest
    public void openBrowser (){
        user.openBrowser();
    }

    @Test(dataProvider = "need")
    public void addUser (Map<String,String> map) {
        user.addProduct(map);
    }

    @DataProvider(name = "need")
    public Iterator<Object[]> getExcelData () {
        return new ExcelUtils("添加需求");
    }
}
