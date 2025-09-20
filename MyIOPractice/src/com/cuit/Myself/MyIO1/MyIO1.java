package com.cuit.Myself.MyIO1;

import java.io.FileInputStream;
import java.io.IOException;

public class MyIO1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myIO.txt");
        int byte1 = fis.read();
        System.out.println(byte1);

        // read 顺序读取文件

        char byte2 = (char)fis.read();
        System.out.println(byte2);
        fis.close();
    }
}
