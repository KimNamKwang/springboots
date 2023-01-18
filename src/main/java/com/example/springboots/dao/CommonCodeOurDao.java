package com.example.springboots.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonCodeOurDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public Object getList(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.selectList(sqlMapId, dataMap);
        return result;

    }

    public Object getOne(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.selectList(sqlMapId, dataMap);
        return result;
    }

    public Object updateOne(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.update(sqlMapId, dataMap);
        return result;
    }
}
