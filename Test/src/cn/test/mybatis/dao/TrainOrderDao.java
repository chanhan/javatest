package cn.test.mybatis.dao;

import cn.test.mybatis.po.TrainOrder;

public interface TrainOrderDao {
    public TrainOrder QueryOrderBySerialId(String serialId) throws Exception;
    public boolean CreateOrder(TrainOrder order) throws Exception;
    public boolean DeleteOrder(int id) throws Exception;
    public boolean UpdateOrder(TrainOrder order) throws Exception;
}
