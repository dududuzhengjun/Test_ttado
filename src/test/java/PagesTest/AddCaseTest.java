package PagesTest;

import Pages.AddCase;
import Utils.ExcelUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class AddCaseTest {
    AddCase addcase = new AddCase();

    @BeforeTest
    public void openBrowser () {
        addcase.openBrowser();
    }

    @Test(dataProvider = "case")
    public void addCase (Map<String,String> map) {
        addcase.addCase(map);
    }

    @DataProvider(name = "case")
    public Iterator<Object[]> getexceldata () {
        return new ExcelUtils("添加用例");
    }
}
