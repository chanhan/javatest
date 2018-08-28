package cn.test.mybatis.dao;

import cn.test.mybatis.po.TrainOrder;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TrainOrderDaoImpl implements TrainOrderDao {
    private SqlSessionFactory sqlSessionFactory;

    public TrainOrderDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public TrainOrder QueryOrderBySerialId(String serialId) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TrainOrder order = sqlSession.selectOne("test.queryById", serialId);
        sqlSession.close();
        return order;
    }

    @Override
    public boolean CreateOrder(TrainOrder order) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int num = sqlSession.insert("test.addOrder", order);
        sqlSession.commit();
        sqlSession.close();
        return num > 0;
    }

    @Override
    public boolean UpdateOrder(TrainOrder order) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int num = sqlSession.update("test.updateOrder", order);
        sqlSession.commit();
        sqlSession.close();
        return num > 0;
    }

    @Override
    public boolean DeleteOrder(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int num = sqlSession.delete("test.delOrder", id);
        sqlSession.commit();
        sqlSession.close();
        return num > 0;
    }
}
