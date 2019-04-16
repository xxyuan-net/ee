package com.xxyuan;

import com.xxyuan.bean.BarCodeBean;
import com.xxyuan.bean.BarCodeResultBean;
import com.alibaba.fastjson.JSON;
import com.xxyuan.util.TextUtils;
import com.xxyuan.util.ZipUtils;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {

        try {
            String fileString = TextUtils.getFileString("C:\\Users\\ThinkPad\\Desktop\\data\\1234.txt");

            String org ="河北省电力公司";
            BarCodeBean barCodeBean = JSON.parseObject(fileString, BarCodeBean.class);
            List<BarCodeBean.TaskDetailEntity> taskDetail = barCodeBean.getTaskDetail();

            List<BarCodeBean.TaskDetailEntity> taskDetail_copy1 = new ArrayList<>();

            for (int i = 0; i < 40000; i++) {
                taskDetail_copy1.add(taskDetail.get(i));
            }
            BarCodeBean barCodeBean1 = new BarCodeBean();
            barCodeBean1.setOrgName(new String(org.getBytes( "UTF-8")));
            barCodeBean1.setTaskNo("20190328030001");
            barCodeBean1.setTaskDetail(taskDetail_copy1);

            String toJSON = JSON.toJSONString(barCodeBean1);
            String s1 = ZipUtils.compressForGzip(toJSON);


            List<BarCodeBean.TaskDetailEntity> taskDetail_copy2 = new ArrayList<>();

            for (int i = 40000; i < 80000; i++) {
                taskDetail_copy2.add(taskDetail.get(i));
            }
            BarCodeBean barCodeBean2 = new BarCodeBean();
            barCodeBean2.setOrgName(new String(org.getBytes( "UTF-8")));
            barCodeBean2.setTaskNo("20190328030001");
            barCodeBean2.setTaskDetail(taskDetail_copy2);

            String toJSON2 = JSON.toJSONString(barCodeBean2);
            String s2 = ZipUtils.compressForGzip(toJSON2);


            List<BarCodeBean.TaskDetailEntity> taskDetail_copy3 = new ArrayList<>();

            for (int i = 80000; i < 120000; i++) {
                taskDetail_copy3.add(taskDetail.get(i));
            }
            BarCodeBean barCodeBean3 = new BarCodeBean();
            barCodeBean3.setOrgName(new String(org.getBytes("UTF-8")));
            barCodeBean3.setTaskNo("20190328030001");
            barCodeBean3.setTaskDetail(taskDetail_copy3);

            String toJSON3 = JSON.toJSONString(barCodeBean3);
            String s3 = ZipUtils.compressForGzip(toJSON3);

            List<BarCodeBean.TaskDetailEntity> taskDetail_copy4 = new ArrayList<>();

            for (int i = 120000; i < 160000; i++) {
                taskDetail_copy4.add(taskDetail.get(i));
            }
            BarCodeBean barCodeBean4 = new BarCodeBean();
            barCodeBean4.setOrgName(new String(org.getBytes("UTF-8")));
            barCodeBean4.setTaskNo("20190328030001");
            barCodeBean4.setTaskDetail(taskDetail_copy4);

            String toJSON4 = JSON.toJSONString(barCodeBean4);
            String s4 = ZipUtils.compressForGzip(toJSON4);

            List<BarCodeBean.TaskDetailEntity> taskDetail_copy5 = new ArrayList<>();

            for (int i = 160000; i < taskDetail.size(); i++) {
                taskDetail_copy5.add(taskDetail.get(i));
            }
            BarCodeBean barCodeBean5 = new BarCodeBean();
            barCodeBean5.setOrgName(new String(org.getBytes("UTF-8")));
            barCodeBean5.setTaskNo("20190328030001");
            barCodeBean5.setTaskDetail(taskDetail_copy5);

            String toJSON5 = JSON.toJSONString(barCodeBean5);
            String s5 = ZipUtils.compressForGzip(toJSON5);

            BarCodeResultBean barCodeResultBean = new BarCodeResultBean();
            List<String>  list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            list.add(s4);
            list.add(s5);
            barCodeResultBean.setList(list);

            String barCodeResultBeanString = JSON.toJSONString(barCodeResultBean);

            TextUtils.toFileText(barCodeResultBeanString);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
