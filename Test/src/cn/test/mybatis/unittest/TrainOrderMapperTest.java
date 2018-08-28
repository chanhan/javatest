package cn.test.mybatis.unittest;

import cn.test.mybatis.dao.TrainOrderDao;
import cn.test.mybatis.mapper.TrainOrderMapper;
import cn.test.mybatis.po.TrainOrder;
import cn.test.mybatis.po.TrainOrderCustomer;
import cn.test.mybatis.po.TrainOrderQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.*;

import static org.junit.Assert.*;

public class TrainOrderMapperTest {
    SqlSessionFactory factory = null;

    @Before
    public void setUp() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void queryOrderBySerialId() throws Exception {
        SqlSession sqlSession = factory.openSession();
        TrainOrderMapper trainOrderMapper = sqlSession.getMapper(TrainOrderMapper.class);
        TrainOrder order = trainOrderMapper.QueryOrderBySerialId("TTO5AA673U610A03F6049356695");
        sqlSession.close();
        System.out.println(order);
    }

    @Test
    public void updateOrder() throws Exception {
        SqlSession sqlSession = factory.openSession();
        TrainOrderMapper trainOrderMapper = sqlSession.getMapper(TrainOrderMapper.class);
        TrainOrder order=new TrainOrder() ;
        order.setId(291);
        order.setSerialId("TTO5A8UA157149029F013980106");
        boolean bool = trainOrderMapper.UpdateOrder(order);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(bool);
    }
    @Test
    public void createOrder() throws Exception {
        SqlSession sqlSession = factory.openSession();
        TrainOrderMapper trainOrderMapper = sqlSession.getMapper(TrainOrderMapper.class);
        TrainOrder order=new TrainOrder() ;
        order.setSerialId("TTO5A8UA157149029F013980109");
        boolean bool = trainOrderMapper.CreateOrder(order);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(bool);
    }
    @Test
    public void deleteOrder() throws Exception {
        SqlSession sqlSession = factory.openSession();
        TrainOrderMapper trainOrderMapper = sqlSession.getMapper(TrainOrderMapper.class);
        boolean bool = trainOrderMapper.DeleteOrder(411);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(bool);
    }
    @Test
    public void QueryTrainByCondition() throws Exception {
        SqlSession sqlSession = factory.openSession();
        TrainOrderMapper trainOrderMapper = sqlSession.getMapper(TrainOrderMapper.class);
        TrainOrderQueryVo queryVo=new TrainOrderQueryVo();
        TrainOrderCustomer orderCustomer=new TrainOrderCustomer();
        orderCustomer.setSerialId("TTO59F6CA35149029F010304990");
        orderCustomer.setPassengerNames("玉");
        queryVo.setOrderCustomer(orderCustomer);
        List<TrainOrderCustomer> orders = trainOrderMapper.QueryTrainOrderByCondition(queryVo);
        sqlSession.close();
        System.out.println(orders);
    }
    @Test
    public void QueryTrainByConditionForResultMap() throws Exception {
        SqlSession sqlSession = factory.openSession();
        TrainOrderMapper trainOrderMapper = sqlSession.getMapper(TrainOrderMapper.class);
        TrainOrderQueryVo queryVo=new TrainOrderQueryVo();
        TrainOrderCustomer orderCustomer=new TrainOrderCustomer();
        orderCustomer.setSerialId("TTO59F6CA35149029F010304990");
        orderCustomer.setPassengerNames("玉");
        queryVo.setOrderCustomer(orderCustomer);
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(1);
        ids.add(203);
        queryVo.setIds(ids);
        List<TrainOrderCustomer> orders = trainOrderMapper.QueryTrainOrderByConditionForResultMap(queryVo);
        int count=trainOrderMapper.QueryTrainOrderCount(queryVo);
        sqlSession.close();
        System.out.println(count);
        System.out.println(orders);
    }
}