package Pages;

import Configs.AddNeedConfig;
import Utils.ExcelUtils;
import Utils.Page;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class AddNeed {

    Page page = new Page(AddNeedConfig.DRIVERTYPE);

    public void openBrowser(){

        //输入禅道网址
        page.geturl(AddNeedConfig.URL);

        //点击开源版
        page.click(AddNeedConfig.KAIYUAN);

        //窗口最大化
        page.windowmax();

        //输入用户名
        page.sendKey(AddNeedConfig.USERNAMETEXT, AddNeedConfig.USERNAME);
        page.pause(AddNeedConfig.SLEEP);

        //输入密码
        page.sendKey(AddNeedConfig.PASSWORDTEXT, AddNeedConfig.PASSWORD);
        page.pause(AddNeedConfig.SLEEP);

        //点击保存登录状态
        page.click(AddNeedConfig.SAVELOGIN);
        page.pause(AddNeedConfig.SLEEP);

        //点击登录
        page.click(AddNeedConfig.LOGINZENTAO);
        page.pause(AddNeedConfig.SLEEP);
    }

    public void addProduct (Map<String,String> map) {

        //点击产品
        page.click(AddNeedConfig.PRODUCT);

        //点击需求
        page.click(AddNeedConfig.NEED1);

        //提需求
        page.click(AddNeedConfig.NEED2);

        //所属产品
        page.click(AddNeedConfig.SSCP);

        //所属产品—ecshop
        page.click(AddNeedConfig.SSCP1);

        //所属模块
        page.pause(AddNeedConfig.SLEEP);
        page.click(AddNeedConfig.MODULE);

        //所属模块—商品
        page.click(AddNeedConfig.SHOP);

        // 需求来源
        page.click(AddNeedConfig.FROM);

        //需求来源—产品经理
        page.pause(AddNeedConfig.SLEEP);
        page.click(AddNeedConfig.FROM1);

        //来源备注
        page.sendKey(AddNeedConfig.BEIZHU,map.get("备注"));

        //由谁来评审—需要评审
        page.pause(AddNeedConfig.SLEEP);
        page.click(AddNeedConfig.NEEDPS);

        //由谁来评审—谁评审
        page.click(AddNeedConfig.WHO);

        //由谁来评审—admin评审
        page.pause(AddNeedConfig.SLEEP);
        page.click(AddNeedConfig.WHO1);

        //需求名称
        page.sendKey(AddNeedConfig.NAME,map.get("需求名称"));

        //优先级
        page.click(AddNeedConfig.YXJ);

        //优先级—一级
        page.click(AddNeedConfig.YXJ1);

        //需求描述
        page.frame(AddNeedConfig.IFRAME);
        page.clear(AddNeedConfig.CONTEND);
        page.sendKey(AddNeedConfig.CONTEND,map.get("需求描述"));
        page.exitframe();

        /*//验收标准
        page.click(AddNeedConfig.IFRAME);
        WebElement iframe3 =  driver.findElement(By.xpath("//form[@id='dataform']//tr[6]//iframe[@class='ke-edit-iframe']"));
        Actions actions = new Actions(driver);
        actions.sendKeys(map.get("验收标准")).perform();
        driver.switchTo().defaultContent();*/

        //点击保存
        page.submit(AddNeedConfig.SAVE);

    }


}
