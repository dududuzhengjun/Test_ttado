import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNG {

    /*
    没必要的时候不要改源码
    1、testng.xml文件介绍
    2、testng忽略测试：可以让测试方法/测试不执行
        a、注解：@Test(enabled = false)该测试方法将不会执行
        b、xml：<test enabled = false> 对整个测试类的所有测试方法都不会执行
        c、在xml中，如果要对某个方法进行忽略测试:
    3、testng依赖测试：A依赖于B，运行A测试，必须先执行B测试
        a、注解：@Test(dependsOnMethods = "被依赖的方法名称")
        b、xml：
        c、强制依赖：被依赖的测试正常运行与否，依赖的测试方法都将执行
                    @Test(dependOnMethods = "被依赖的方法名称",alwaysRun = true)
    4、testng异常测试：预期结果就是异常的测试，测试方法执行过程中报同类型异常则测试通过，否则测试失败
        a、注解：@Test(expectedExceptions = 异常类型.class)
    5、test自定义顺序测试：多个测试方法的执行顺序
        a、注解：@Test(priority = 1)  数字越小，优先级越高，最高为0，默认值为0
        b、xml：<methods> <include> 所包含的方法，从上往下依次执行
    6、testng参数化测试
        a、Parameters
            1、在代码中对方法进行注解
            @Parameters("定义的参数名称") 有多个的话就用","隔开
            2、在xml中，<Parameters name="定义的参数名称1" value="需要赋值的内容">
            3、在代码中使用注解定义的参数，必须在xml中赋值，如果没有赋值，则需要
        b、DataProvider(数据提供商)/dataProvider(数据使用商)
            1、Object[][]
            2、Iterator<Object[]>

            物理行数：有内容的行
            不要在数据中有空行

     */

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("This is BeforeSuite");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("This is BeforeTest");
    }

    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("This is BeforeGroups");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("This is BeforeClass");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("This is BeforeMethod");
    }

    @Test
    public void Test(){
        System.out.println("This is Test");
    }

    @Test
    public void Test1(){
        System.out.println("This is Test1");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("This is AfterMethod");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("This is AfterClass");
    }

    @AfterGroups
    public void AfterGroups(){
        System.out.println("This is AfterGroups");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("This is AfterTest");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("This is AfterSuite");
    }

}
