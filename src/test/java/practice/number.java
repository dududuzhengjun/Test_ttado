package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class number {
    public static void main(String[] args) {
        float a = (float) 0.1;
        float b = (float) 0.2;
        float c = a+b;
        System.out.println(c);
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.baidu.com");
    }
}
