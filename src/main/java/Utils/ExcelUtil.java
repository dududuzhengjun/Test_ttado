package Utils;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtil {
    //创建一个类 构造二位方法 （对于文件，起始行和起始列）
    public static Object[][] read(String path, int yesRow, int onRow, int yesCell, int onCell) {
        //异常
        try {
            // 创建一个工作簿对象  闯入一个输出流对象
            Workbook workbook=WorkbookFactory.create(ExcelUtil.class.getResourceAsStream(path));
            //选择sheet表单
            Sheet sheet=workbook.getSheetAt(0);
            //创建保存数据数组
            Object [][] datas = new Object[onRow-yesRow+1][onCell-yesCell+1];
            //循环拿出数据
            for (int i=yesRow;i<=onRow;i++){
                //拿出一行
                Row row=sheet.getRow(i-1);
                //循环拿出所有列数据
                for (int j=yesCell;j<=onCell;j++){
                    //如果为空 会空值真，需要返回String类型为空
                    //取出一列
                    Cell cell=row.getCell(j-1,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    cell.setCellType(CellType.STRING);
                    //取出 列值
                    String value = cell.getStringCellValue();
                    //数据保存数组 datas 和 value 结合 值与索引
                    datas[i-yesRow][j-yesCell] = value;
                }
            }
            return datas;

        } catch  (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static void main(String[] args) {
//        Object[][] datas=read("/修改档案资料.xlsx",1,2,1,4);
//        for (Object[] objects: datas) {
//            for (Object object : objects) {
//                System.out.println("[" + object + "]");
//            }
//            System.out.println("--------------------------");
//        }
//    }

}
