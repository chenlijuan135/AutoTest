package com.vanke.cn.util;

import com.vanke.utils.ExcelUtil;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;

public class ExcelUtilTest {

    @Test
    public void test1() throws IOException, WriteException, BiffException, ParseException {
        OutputStream os=new FileOutputStream(new File("D:/test1.xls"));
        ExcelUtil.writeExcel(os);
        ExcelUtil.readExcel(new File("D:/test1.xls"));


    }
}
