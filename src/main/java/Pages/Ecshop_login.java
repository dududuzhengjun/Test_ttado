package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ecshop_login {
    WebDriver driver;

    @BeforeSuite
    public void login1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://192.168.3.141/ecshop/");

        Thread.sleep(500);

    }

    @BeforeTest(enabled = false)
    public void login2() throws InterruptedException {

        //点击注册
        WebElement register = driver.findElement(By.xpath("//img[@src='themes/default/images/bnt_reg.gif']"));
        register.click();

        //输入用户名
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("admin130");

        //输入email
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("12345688@163.com");

        //输入密码
        WebElement password1 = driver.findElement(By.xpath("//input[@id='password1']"));
        password1.sendKeys("123456");

        //确认密码
        WebElement password2 = driver.findElement(By.xpath("//input[@id='conform_password']"));
        password2.sendKeys("123456");

        //输入MSN
        WebElement msn = driver.findElement(By.xpath("//input[@name='extend_field1']"));
        msn.sendKeys("123456789");

        //输入QQ
        WebElement qq = driver.findElement(By.xpath("//input[@name='extend_field2']"));
        qq.sendKeys("123456789");

        //输入办公电话
        WebElement workphone = driver.findElement(By.xpath("//input[@name='extend_field3']"));
        workphone.sendKeys("123456789");

        //输入家庭电话
        WebElement homephone = driver.findElement(By.xpath("//input[@name='extend_field4']"));
        homephone.sendKeys("123456789");

        //输入手机
        WebElement phone = driver.findElement(By.xpath("//input[@name='extend_field5']"));
        phone.sendKeys("123456789");

        //点击密码提示问题
        WebElement question = driver.findElement(By.xpath("//select[@name='sel_question']"));
        question.click();

        //选择我的座右铭
        WebElement choosequestion = driver.findElement(By.xpath("//option[@value='motto']"));
        choosequestion.click();

        //写入答案
        WebElement answer = driver.findElement(By.xpath("//input[@name='passwd_answer']"));
        answer.sendKeys("123456");

        //点击立即注册
        WebElement submit = driver.findElement(By.xpath("//input[@class='us_Submit_reg']"));
        submit.click();

        //点击弹窗确定
        Alert alter1=driver.switchTo().alert();
        System.out.println(alter1.getText());
        alter1.accept();


        //点击退出
        WebElement exit = driver.findElement(By.xpath("//a[@href='user.php?act=logout']"));
        exit.click();

    }

    @Test
    public void login3() throws InterruptedException {
        //点击登录
        WebElement login = driver.findElement(By.xpath("//img[@src='themes/default/images/bnt_log.gif']"));
        login.click();

        //输入用户名
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("admin130");

        //输入密码
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("123456");

        //点击立即登录
        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();

        Thread.sleep(4000);

        //点击ABC
        WebElement abc = driver.findElement(By.xpath("//img[@src='images/201804/thumb_img/2_thumb_G_1524713252423.jpg']"));
        abc.click();

        //点击加入购物车
        WebElement shopcar = driver.findElement(By.xpath("//img[@src='themes/default/images/bnt_cat.gif']"));
        shopcar.click();

        Thread.sleep(2000);

        //点击结算中心
        WebElement center = driver.findElement(By.xpath("//img[@src='themes/default/images/checkout.gif']"));
        center.click();

        //选择省份
        WebElement shengfen = driver.findElement(By.xpath("//select[@id='selProvinces_0']"));
        shengfen.click();

        //选择省份湖南
        WebElement hunan = driver.findElement(By.xpath("//option[contains(text(),'湖南')]"));
        hunan.click();

        //选择城市
        WebElement city = driver.findElement(By.xpath("//select[@id='selCities_0']"));
        city.click();

        //选择长沙
        WebElement changsha = driver.findElement(By.xpath("//option[@value='197']"));
        changsha.click();

        Thread.sleep(500);

        //选择区
        WebElement qu = driver.findElement(By.xpath("//select[@id='selDistricts_0']"));
        qu.click();

        //选择岳麓区
        WebElement yuelu = driver.findElement(By.xpath("//option[@value='1647']"));
        yuelu.click();

        //写入收货人姓名
        WebElement shopname = driver.findElement(By.xpath("//input[@id='consignee_0']"));
        shopname.sendKeys("张三");

        //写入详细地址
        WebElement address = driver.findElement(By.xpath("//input[@id='address_0']"));
        address.sendKeys("达美中心");

        //写入邮政编码
        WebElement zipcode = driver.findElement(By.xpath("//input[@id='zipcode_0']"));
        zipcode.sendKeys("123456");

        //写入电话
        WebElement phone = driver.findElement(By.xpath("//input[@id='tel_0']"));
        phone.sendKeys("2132121232");

        //点击配送至这个地址
        WebElement address1 = driver.findElement(By.xpath("//input[@name='Submit']"));
        address1.click();










    }
}
