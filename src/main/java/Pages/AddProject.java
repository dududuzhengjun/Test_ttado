package Pages;

import Configs.AddProjectConfig;
import Utils.ExcelUtils;
import Utils.Page;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AddProject {

    Page page = new Page(AddProjectConfig.DRIVERTYPE);

    public void before(){

        //输入禅道网址
        page.geturl(AddProjectConfig.URL);

        //点击开源版
        page.click(AddProjectConfig.KAIYUAN);

        //窗口最大化
        page.windowmax();

        //输入用户名
        page.sendKey(AddProjectConfig.USERNAMETEXT,AddProjectConfig.USERNAME);
        page.pause(AddProjectConfig.SLEEP);

        //输入密码
        page.sendKey(AddProjectConfig.PASSWORDTEXT, AddProjectConfig.PASSWORD);
        page.pause(AddProjectConfig.SLEEP);

        //点击保存登录状态
        page.click(AddProjectConfig.SAVELOGIN);
        page.pause(AddProjectConfig.SLEEP);

        //点击登录
        page.click(AddProjectConfig.LOGINZENTAO);
        page.pause(AddProjectConfig.SLEEP);
    }


    public void addProject(Map<String,String> map) {

        page.pause(AddProjectConfig.SLEEP);
        //点击项目
        page.click(AddProjectConfig.PROJECT);

        //点击添加项目
        page.click(AddProjectConfig.ADDPROJECT);

        //输入项目名称
        page.sendKey(AddProjectConfig.PROJECTNAME,map.get("项目名称"));

        //输入项目代号
        page.sendKey(AddProjectConfig.PROJECTCODE,map.get("项目代号"));

        //写入结束日期
        page.sendKey(AddProjectConfig.ENDDATE,map.get("结束日期"));

        //写入可用工作日
        page.sendKey(AddProjectConfig.JOBDATE,map.get("可用工作日"));

        //写入团队名称
        page.sendKey(AddProjectConfig.TEAMNAME,map.get("团队名称"));

        //选择项目类型
        page.click(AddProjectConfig.PROJECTTYPE);

        //选择为短期项目
        page.click(AddProjectConfig.SHORTPROJECT);

        //选择关联产品
        page.click(AddProjectConfig.PRODUCTS);

        //选择ecshop
        page.click(AddProjectConfig.ECSHOP);

        //进入项目描述的框架
        page.frame(AddProjectConfig.IFRAME);

        //写入项目描述内容
        page.sendKey(AddProjectConfig.BODY,map.get("项目描述"));
        page.exitframe();
        page.pause(AddProjectConfig.SLEEP);

        //选择访问控制
        page.JS(AddProjectConfig.JS);

        //点击保存
        page.submit(AddProjectConfig.SAVE);
        page.pause(AddProjectConfig.SLEEP);

        //点击关闭
        page.click(AddProjectConfig.CLOSE);

    }

}
