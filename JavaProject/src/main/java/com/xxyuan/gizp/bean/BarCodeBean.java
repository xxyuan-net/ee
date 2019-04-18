package com.xxyuan.gizp.bean;

import java.util.List;

public class BarCodeBean {


    /**
     * taskDetail : [{"equipCateg":"01","barCode":"1330001000080227773835","statusCode":"006"}]
     * orgName : 河北省电力公司
     * taskNo : 20190328030001
     */
    private List<TaskDetailEntity> taskDetail;
    private String orgName;
    private String taskNo;

    public void setTaskDetail(List<TaskDetailEntity> taskDetail) {
        this.taskDetail = taskDetail;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public List<TaskDetailEntity> getTaskDetail() {
        return taskDetail;
    }

    public String getOrgName() {
        return orgName;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public class TaskDetailEntity {
        /**
         * equipCateg : 01
         * barCode : 1330001000080227773835
         * statusCode : 006
         */
        private String equipCateg;
        private String barCode;
        private String statusCode;

        public void setEquipCateg(String equipCateg) {
            this.equipCateg = equipCateg;
        }

        public void setBarCode(String barCode) {
            this.barCode = barCode;
        }

        public void setStatusCode(String statusCode) {
            this.statusCode = statusCode;
        }

        public String getEquipCateg() {
            return equipCateg;
        }

        public String getBarCode() {
            return barCode;
        }

        public String getStatusCode() {
            return statusCode;
        }
    }
}
