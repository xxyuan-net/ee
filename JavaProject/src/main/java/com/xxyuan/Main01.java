package com.xxyuan;

public class Main01 {
    public static void main(String[] args) {
        replaceAll();
    }

    /**
     * 去除零字符
     */
    private static void replaceAll() {
        String str ="5130001000123123000000";
        //去除后边的零字符
        String newStr = str.replaceAll("0*$", "");
        System.out.println(newStr);
        //去除前面的零字符
//        String newStr = str.replaceAll("^(0+)", "");
//        System.out.println(newStr);
    }
}
