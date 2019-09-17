package Configs;

import java.util.ResourceBundle;

public class AddNeedConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("AddNeedConfig");
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
    public static final String PRODUCT = rb.getString("product");                       //点击产品
    public static final String NEED1 = rb.getString("need1");                           //点击需求
    public static final String NEED2 = rb.getString("need2");                           //提需求
    public static final String SSCP = rb.getString("sscp");                             //所属产品
    public static final String SSCP1 = rb.getString("sscp1");                           //所属产品—ecshop
    public static final String MODULE = rb.getString("module");                         //所属模块
    public static final String SHOP = rb.getString("shop");                             //所属模块—商品
    public static final String FROM = rb.getString("from");                             //需求来源
    public static final String FROM1 = rb.getString("from1");                           //需求来源—产品经理
    public static final String BEIZHU = rb.getString("beizhu");                         //来源备注
    public static final String NEEDPS = rb.getString("needps");                         //由谁来评审—需要评审
    public static final String WHO = rb.getString("who");                               //由谁来评审—谁评审
    public static final String WHO1 = rb.getString("who1");                             //由谁来评审—admin评审
    public static final String NAME = rb.getString("name");                             //需求名称
    public static final String YXJ = rb.getString("yxj");                               //优先级
    public static final String YXJ1 = rb.getString("yxj1");                             //优先级—一级
    public static final String IFRAME = rb.getString("iframe");                         //需求描述
    public static final String CONTEND = rb.getString("contend");                       //需求描述
/*
    public static final String IFRAME1 = rb.getString("iframe1");                            //验收标准
*/
    public static final String SAVE = rb.getString("save");                             //点击保存






}
