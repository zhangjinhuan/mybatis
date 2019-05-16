package com.atguigu.mybatis314.test4;

import com.atguigu.mybatis314.entity.Classes;
import com.atguigu.mybatis314.mybatisUtil.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Test4 {
    @Test
    public void getClasses4(){
        SqlSession sqlSession = SessionUtil.getSqlSession();
        String sql = "com.atguigu.mybatis314.test4.classes.getClasses4";
        Classes classes = sqlSession.selectOne(sql,1);
        System.out.println(classes);
    }
}
