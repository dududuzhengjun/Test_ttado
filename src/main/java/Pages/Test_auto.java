package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

public class Test_auto {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qunar.com/");
//        //获取当前窗口句柄
//        String handle = driver.getWindowHandle();
//        System.out.println(handle);
//        //到达城市写为上海
//        WebElement daoda = driver.findElement(By.xpath(".//input[@name='toCity']"));
//        daoda.sendKeys("上海");
//        Thread.sleep(300);
//        //点击立即搜索
//        WebElement sousuo = driver.findElement(By.xpath(".//button[@class='button-search']"));
//        sousuo.click();
//        Thread.sleep(1000);
//        //点击第一个海南航空
//        WebElement num1 = driver.findElement(By.xpath(".//div[@class='e-airfly' and @data-reactid='.1.2.3.2.0.$HU7487.0']"));
//        num1.click();
//        Thread.sleep(500);
//        //点击第一个预定
//        WebElement yuding = driver.findElement(By.xpath(".//button[@data-reactid='.1.2.3.2.0.$HU7487.1.$HU7487.1:$wrapper-content.0.3:$items-container.$ota-list-item-00.0.2.0']"));
//        yuding.click();
//        Thread.sleep(300);
//        //获取当前页的句柄
//        String abc = driver.getWindowHandle();
//        System.out.println(abc);
//        //switchTo()切换，回到之前的窗口
//        driver.switchTo().window(handle);
//        //关闭当前窗口
//        driver.close();
//
//
//        //获取所有窗口的句柄
//        Set<String> handles = driver.getWindowHandles();
//        System.out.println(handles);
//        Thread.sleep(300);
//        //通过句柄跳转窗口
//        for(String h:handles){
//            if(!h.equals(handle)){
//                driver.switchTo().window(h);
//                break;
//            }
//        }
//
//
//        WebElement name = driver.findElement(By.xpath(".//input[@class='js-passenger-name']"));
//        name.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].data-placeholder=\"杜征骏\"", name);




//        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));//定义时区，可以避免虚拟机时间与系统时间不一致的问题
//        System.out.println(new Date(System.currentTimeMillis()));//方法一：默认方式输出现在时间
//
//        Date nowTime = new Date();
//        System.out.println(nowTime);//方法二：Date方式，输出现在时间
//
//        SimpleDateFormat matter = new SimpleDateFormat("现在时间:yyyy年MM月dd日E HH时mm分ss秒");
//        System.out.println(matter.format(nowTime));//方法三：SimpleDateFormat方式，完整输出现在时间


    }
}
