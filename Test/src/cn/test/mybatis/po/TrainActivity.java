package cn.test.mybatis.po;

public class TrainActivity {

    public String getActivityNo() {
        return activityNo;
    }

    @Override
    public String toString() {
        return "TrainActivity{" +
                "activityId=" + activityId +
                ", activityNo='" + activityNo + '\'' +
                '}';
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }

    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    private long activityId;
    private String activityNo;
}
