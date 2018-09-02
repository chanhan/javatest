package cn.test.mybatis.unittest;

import cn.test.mybatis.mapper.OrderAllMapper;
import cn.test.mybatis.po.OrderAll;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class OrderAllMapperTest {

    SqlSessionFactory factory = null;

    @Before
    public void setUp() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findOrderPassenger() throws Exception {
        SqlSession sqlSession=factory.openSession();
        OrderAllMapper orderAllMapper=sqlSession.getMapper(cn.test.mybatis.mapper.OrderAllMapper.class);
        List<OrderAll> list=orderAllMapper.findOrderPassenger();
        System.out.println(list);
        sqlSession.close();
    }
}
