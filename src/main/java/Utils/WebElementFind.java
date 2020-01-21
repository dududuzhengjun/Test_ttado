package Utils;

import Utils.setUpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementFind extends setUpUtils {
    public WebElementFind(){
        super();
    }

    public WebElementFind(int driverType) {
        super(driverType);
    }

    public WebElement xPath(String Element){
        WebElement element=driver.findElement(By.xpath(Element));
        if(element==null){
            System.out.println("为空");
        }
        return element;
    }

    public WebElement id(String Element){
        return driver.findElement(By.id(Element));
    }

    public WebElement className (String Element){
        return driver.findElement(By.className(Element));
    }

    public WebElement cssSelector (String Element){
        return driver.findElement(By.cssSelector(Element));
    }

    public WebElement name (String Element){
        return driver.findElement(By.name(Element));
    }

    public WebElement linkText (String Element){
        return driver.findElement(By.linkText(Element));
    }

    public WebElement tagName (String Element){
        return driver.findElement(By.tagName(Element));
    }

    public WebElement partialLinkText (String Element){
        return driver.findElement(By.partialLinkText(Element));
    }

}
