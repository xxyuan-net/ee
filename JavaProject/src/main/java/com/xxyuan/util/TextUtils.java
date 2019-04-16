package com.xxyuan.util;

import java.io.*;

public class TextUtils {

    public static String getFileString(String path) throws Exception {

        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);

        StringBuilder builder = new StringBuilder();

        String lineStr;
        while ((lineStr = reader.readLine()) != null) {
            builder.append(lineStr);
        }
        reader.close();
        fileReader.close();

        return builder.toString();
    }

    public static void toFileText(String str) {
        FileWriter fileWriter = null;// 文件覆盖
        try {
            fileWriter = new FileWriter("C:\\Users\\ThinkPad\\Desktop\\data\\123.txt");

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(str);
            writer.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
