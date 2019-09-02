package com.xxyuan.test;

import java.io.UnsupportedEncodingException;

public class ByteTest {
    public static void main(String[] args) {
        try {
            String str = "测试";
            byte[] bytes = new byte[0];
            bytes = str.getBytes("utf-8");
            for (byte b: bytes){
                System.out.println("打印：" + b);
            }

            String s = new String(bytes);
            System.out.println("打印String：" + s);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public static void main1(String[] args) {
        byte[] b = {(byte) 0xB8, (byte) 0xDF, (byte) 0xCB, (byte) 0xD9};
        String str = new String(b);
        System.out.println("打印：" + str);
    }
}
