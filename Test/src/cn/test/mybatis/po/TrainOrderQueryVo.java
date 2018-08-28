package cn.test.mybatis.po;

import java.util.List;

public class TrainOrderQueryVo {
    private TrainOrderCustomer orderCustomer;

    public TrainOrderCustomer getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(TrainOrderCustomer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    private  List<Integer> ids;
}
