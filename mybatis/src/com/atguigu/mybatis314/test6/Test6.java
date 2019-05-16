package com.atguigu.mybatis314.test6;

import com.atguigu.mybatis314.mybatisUtil.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Test6 {
    @Test
    public void testProcedure(){
        Map<String,Integer> map = new HashMap();
        map.put("sex_id",1);

        SqlSession sqlSession = SessionUtil.getSqlSession();
        String statement = "com.atguigu.mybatis314.test6.puserMapper.getCountsex";
        sqlSession.selectOne(statement,map);
        Integer usercount = map.get("user_count");
        System.out.println(usercount);

    }
}
