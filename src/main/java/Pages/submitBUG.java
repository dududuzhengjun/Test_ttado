package Pages;
import Configs.SubmitBugConfig;
import Utils.ExcelUtils;
import Utils.Page;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Map;

public class submitBUG {

    Page page = new Page(SubmitBugConfig.DRIVERTYPE);
    public void before(){

        //输入禅道网址
        page.geturl(SubmitBugConfig.URL);

        //点击开源版
        page.click(SubmitBugConfig.KAIYUAN);

        //窗口最大化
        page.windowmax();

        //输入用户名
        page.sendKey(SubmitBugConfig.USERNAMETEXT, SubmitBugConfig.USERNAME);
        page.pause(SubmitBugConfig.SLEEP);

        //输入密码
        page.sendKey(SubmitBugConfig.PASSWORDTEXT, SubmitBugConfig.PASSWORD);
        page.pause(SubmitBugConfig.SLEEP);

        //点击保存登录状态
        page.click(SubmitBugConfig.SAVELOGIN);
        page.pause(SubmitBugConfig.SLEEP);

        //点击登录
        page.click(SubmitBugConfig.LOGINZENTAO);
        page.pause(SubmitBugConfig.SLEEP);
    }


    public void submitbug(Map<String,String> map){

        //点击测试
        page.click(SubmitBugConfig.TEST);

        page.pause(SubmitBugConfig.SLEEP);
        //点击Bug
        page.click(SubmitBugConfig.BUG);

        //点击提交Bug
        page.click(SubmitBugConfig.S_BUG);

        //点击所属模块
        page.click(SubmitBugConfig.MOKUAI);

        //选择商品
        page.click(SubmitBugConfig.S_LOGIN);

        //点击影响版本
        page.click(SubmitBugConfig.BANBEN);

        //选择主干
        page.click(SubmitBugConfig.S_MAIN);

        //截止日期的输入框
        page.click(SubmitBugConfig.S_DEADLINE);
        page.pause(SubmitBugConfig.SLEEP);

        //选择Bug类型
        page.click(SubmitBugConfig.BUG_TYPE);
        page.pause(SubmitBugConfig.SLEEP);

        //选择为测试脚本
        page.click(SubmitBugConfig.TESTSCRIPT);

        //选择操作系统类型
        page.click(SubmitBugConfig.O_S);

        //选择为Windows
        page.click(SubmitBugConfig.CHOOSEOS);

        //选择浏览器类型
        page.click(SubmitBugConfig.BROWSER);

        //选择浏览器类型为谷歌
        page.click(SubmitBugConfig.CHOOSEBROWSER);

        //选择Bug标题的颜色
        page.click(SubmitBugConfig.COLORPICKER);

        //选择Bug标题的颜色为紫色
        page.click(SubmitBugConfig.COLOR);

        //Bug标题写为“界面不美观”
        page.sendKey(SubmitBugConfig.BUGTITLE,map.get("Bug标题"));

        //选择严重程度
        page.click(SubmitBugConfig.YANZHONG);
        page.pause(SubmitBugConfig.SLEEP);

        //选择严重程度为3
        page.click(SubmitBugConfig.S_YANZHONG);
        page.pause(SubmitBugConfig.SLEEP);

        //选择优先级
        page.click(SubmitBugConfig.YOUXIAN);

        //选择优先级为3
        page.click(SubmitBugConfig.S_YOUXIAN);

        //写重现步骤
        page.frame(SubmitBugConfig.IFRAME);

        //输入bug内容
        page.clear(SubmitBugConfig.BODY);
        page.sendKey(SubmitBugConfig.BODY,map.get("bug内容"));
        page.exitframe();

        //填写抄送给的人
        page.sendKey(SubmitBugConfig.GIVEMAN,SubmitBugConfig.CHOOSEMAN);

        //点击保存
        page.submit(SubmitBugConfig.SUBMIT);
    }



}




