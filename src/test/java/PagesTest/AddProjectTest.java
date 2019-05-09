package PagesTest;

import Pages.AddProject;
import Utils.ExcelUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class AddProjectTest {
    AddProject addproject = new AddProject();
    @BeforeTest
    public void addProject1 () {
        addproject.before();
    }

    @Test(dataProvider = "project")
    public void addProject2 (Map<String,String> map) {
        addproject.addProject(map);
    }

    @DataProvider(name = "project")
    public Iterator<Object[]> getexceldata () {
        return new ExcelUtils("添加项目");
    }
}
