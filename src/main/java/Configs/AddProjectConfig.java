package Configs;

import java.util.ResourceBundle;

public class AddProjectConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("AddProjectConfig");
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
    public static final String PROJECT = rb.getString("project");                       //点击项目
    public static final String ADDPROJECT = rb.getString("addproject");                 //点击添加项目
    public static final String PROJECTNAME = rb.getString("projectname");               //输入项目名称
    public static final String PROJECTCODE = rb.getString("projectcode");               //输入项目代号
    public static final String ENDDATE = rb.getString("enddate");                       //写入结束日期
    public static final String JOBDATE = rb.getString("jobdate");                       //写入可用工作日
    public static final String TEAMNAME = rb.getString("teamname");                     //写入团队名称
    public static final String PROJECTTYPE = rb.getString("projecttype");               //选择项目类型
    public static final String SHORTPROJECT = rb.getString("shortproject");             //选择为短期项目
    public static final String PRODUCTS = rb.getString("products");                     //选择关联产品
    public static final String ECSHOP = rb.getString("ecshop");                         //选择ecshop
    public static final String IFRAME = rb.getString("iframe");                         //进入项目描述的框架
    public static final String BODY = rb.getString("body");                             //写入项目描述内容
    public static final String JS = rb.getString("js");                                 //选择访问控制
    public static final String SAVE = rb.getString("save");                             //点击保存
    public static final String CLOSE = rb.getString("close");                           //点击关闭

}
