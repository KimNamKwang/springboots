package com.example.springboots.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.springboots.service.CommonCodeOurService;

@RestController
@CrossOrigin
public class RestfulController {

    @Autowired
    CommonCodeOurService commonCodeOurService;

    @RequestMapping(value = "/api/v1/helloworld", method = RequestMethod.GET)
    public String helloWorld() {

        return "Hello World!";

    }

    // params - title:"learn ajax", description:"we learn with ajax" postman에서 넣어줄것
    @RequestMapping(value = "/api/v1/requestParams", method = RequestMethod.GET)
    public Map requestParams(@RequestParam Map<String, Object> params) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.putAll(params);
        result.put("id", "Durante");
        return result;
    }

    // currentPage = 1
    @RequestMapping(value = "/api/v1/requestParamsWithDB", method = RequestMethod.POST)
    public Map requestParamsWithDB(@RequestParam Map<String, Object> params) {
        params.put("currentPage", Integer.parseInt((String) params.get("currentPage")));
        params.put("pageScale", 10);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap = (Map<String, Object>) commonCodeOurService.getListWithPagination(params);

        return resultMap;
    }
}
