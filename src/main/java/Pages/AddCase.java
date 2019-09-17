package Pages;
import Configs.AddCaseConfig;
import Utils.ExcelUtils;
import Utils.Page;
import org.apache.log4j.Logger;
import java.util.Map;

public class AddCase {
    Logger logger = Logger.getLogger(AddCase.class);
    Page page = new Page(AddCaseConfig.DRIVERTYPE);

    public void openBrowser(){

        //输入禅道网址
        page.geturl(AddCaseConfig.URL);

        //点击开源版
        page.click(AddCaseConfig.KAIYUAN);

        //窗口最大化
        page.windowmax();

        //输入用户名
        page.sendKey(AddCaseConfig.USERNAMETEXT,AddCaseConfig.USERNAME);
        page.pause(AddCaseConfig.SLEEP);

        //输入密码
        page.sendKey(AddCaseConfig.PASSWORDTEXT, AddCaseConfig.PASSWORD);
        page.pause(AddCaseConfig.SLEEP);

        //点击保存登录状态
        page.click(AddCaseConfig.SAVELOGIN);
        page.pause(AddCaseConfig.SLEEP);

        //点击登录
        page.click(AddCaseConfig.LOGINZENTAO);
        page.pause(AddCaseConfig.SLEEP);
    }


    public void addCase(Map<String,String> map){

        //点击测试
        page.pause(AddCaseConfig.SLEEP);
        page.pause(AddCaseConfig.SLEEP);
        page.click(AddCaseConfig.TEST);
        page.pause(AddCaseConfig.SLEEP);

        //点击用例
        page.click(AddCaseConfig.TESTCASE);
        page.pause(AddCaseConfig.SLEEP);

        //点击建用例
        page.click(AddCaseConfig.BUILDCASE);

        //点击所属模块
        page.click(AddCaseConfig.MOKUAI);

        //选择商品
        page.click(AddCaseConfig.CHOOSEMODULE);

        //选择用例类型
        page.click(AddCaseConfig.CHOOSECASE);

        //选择功能测试
        page.click(AddCaseConfig.FUNCTION1);

        //选择适用阶段
        page.click(AddCaseConfig.USE);

        //选择功能测试阶段
        page.click(AddCaseConfig.FUNCTION2);

        //点击相关需求
        page.click(AddCaseConfig.LINKNEED);

        //选择ecshop
        page.click(AddCaseConfig.ECSHOP);

        //选择用例标题颜色
        page.click(AddCaseConfig.TITLECOLOR);

        //选择紫色
        page.click(AddCaseConfig.COLOR);
        page.pause(AddCaseConfig.SLEEP);

        //输入用例标题
        page.sendKey(AddCaseConfig.CASETITLE,map.get("用例标题"));

        //选择优先级
        page.click(AddCaseConfig.FIRST);

        //选择优先级为1
        page.click(AddCaseConfig.ONE);

        //输入前置条件
        page.sendKey(AddCaseConfig.PRECONDITION,map.get("前置条件"));

        //输入用例步骤1
        page.sendKey(AddCaseConfig.STEP1,map.get("用例步骤1"));
        page.pause(AddCaseConfig.SLEEP);

        //输入用例步骤2
        page.sendKey(AddCaseConfig.STEP2,map.get("用例步骤2"));

        //输入用例步骤3
        page.sendKey(AddCaseConfig.STEP3,map.get("用例步骤3"));

        //输入预期结果1
        page.sendKey(AddCaseConfig.EXPECT1,map.get("预期结果1"));

        //输入预期结果2
        page.sendKey(AddCaseConfig.EXPECT2,map.get("预期结果2"));

        //输入预期结果3
        page.sendKey(AddCaseConfig.EXPECT3,map.get("预期结果3"));

        //输入关键词
        page.sendKey(AddCaseConfig.KEYWORDS,map.get("关键词"));

        //点击保存
        page.submit(AddCaseConfig.SAVE);
        page.refresh();

    }





}
