package com.atguigu.mybatis314.test1;

import com.atguigu.mybatis314.entity.User;
import com.atguigu.mybatis314.mybatisUtil.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        String statement = "com.atguigu.mybatis314.test1.userMapper" + ".insertUser";
        sqlSession.insert(statement,new User("第17次","15") );
        sqlSession.commit();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        String state = "com.atguigu.mybatis314.test1.userMapper" + ".deleteUser";
        sqlSession.delete(state,3);
        sqlSession.commit();
        sqlSession.close();



    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        String state = "com.atguigu.mybatis314.test1.userMapper" + ".updateUser";
        sqlSession.update(state,new User(1,"jack888","88"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void  testGetUser(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        //映射sql的标识字符串
        String statement = "com.atguigu.mybatis314.test1.userMapper"+".getUser";
        //执行查询返回一个唯一user对象的sql
        User user1 = sqlSession.selectOne(statement, 12);
        System.out.println(user1);
        sqlSession.commit();
        SqlSession sqlSession2 = SessionUtil.getSqlSession();
        User user2 = sqlSession.selectOne(statement, 12);
        System.out.println(user2);
    }
@Test
    public void getAllUsers(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        String state = "com.atguigu.mybatis314.test1.userMapper" + ".getAllUsers";
        List<User> list = sqlSession.selectList(state);
        sqlSession.close();
        System.out.println(list);
}

}
