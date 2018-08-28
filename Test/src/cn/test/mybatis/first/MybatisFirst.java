package cn.test.mybatis.first;

import cn.test.mybatis.po.TrainOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisFirst {
    @Test
    public void QueryOrderBySerialId() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        TrainOrder order = sqlSession.selectOne("test.queryById", "TTO59F09175149029F023072837");
        System.out.println(order);
        List<TrainOrder> orders = sqlSession.selectList("test.queryByName", "赵");
        System.out.println(orders);
        sqlSession.close();
    }

    @Test
    public void CreateOrder() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        TrainOrder order = new TrainOrder();
        order.setSerialId("TO1332212121289");
        int num = sqlSession.insert("test.addOrder", order);
        sqlSession.commit();
        System.out.println(num);
        System.out.println(order.getId());
        sqlSession.close();
    }


    @Test
    public void DeleteOrder() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        int num = sqlSession.delete("test.delOrder", 412);
        sqlSession.commit();
        System.out.println(num);
        sqlSession.close();
    }

    @Test
    public void UpdateOrder() throws Exception {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        TrainOrder order = new TrainOrder();
        order.setSerialId("TO1332212121289");
        order.setId(411);
        int num = sqlSession.update("test.updateOrder", order);
        sqlSession.commit();
        System.out.println(num);
        sqlSession.close();
    }


}
