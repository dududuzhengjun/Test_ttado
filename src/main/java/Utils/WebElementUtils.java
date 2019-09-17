package Utils;

import Utils.WebElementFind;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebElementUtils extends WebElementFind {

    public WebElementUtils(){
        super();
    }

    public WebElementUtils(int driverType) {
        super(driverType);
    }

    //模拟用户点击
    public void click (String xpath){
        xPath(xpath).click();
    }

    //模拟用户输入
    public void sendKey (String xpath,String text){
        xPath(xpath).sendKeys(text);
    }

    //进入框架
    public void frame (String xpath){
        driver.switchTo().frame(xPath(xpath));
    }

    //退出框架
    public void exitframe (){
        driver.switchTo().defaultContent();
    }

    //
    public void JS(String js){
        JavascriptExecutor jjs = (JavascriptExecutor) driver;
        jjs.executeScript(js);
    }

    //清除文字
    public void clear(String xpath){
        xPath(xpath).clear();
    }

    //点击提交
    public void submit(String xpath){
        xPath(xpath).submit();
    }


}
