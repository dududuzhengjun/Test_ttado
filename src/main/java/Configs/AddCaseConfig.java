package Configs;

import java.util.ResourceBundle;

public class AddCaseConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("AddCaseConfig");
    public static final int DRIVERTYPE = Integer.parseInt(rb.getString("driverType"));  //浏览器类型
    public static final long SLEEP = Long.parseLong(rb.getString("sleep"));             //休眠时间
    public static final String URL =rb.getString("url");                                //输入网址
    public static final String KAIYUAN =rb.getString("kaiYuan");                        //开源版
    public static final String USERNAMETEXT = rb.getString("userNameText");             //定位用户名输入框
    public static final String USERNAME =rb.getString("userName");                      //输入用户名
    public static final String PASSWORDTEXT = rb.getString("passWordText");             //定位密码输入框
    public static final String PASSWORD = rb.getString("passWord");                     //输入密码
    public static final String SAVELOGIN = rb.getString("saveLogin");                   //保存登录状态
    public static final String LOGINZENTAO = rb.getString("loginZentao");               //点击登录
    public static final String TEST = rb.getString("test");                             //点击测试
    public static final String TESTCASE = rb.getString("testcase");                     //点击用例
    public static final String BUILDCASE = rb.getString("buildcase");                   //点击建用例
    public static final String MOKUAI = rb.getString("mokuai");                         //点击所属模块
    public static final String CHOOSEMODULE = rb.getString("choosemodule");             //选择商品
    public static final String CHOOSECASE = rb.getString("choosecase");                 //选择用例类型
    public static final String FUNCTION1 = rb.getString("function1");                   //选择功能测试
    public static final String USE = rb.getString("use");                               //选择适用阶段
    public static final String FUNCTION2 = rb.getString("function2");                   //选择功能测试阶段
    public static final String LINKNEED = rb.getString("linkneed");                     //点击相关需求
    public static final String ECSHOP = rb.getString("ecshop");                         //选择ecshop
    public static final String TITLECOLOR = rb.getString("titlecolor");                 //选择用例标题颜色
    public static final String COLOR = rb.getString("color");                           //选择紫色
    public static final String CASETITLE = rb.getString("casetitle");                   //输入用例标题
    public static final String FIRST = rb.getString("first");                           //选择优先级
    public static final String ONE = rb.getString("one");                               //选择优先级为1
    public static final String PRECONDITION = rb.getString("precondition");             //输入前置条件
    public static final String STEP1 = rb.getString("step1");                           //输入用例步骤1
    public static final String STEP2 = rb.getString("step2");                           //输入用例步骤2
    public static final String STEP3 = rb.getString("step3");                           //输入用例步骤3
    public static final String EXPECT1 = rb.getString("expect1");                       //输入预期结果1
    public static final String EXPECT2 = rb.getString("expect2");                       //输入预期结果2
    public static final String EXPECT3 = rb.getString("expect3");                       //输入预期结果3
    public static final String KEYWORDS = rb.getString("keywords");                     //输入关键词
    public static final String SAVE = rb.getString("save");                             //点击保存


}
