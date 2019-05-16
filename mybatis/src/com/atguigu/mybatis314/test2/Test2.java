package com.atguigu.mybatis314.test2;

import com.atguigu.mybatis314.entity.Order;
import com.atguigu.mybatis314.mybatisUtil.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Test2 {
    @Test
    public void getOrder21(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        String sql = "com.atguigu.mybatis314.test2.orderMapper" + ".getOrder";
        Order order = sqlSession.selectOne(sql,5);
        sqlSession.close();
        System.out.println(order);
    }

    @Test
    public void getOrderResultMap1(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        String sql = "com.atguigu.mybatis314.test2.orderMapper.getOrderResultMap";
        Order order = sqlSession.selectOne(sql,5);
        System.out.println(order);
    }
}
