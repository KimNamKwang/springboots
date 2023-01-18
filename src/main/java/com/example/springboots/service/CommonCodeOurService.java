package com.example.springboots.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboots.dao.CommonCodeOurDao;

@Service
public class CommonCodeOurService {
    @Autowired
    CommonCodeOurDao commonCodeOurDao;

    public Object getList(Object dataMap) {
        String sqlMapId = "CommonCodeOur.selectListByUID";
        Object result = commonCodeOurDao.getList(sqlMapId, dataMap);
        return result;
    }

    public Object getOne(Object dataMap) {
        String sqlMapId = "CommonCodeOur.selectByUID";
        Object result = commonCodeOurDao.getOne(sqlMapId, dataMap);
        return result;
    }

    public Object updateOne(Object dataMap) {
        String sqlMapId = "CommonCodeOur.selectByUID";
        Object result = commonCodeOurDao.updateOne(sqlMapId, dataMap);
        return result;
    }
}
