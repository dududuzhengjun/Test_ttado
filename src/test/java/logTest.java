import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class logTest {
    static Logger logger = Logger.getLogger(logTest.class);
    public static void main(String[] args) {
        logger.debug("你好");
        logger.info("大家好");
        logger.error("我好");


    }

}
