package Pages;

import Configs.AddUserConfig;
import Utils.ExcelUtils;
import Utils.Page;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Iterator;
import java.util.Map;


public class AddUser {

    Page page = new Page(AddUserConfig.DRIVERTYPE);

    public void openBrowser(){

        //输入禅道网址
        page.geturl(AddUserConfig.URL);

        //点击开源版
        page.click(AddUserConfig.KAIYUAN);

        //窗口最大化
        page.windowmax();

        //输入用户名
        page.sendKey(AddUserConfig.USERNAMETEXT,AddUserConfig.USERNAME);
        page.pause(AddUserConfig.SLEEP);

        //输入密码
        page.sendKey(AddUserConfig.PASSWORDTEXT, AddUserConfig.PASSWORD);
        page.pause(AddUserConfig.SLEEP);

        //点击保存登录状态
        page.click(AddUserConfig.SAVELOGIN);
        page.pause(AddUserConfig.SLEEP);

        //点击登录
        page.click(AddUserConfig.LOGINZENTAO);
        page.pause(AddUserConfig.SLEEP);
    }

    public void addUser(Map<String,String> map){

        //点击组织
        page.click(AddUserConfig.ORGANIZE);
        page.pause(AddUserConfig.SLEEP);

        //点击添加用户
        page.click(AddUserConfig.ADD_USER);
        page.pause(AddUserConfig.SLEEP);

        //输入用户名
        page.sendKey(AddUserConfig.USERNAME1,map.get("用户名"));
        page.pause(AddUserConfig.SLEEP);

        //输入真实姓名
        page.sendKey(AddUserConfig.REALNAME,map.get("真实姓名"));
        page.pause(AddUserConfig.SLEEP);

        //输入密码
        page.sendKey(AddUserConfig.PASSWORD1,map.get("密码"));
        page.pause(AddUserConfig.SLEEP);

        //重复输入密码
        page.sendKey(AddUserConfig.PASSWORD2,map.get("重复密码"));
        page.pause(AddUserConfig.SLEEP);

        //输入入职日期
        page.clear(AddUserConfig.DATE);
        page.sendKey(AddUserConfig.DATE,map.get("入职日期"));
        page.click(AddUserConfig.DATE);
        page.pause(AddUserConfig.SLEEP);

        //点击职位
        page.click(AddUserConfig.JOB);
        page.pause(AddUserConfig.SLEEP);

        //选择职位
        page.click(AddUserConfig.S_JOB);
        page.pause(AddUserConfig.SLEEP);

        //输入邮箱
        page.sendKey(AddUserConfig.EMAIL,map.get("邮箱"));
        page.pause(AddUserConfig.SLEEP);

        //选择性别
        page.JS(AddUserConfig.JS);
        page.pause(AddUserConfig.SLEEP);
//        WebElement sex=driver.findElement(By.xpath("//input[@value='f']"));
//        Actions a=new Actions(driver);
//        a.click(sex).perform();

        //输入登录密码
        page.sendKey(AddUserConfig.PWD,map.get("登录密码"));
        page.pause(AddUserConfig.SLEEP);

        //点击保存
        page.submit(AddUserConfig.SUBMIT);
        page.pause(AddUserConfig.SLEEP);

    }


}
