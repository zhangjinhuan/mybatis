package com.atguigu.mybatis314.test3;

import com.atguigu.mybatis314.entity.Classes;
import com.atguigu.mybatis314.mybatisUtil.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Test3 {
    @Test
    public void getClasses(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        String sql = "com.atguigu.mybatis314.test3.classes.getClasses";
        Classes classes =  sqlSession.selectOne(sql,2);

        System.out.println(classes);
    }
    @Test
    public void getClasses2(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        String sql = "com.atguigu.mybatis314.test3.classes.getClasses2";
        Classes classes = sqlSession.selectOne(sql,1);
        System.out.println(classes);
    }

}
