package Configs;

import java.util.ResourceBundle;

public class SubmitBugConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("SubmitBugConfig");
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
    public static final String BUG = rb.getString("bug");                               //点击BUG
    public static final String S_BUG = rb.getString("s_bug");                           //点击提交BUG
    public static final String MOKUAI = rb.getString("mokuai");                         //点击所属模块
    public static final String S_LOGIN = rb.getString("s_login");                       //选择商品
    public static final String BANBEN = rb.getString("banben");                         //点击影响版本
    public static final String S_MAIN = rb.getString("s_main");                         //选择主干
    public static final String S_DEADLINE = rb.getString("s_deadline");                 //截止日期的输入框
    public static final String BUG_TYPE = rb.getString("bug_type");                     //选择Bug类型
    public static final String TESTSCRIPT = rb.getString("testscript");                 //选择为测试脚本
    public static final String O_S = rb.getString("o_s");                               //选择操作系统类型
    public static final String CHOOSEOS = rb.getString("chooseOS");                     //选择为Windows
    public static final String BROWSER = rb.getString("browser");                       //选择浏览器类型
    public static final String CHOOSEBROWSER = rb.getString("choosebrowser");           //选择浏览器类型为谷歌
    public static final String COLORPICKER = rb.getString("colorpicker");               //选择Bug标题的颜色
    public static final String COLOR = rb.getString("color");                           //选择Bug标题的颜色为紫色
    public static final String BUGTITLE = rb.getString("bugtitle");                     //Bug标题写为“界面不美观”
    public static final String YANZHONG = rb.getString("yanzhong");                     //选择严重程度
    public static final String S_YANZHONG = rb.getString("s_yanzhong");                 //选择严重程度为3
    public static final String YOUXIAN = rb.getString("youxian");                       //选择优先级
    public static final String S_YOUXIAN = rb.getString("s_youxian");                   //选择优先级为3
    public static final String IFRAME = rb.getString("iframe");                         //写重现步骤
    public static final String BODY = rb.getString("body");                             //输入bug内容
    public static final String GIVEMAN = rb.getString("giveman");                       //填写抄送给的人
    public static final String CHOOSEMAN = rb.getString("chooseman");                   //选择admin
    public static final String SUBMIT = rb.getString("submit");                         //点击提交


}
