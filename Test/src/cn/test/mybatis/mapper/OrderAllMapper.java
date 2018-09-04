package cn.test.mybatis.mapper;

import cn.test.mybatis.po.OrderAll;
import cn.test.mybatis.po.TrainOrder;

import java.util.List;

public interface OrderAllMapper {
    public List<OrderAll> findOrderPassenger() throws  Exception;
    public List<TrainOrder> findOrderActivityResultMap() throws  Exception;
}
