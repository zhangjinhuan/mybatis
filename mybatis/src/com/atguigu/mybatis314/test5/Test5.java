package com.atguigu.mybatis314.test5;

import com.atguigu.mybatis314.entity.ConditionUser;
import com.atguigu.mybatis314.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Test5 {
    public static void main(String[] args) throws IOException {

        Reader reader = Resources.getResourceAsReader("conf.xml");

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession sqlSession = sessionFactory.openSession();

        String statement = "com.atguigu.mybatis314.test5.duserMapper.getUsers";
        //User list = sqlSession.selectOne(statement,1);
        //List<User> list = sqlSession.selectList(statement,new ConditionUser("%null%",1,17));
        List<User> list = sqlSession.selectList(statement,new ConditionUser("%17%",1,17));
        System.out.println(list);
    }
}
