package com.cuit.lesson1;

import java.util.Arrays;
public class CopyArray {
    public static void main (String args[ ]) {
        int [] a = {1,2,3,4,500,600,700,800};
        int [] b,c,d;
        System.out.println(Arrays.toString(a));
        b = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(b));
        c = Arrays.copyOf(a, 4);    //Arrays调用copyOf方法复制数组a的前4个元素
        System.out.println(Arrays.toString(c));     //Arrays调用toString方法返回数组c元素值的字符串
        d = Arrays.copyOfRange(a, 4, 7);    //Arrays调用copyOfRange方法复制数组a的后4个元素
        System.out.println(Arrays.toString(d));
        c[c.length - 1] = 100;  //将-100赋给数组c的最后一个元素

        int [] tom = Arrays.copyOf(c,6);
        System.out.println(Arrays.toString(tom));

        d[d.length - 1] = -200;
        System.out.println(Arrays.toString(a));
    }
}