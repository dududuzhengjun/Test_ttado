package PagesTest;

import Pages.AddUser;
import Utils.ExcelUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class AddUserTest {
    AddUser user = new AddUser();
    @BeforeTest
    public void openBrowser (){
        user.openBrowser();
    }
    @Test(dataProvider = "user")
    public void addUser (Map<String,String> map) {
        user.addUser(map);
    }

    @DataProvider(name = "user")
    public Iterator<Object[]> getexceldata () {
        return new ExcelUtils("新增用户");
    }
}
