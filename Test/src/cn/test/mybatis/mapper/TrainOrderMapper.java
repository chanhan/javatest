package cn.test.mybatis.mapper;

import cn.test.mybatis.po.TrainOrder;
import cn.test.mybatis.po.TrainOrderCustomer;
import cn.test.mybatis.po.TrainOrderQueryVo;

import java.util.List;

public interface TrainOrderMapper {
    public TrainOrder QueryOrderBySerialId(String serialId) throws Exception;
    public boolean CreateOrder(TrainOrder order) throws Exception;
    public boolean DeleteOrder(int id) throws Exception;
    public boolean UpdateOrder(TrainOrder order) throws Exception;
    public List<TrainOrderCustomer> QueryTrainOrderByCondition(TrainOrderQueryVo queryVo);
    public List<TrainOrderCustomer> QueryTrainOrderByConditionForResultMap(TrainOrderQueryVo queryVo);
    public int QueryTrainOrderCount(TrainOrderQueryVo queryVo);
}
