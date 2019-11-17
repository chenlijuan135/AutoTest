package com.vanke.utils;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;



class Test {
    @org.junit.Test
    public void test1() throws IOException, WriteException, BiffException, ParseException {
        OutputStream os=new FileOutputStream(new File("D:/test1.xls"));
        ExcelUtil.writeExcel(os);
        ExcelUtil.readExcel(new File("D:/test1.xls"));
        System.out.println("ss");
    }
}
