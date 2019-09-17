package Pages;

import Configs.ModifiedDataConfig;
import Utils.ExcelUtils;
import Utils.Page;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.*;

public class ModifiedData {

    Page page = new Page(ModifiedDataConfig.DRIVERTYPE);

    public void openBrowser(){

        //输入禅道网址
        page.geturl(ModifiedDataConfig.URL);

        //点击开源版
        page.click(ModifiedDataConfig.KAIYUAN);

        //窗口最大化
        page.windowmax();

        //输入用户名
        page.sendKey(ModifiedDataConfig.USERNAMETEXT, ModifiedDataConfig.USERNAME);
        page.pause(ModifiedDataConfig.SLEEP);

        //输入密码
        page.sendKey(ModifiedDataConfig.PASSWORDTEXT, ModifiedDataConfig.PASSWORD);
        page.pause(ModifiedDataConfig.SLEEP);

        //点击保存登录状态
        page.click(ModifiedDataConfig.SAVELOGIN);
        page.pause(ModifiedDataConfig.SLEEP);

        //点击登录
        page.click(ModifiedDataConfig.LOGINZENTAO);
        page.pause(ModifiedDataConfig.SLEEP);
    }


    public void modifiedData(Map<String, String> map) {

        page.pause(ModifiedDataConfig.SLEEP);
        //点击档案
        page.click(ModifiedDataConfig.DANGAN);
        page.pause(ModifiedDataConfig.SLEEP);


        //进入框架点击修改档案
        page.frame(ModifiedDataConfig.DANGANFRAME);
        page.pause(ModifiedDataConfig.SLEEP);

        //点击修改档案
        page.click(ModifiedDataConfig.MODIFIEDDATA);
        page.pause(ModifiedDataConfig.SLEEP);

        //修改性别为女
        page.JS(ModifiedDataConfig.SEX);

        //修改出生年月
        page.clear(ModifiedDataConfig.BIRTHDAY);
        page.sendKey(ModifiedDataConfig.BIRTHDAY,map.get("出生年月"));

        //修改源代码账号
        page.clear(ModifiedDataConfig.ACCOUNTNO);
        page.sendKey(ModifiedDataConfig.ACCOUNTNO,map.get("源代码账号"));

        //修改QQ
        page.clear(ModifiedDataConfig.QQ);
        page.sendKey(ModifiedDataConfig.QQ,map.get("QQ"));

        //安全验证输入密码
        page.clear(ModifiedDataConfig.SAFEPASSWORD);
        page.sendKey(ModifiedDataConfig.SAFEPASSWORD,map.get("安全验证密码"));

        //点击保存
        page.click(ModifiedDataConfig.SUBMITSAVE);
        page.pause(ModifiedDataConfig.SLEEP);

        //退出框架
        page.exitframe();

        //点击叉掉
        page.pause(ModifiedDataConfig.SLEEP);
        page.click(ModifiedDataConfig.XX);
        page.pause(ModifiedDataConfig.SLEEP);
    }



    /*//获取当前窗口的句柄
    String handle = driver.getWindowHandle();
        System.out.println(handle);*/
}
//    @DataProvider(name = "data")
//    public Object[][] data1(){
//        Object[][] array = {{"1541-1-2","564561","65468465","admin123456"},{"1555-5-9","541655","56456465","admin123456"}};
//        return array;
//    }

//    @DataProvider(name = "data")
//    public Object[][] data1(){
//        Object[][] data2 = ExcelUtil.read("/修改档案资料.xlsx",1,3,1,4);
//        return data2;
//    }
//
//    public void readInfo() throws Exception {
//        //Excel文件
//        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(getFile("classpath:修改档案资料.xlsm")));
//        //取工作表
//        XSSFSheet sheet = wb.getSheetAt(0);
//
//        //循环读出每条记录，第0行为标题行，故从下标为1的行开始取数值
//        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//            XSSFRow row = sheet.getRow(i);
//            XSSFCell codeCell = row.getCell(0);
//            codeCell.setCellType(XSSFCell.CELL_TYPE_STRING); //设置单元格格式为String，否则无法用字符串接收一个将数字格式的cell
//            String code = codeCell.getStringCellValue();
//            Date date = row.getCell(1).getDateCellValue();  //单元格为date格式
//            Double income = row.getCell(2).getNumericCellValue();  //单元格为数字类型
//        }
//    }
//
//    public void writeExel() throws Exception{
//        String excelFileName = "classpath:修改档案资料.xlsm";// 文件名
//
//        String sheetName = "禅道修改档案资料";// 工作表名
//
//        XSSFWorkbook wb = new XSSFWorkbook();
//        XSSFSheet sheet = wb.createSheet(sheetName);
//
//        // 循环写入每条收入记录的主码和盈利额
//        for (int r = 1; r < 3; r++)
//        {
//            XSSFRow row = sheet.createRow(r);
//
//            XSSFCell codeCell = row.createCell(0);
//
//            codeCell.setCellValue(r);
//
//            XSSFCell profitCell1 = row.createCell(1);
//
//            profitCell1.setCellValue(500 * r);
//
//        }
//
//        FileOutputStream fileOut = new FileOutputStream(excelFileName);
//
//        // 将workbook写到输出流中
//        wb.write(fileOut);
//        fileOut.flush();
//        fileOut.close();
//    }



