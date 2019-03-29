import bean.BarCodeBean;
import bean.BarCodeResultBean;
import com.alibaba.fastjson.JSON;
import util.TextUtils;
import util.ZipUtils;

import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {

        try {
            String fileString = TextUtils.getFileString("C:\\Users\\ThinkPad\\Desktop\\data\\1234.txt");

            BarCodeBean barCodeBean = JSON.parseObject(fileString, BarCodeBean.class);
            List<BarCodeBean.TaskDetailEntity> taskDetail = barCodeBean.getTaskDetail();

            List<BarCodeBean.TaskDetailEntity> taskDetail_copy1 = new ArrayList<>();

            for (int i = 0; i < 40000; i++) {
                taskDetail_copy1.add(taskDetail.get(i));
            }
            BarCodeBean barCodeBean1 = new BarCodeBean();
            barCodeBean1.setOrgName("河北省电力公司");
            barCodeBean1.setTaskNo("20190328030001");
            barCodeBean1.setTaskDetail(taskDetail_copy1);

            String toJSON = JSON.toJSONString(barCodeBean1);
            String s1 = ZipUtils.compressForGzip(toJSON);


            List<BarCodeBean.TaskDetailEntity> taskDetail_copy2 = new ArrayList<>();

            for (int i = 40000; i < 80000; i++) {
                taskDetail_copy2.add(taskDetail.get(i));
            }
            BarCodeBean barCodeBean2 = new BarCodeBean();
            barCodeBean2.setOrgName("河北省电力公司");
            barCodeBean2.setTaskNo("20190328030001");
            barCodeBean2.setTaskDetail(taskDetail_copy2);

            String toJSON2 = JSON.toJSONString(barCodeBean2);
            String s2 = ZipUtils.compressForGzip(toJSON2);


            List<BarCodeBean.TaskDetailEntity> taskDetail_copy3 = new ArrayList<>();

            for (int i = 80000; i < taskDetail.size(); i++) {
                taskDetail_copy3.add(taskDetail.get(i));
            }
            BarCodeBean barCodeBean3 = new BarCodeBean();
            barCodeBean3.setOrgName("河北省电力公司");
            barCodeBean3.setTaskNo("20190328030001");
            barCodeBean3.setTaskDetail(taskDetail_copy3);

            String toJSON3 = JSON.toJSONString(barCodeBean3);
            String s3 = ZipUtils.compressForGzip(toJSON3);


            BarCodeResultBean barCodeResultBean = new BarCodeResultBean();
            barCodeResultBean.setList1(s1);
            barCodeResultBean.setList2(s2);
            barCodeResultBean.setList3(s3);

            String barCodeResultBeanString = JSON.toJSONString(barCodeResultBean);

            TextUtils.toFileText(barCodeResultBeanString);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
