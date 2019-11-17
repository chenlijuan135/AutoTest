package com.vanke.cn.auto;

import com.vanke.utils.ExcelUtil;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.text.ParseException;

@SpringBootApplication
public class AutoApplication {

    public static void main(String[] args) throws IOException, WriteException, BiffException, ParseException {
        SpringApplication.run(AutoApplication.class, args);
        OutputStream os=new FileOutputStream(new File("D:/test1.xls"));
        ExcelUtil.writeExcel(os);
        File file=new File("D:/test1.xls");
        ExcelUtil.readExcel(file);
    }

}
