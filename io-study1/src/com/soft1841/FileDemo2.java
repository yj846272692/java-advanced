package com.soft1841;
/**
 * 创建一个文件夹下带问一个文件
 * @author 杨晶
 * 2019.03.25
 */



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        String time =  new SimpleDateFormat("yyyy-MM-dd").format(new Date().getTime());
        System.out.println("创建成功！");
        File path = new File("D:/"+ time);
        if (!path.exists()){
            path.mkdir();
            File file = new File(path + "/" + "hello.txt");
            if (!file.exists()){
                file.createNewFile();
            }
        }
    }
}
