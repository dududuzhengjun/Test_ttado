package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class number {
    public static void main(String[] args) {
//        float a = (float) 0.1;
//        float b = (float) 0.2;
//        float c = a+b;
//        System.out.println(c);
//        WebDriver driver=new ChromeDriver();
//        driver.get("http://www.baidu.com");
//        driver.quit();
        Connection con;
        //jdbc驱动
        String driver="com.mysql.jdbc.Driver";
        //这里我的数据库是cxxt
        String url="jdbc:mysql://localhost:3306/test?&useSSL=false&serverTimezone=UTC";
        String user="root";
        String password="940927";
        try {
            //注册JDBC驱动程序
            Class.forName(driver);
            //建立连接
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("数据库连接成功");
            }
            String sql ="select * from score";
            PreparedStatement preparedStatement=con.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("Sno"));
            }
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
