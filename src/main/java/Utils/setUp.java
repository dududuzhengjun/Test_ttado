package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class setUp {
    WebDriver driver;

    public setUp(){

    }
    public setUp(int driverType){
        chooseBrowser(driverType);
    }


    public void chooseBrowser(int driverType){
        switch (driverType){
            case 1:setUpChrome();
            break;
            case 2:setUpFirefox();
            break;
            case 3:setUpIE();
            break;
        }
    }

    public WebDriver setUpChrome(){
        System.out.println("正在启动谷歌浏览器");
        System.setProperty("webdriver.chrome.driver", "webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("启动谷歌浏览器成功");
        return driver;
    }

    public WebDriver setUpFirefox(){
        System.out.println("正在启动火狐浏览器");
        System.setProperty("webdriver.gecko.driver","webdriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        System.out.println("启动火狐浏览器成功");
        return driver;
    }

    public WebDriver setUpIE(){
        System.out.println("正在启动IE浏览器");
        System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
        driver = new InternetExplorerDriver();
        System.out.println("启动IE浏览器成功");
        return driver;
    }

/*    public static void getUrl(String url){
        driver.get(url);
    }

    public static void windowMax(){
        driver.manage().window().maximize();
    }

    public static WebElement xpath(String by){
        return driver.findElement(By.xpath(by));
    }

    public static void quit(){
        driver.quit();
    }

    public static void close(){
        driver.close();
    }

    public static void click(String by){
        xpath(by).click();
    }
    public static void input(String by ,String value){
        xpath(by).sendKeys(value);

    }

    public static void inputClear(String by ,String value){
        WebElement zz=xpath(by);
        zz.clear();
        zz.sendKeys(value);
    }

    public static void inputEnter(String by,String value){
        WebElement is=xpath(by);
        is.sendKeys(value);
        is.sendKeys(Keys.ENTER);
    }

    public static void select(String by,String value){
        Select select =new Select(xpath(by));
        select.selectByValue(value);
    }

    public static void refresh(){
        driver.navigate().refresh();
    }
    public static void kill(String name){
        WindowsUtils.killByName(name);

    }

    public static void hide (){
        //隐式等待
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    public static void windows(int i){
        //封装切换窗口句柄
        Set<String> WinHandels =driver.getWindowHandles();//得到当前窗口的set集合
        List<String> it=new ArrayList<String>(WinHandels);//将set集合存入list对象
        driver.switchTo().window(it.get(i));//  i=1 切换到弹出的新窗口
    }

    public static void iframe (String by_id){
        WebElement value=xpath(by_id);
        driver.switchTo().frame(value);
    }

    public static void iframeout (){
        driver.switchTo().defaultContent();
    }

    public static void hover(String by){
        //封装鼠标悬浮
        Actions action=new Actions(driver);
        action.clickAndHold(xpath(by));
    }

    public static void actionClick(String by){
        //封装鼠标点击
        WebElement element=xpath(by);
        Actions Builder=new Actions(driver);
        Action mouser= Builder.moveToElement(element).click().build();
        mouser.perform();
    }
    public static void doubleClick(String by){
        //封装鼠标双击
        Actions actions=new Actions(driver);
        actions.doubleClick(xpath(by));
    }

    public static void clickJs(String by){
        //封装使用JS点击
        WebElement element=xpath(by);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);
    }

    public static String randomString(int length){
        //封装随机生成数字

        String str="0123456789";//含有数字的字符串
        Random random=new Random();//随机初始化
        StringBuilder sb=new StringBuilder();//StringBuffer类生成，为了拼接字符串
        for(int i=0;i<length;++i){
            int number =random.nextInt(10);//[0,10)
            sb.append(str.charAt(number));
        }
        return sb.toString();

    }

    public static String randomEnglish(int length){
        //封装随机生成英文字母

        String str="ABCDEFGHIJKLMNOPQRSTUVWSYZ";//含有英文的字符串
        Random random=new Random();//随机初始化
        StringBuilder sb=new StringBuilder();//StringBuffer类生成，为了拼接字符串
        for(int i=0;i<length;++i){
            int number =random.nextInt(26);//[0,26)
            sb.append(str.charAt(number));
        }
        return sb.toString();

    }
    public static void sumbit(String by){
        xpath(by).submit();
    }*/





}
