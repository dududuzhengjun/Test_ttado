package Configs;

import java.util.ResourceBundle;

/**
 * @ Motto：No pains, no gains！
 * @ Project：Test_ttado
 * @ Author：duzhengjun
 * @ dateTime：2019/9/25 2:20 下午
 */
public class ApplicationManagementConfig {
    public static final ResourceBundle rb = ResourceBundle.getBundle("ApplicationManagementConfig");
    public static final int DRIVERTYPE = Integer.parseInt(rb.getString("driverType"));  //浏览器类型
    public static final long SLEEP = Long.parseLong(rb.getString("sleep"));             //休眠时间
    public static final String URL =rb.getString("url");                                //输入网址
    public static final String KAIYUAN =rb.getString("kaiYuan");                        //开源版
}
