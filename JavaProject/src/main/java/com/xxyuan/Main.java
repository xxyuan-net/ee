package com.xxyuan;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    private static StringBuffer buffer1;

    /**
     * 判断校验
     *
     * @param data
     */
    public static void data(String data) {
        boolean flag = data.contains("ffffff");
        if (flag) {
            if (buffer1 != null && buffer1.length() > 0) {
                insertDB(buffer1.toString());
            }
            buffer1 = new StringBuffer();
        }
        if (buffer1 == null) {
            buffer1 = new StringBuffer();
        }

        buffer1.append(data);

    }

    /**
     * 插入到数据库
     *
     * @param toString
     */
    private static void insertDB(String toString) {
        System.out.println(toString);
    }


    public static void main(String[] args) {
        startThread();
    }

    private static void startThread() {
        Timer timer = new Timer();

        //前一次执行程序结束后 1000ms 后开始执行下一次程序
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                try {
                    data("fffffffffffff123");
                    Thread.sleep(500);
                    data("2222222222222222");
                    Thread.sleep(500);
                    data("3333333333333333");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }, 0, 3000);
    }

}
