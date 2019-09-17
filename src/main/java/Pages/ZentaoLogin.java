package Pages;
import Configs.LoginConfig;
import Utils.Page;

public class ZentaoLogin {

    Page page = new Page(LoginConfig.DRIVERTYPE);
    public void before(){

        //输入禅道网址
        page.geturl(LoginConfig.URL);

        //点击开源版
        page.click(LoginConfig.KAIYUAN);

        //窗口最大化
        page.windowmax();

        //输入用户名
        page.sendKey(LoginConfig.USERNAMETEXT, LoginConfig.USERNAME);
        page.pause(LoginConfig.SLEEP);

        //输入密码
        page.sendKey(LoginConfig.PASSWORDTEXT, LoginConfig.PASSWORD);
        page.pause(LoginConfig.SLEEP);

        //点击保存登录状态
        page.click(LoginConfig.SAVELOGIN);
        page.pause(LoginConfig.SLEEP);

        //点击登录
        page.click(LoginConfig.LOGINZENTAO);
        page.pause(LoginConfig.SLEEP);
    }
}
