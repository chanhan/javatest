package cn.test.mybatis.unittest;

import cn.test.mybatis.dao.TrainOrderDao;
import cn.test.mybatis.dao.TrainOrderDaoImpl;
import cn.test.mybatis.po.TrainOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class TrainOrderDaoImplTest {
    SqlSessionFactory factory = null;

    @Before
    public void setUp() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void queryOrderBySerialId() throws Exception {
        TrainOrderDao dao = new TrainOrderDaoImpl(factory);
        TrainOrder order = dao.QueryOrderBySerialId("TTO5AA673U610A03F6049356695");
        System.out.println(order);
    }

    @Test
    public void createOrder() {
    }

    @Test
    public void updateOrder() {
    }

    @Test
    public void deleteOrder() {
    }
}