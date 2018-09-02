package cn.test.mybatis.mapper;

import cn.test.mybatis.po.OrderAll;

import java.util.List;

public interface OrderAllMapper {
    public List<OrderAll> findOrderPassenger() throws  Exception;
}
