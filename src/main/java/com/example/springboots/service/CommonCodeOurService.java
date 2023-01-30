package com.example.springboots.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboots.Paginations;
import com.example.springboots.dao.CommonCodeOurDao;

@Service
public class CommonCodeOurService {
    @Autowired
    CommonCodeOurDao commonCodeOurDao;

    @Autowired
    AttachFileService attachFileService;

    public Object getOneWithAttachFiles(Object dataMap) {
        // Attach Files ArrayList<Map>
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("attachFiles", attachFileService.getList(dataMap));

        /*
         * 위에서 넣은 result가 사라지지 않게 하기 위해 putAll사용. putAll은 같은 key가 아니면 자동으로 list에다가 put을
         * 해준다
         */
        result.putAll((Map<String, Object>) this.getOne(dataMap));
        return result;
    }

    public Object deleteAndGetList(Object dataMap) {
        Object result = this.delete(dataMap);/* 이미 이 클래스 내에서 delete가 있기 때문 */
        result = this.getList(dataMap);
        return result;

    }

    public Object insertWithFilesAndGetList(Object dataMap) {
        // insert files
        Object result = attachFileService.insertMulti(dataMap);
        result = this.insertOne(dataMap);
        result = this.getList(dataMap);
        return result;

    }

    public Object insertOneAndGetList(Object dataMap) {
        Object result = this.insertOne(dataMap);
        result = this.getList(dataMap);
        return result;

    }

    public Object updateAndGetList(Object dataMap) {
        Object result = this.update(dataMap);
        result = this.getList(dataMap);
        return result;
    }

    public Object getListWithPagination(Object dataMap) {
        Map<String, Object> result = new HashMap<String, Object>();
        int totalCount = (int) this.getTotal(dataMap);
        int currentPage = (int) ((HashMap<String, Object>) dataMap).get("currentPage");
        Paginations paginations = new Paginations(totalCount, currentPage);
        result.put("paginations", paginations);
        ((HashMap<String, Object>) dataMap).put("pageBegin", paginations.getPageBegin());
        result.put("resultList", this.getList(dataMap));
        return result;
    }

    public Object getTotal(Object dataMap) {
        String sqlMapId = "CommonCodeOur.selectTotal";
        Object result = commonCodeOurDao.getOne(sqlMapId, dataMap);
        return result;
    }

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

    public Object update(Object dataMap) {
        String sqlMapId = "CommonCodeOur.updateByUID";
        Object result = commonCodeOurDao.update(sqlMapId, dataMap);
        return result;
    }

    public Object insertOne(Object dataMap) {
        String sqlMapId = "CommonCodeOur.insertWithUID";
        Object result = commonCodeOurDao.insert(sqlMapId, dataMap);
        return result;
    }

    public Object delete(Object dataMap) {
        String sqlMapId = "CommonCodeOur.deleteByUID";
        Object result = commonCodeOurDao.delete(sqlMapId, dataMap);
        return result;
    }

    public Object deleteMulti(Object dataMap) {
        String sqlMapId = "CommonCodeOur.deleteMultiByUIDs";
        Object result = commonCodeOurDao.delete(sqlMapId, dataMap);
        return result;
    }
}
