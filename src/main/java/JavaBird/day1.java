package JavaBird;
import java.text.SimpleDateFormat;
import java.util.*;

public class day1 {
    public static void main(String[] args) {
        SimpleDateFormat current_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(current_time.format(new Date()));// new Date()为获取当前系统时间
    }
}
