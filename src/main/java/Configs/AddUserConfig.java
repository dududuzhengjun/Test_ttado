package Configs;

import java.util.ResourceBundle;

public class AddUserConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("AddUserConfig");
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
    public static final String ORGANIZE = rb.getString("organize");                     //点击组织
    public static final String ADD_USER = rb.getString("add_user");                     //点击添加用户
    public static final String USERNAME1 = rb.getString("username1");                   //输入用户名
    public static final String REALNAME = rb.getString("realname");                     //输入真实姓名
    public static final String PASSWORD1 = rb.getString("password1");                   //输入密码
    public static final String PASSWORD2 = rb.getString("password2");                   //重复输入密码
    public static final String DATE = rb.getString("date");                             //输入入职日期
    public static final String JOB = rb.getString("job");                               //点击职位
    public static final String S_JOB = rb.getString("s_job");                           //选择职位
    public static final String EMAIL = rb.getString("email");                           //输入邮箱
    public static final String JS = rb.getString("js");                                 //选择性别
    public static final String PWD = rb.getString("pwd");                               //输入登录密码
    public static final String SUBMIT = rb.getString("submit");                         //点击保存

}
