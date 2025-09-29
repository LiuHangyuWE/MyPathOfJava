package com.cuit.Myself.MyIO1;

import java.io.FileInputStream;
import java.io.IOException;

public class MyIO1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myIO.txt");
        int byte1 = fis.read();
        System.out.println(byte1);
        char byte2 = (char)fis.read();
        System.out.println(byte2);

        int byte3;
        FileInputStream fis2 = new FileInputStream("myIO.txt");

        // 读取一次 read() 移动一次指针，所以需要接收第三方变量
        while ((byte3 = fis2.read()) != -1) {
            System.out.print((char)byte3);
        }
        fis.close();
    }
}
