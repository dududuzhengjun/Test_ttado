/*
package Pages;

import Configs.WebdriverConfig;
import Utils.setUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Addplan {

    WebDriver driver;

    @BeforeTest
    public void before() throws InterruptedException {
        setUp setup = new setUp(WebdriverConfig.DRIVERTYPE);
//        driver = setup.driver;
        driver.get("http://127.0.0.1/index.php");

        //点击开源版
        WebElement kaiyuan = driver.findElement(By.id("zentao"));
        kaiyuan.click();
        Thread.sleep(500);

        //输入用户名
        WebElement user = driver.findElement(By.id("account"));
        user.sendKeys("admin");
        Thread.sleep(300);

        //输入密码
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123456");
        Thread.sleep(300);

        //点击保存登录状态
        WebElement keep = driver.findElement(By.id("keepLoginon"));
        keep.click();
        Thread.sleep(300);

        //点击登录
        WebElement login = driver.findElement(By.id("submit"));
        login.click();
        Thread.sleep(300);

        //窗口最大化
        driver.manage().window().maximize();
    }

    @Test
    public void addplan(){
        //点击产品
        WebElement product = driver.findElement(By.xpath("//a[@href='/zentao/product/']"));
        product.click();

        //点击产品下的计划
        WebElement plan = driver.findElement(By.xpath("//a[@href='/zentao/productplan-browse-1.html']"));
        plan.click();

        //点击创建计划
        WebElement createplan = driver.findElement(By.xpath("//a[@href='/zentao/productplan-create-1-0.html']"));
        createplan.click();

        //写入计划名称
        WebElement planname = driver.findElement(By.xpath("//input[@id='title']"));
        planname.sendKeys("海棠计划");

        //写入开始日期
        WebElement startdate = driver.findElement(By.xpath("//input[@id='begin']"));
        startdate.sendKeys("2018-06-06");

        //写入结束日期
        WebElement enddate = driver.findElement(By.xpath("//input[@id='end']"));
        enddate.sendKeys("2018-06-10");

        //写入计划描述
        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class='ke-edit-iframe']"));
        driver.switchTo().frame(iframe1);
        WebElement body1 = driver.findElement(By.xpath("//body[@class='article-content']"));
        body1.sendKeys("这个计划真不错");
        driver.switchTo().defaultContent();

        //点击保存
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

    }

}
*/
