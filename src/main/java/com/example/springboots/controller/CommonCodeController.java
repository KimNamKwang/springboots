package com.example.springboots.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboots.dao.CommonCodeDao;
import com.example.springboots.dao.HomeDao;

/*@ServletComponentScan을 걸어주는것과 같음 */
@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {

    @Autowired
    CommonCodeDao commonCodeDao;

    @RequestMapping(value = "/list")
    public Object list(ModelAndView modelAndView) {
        Object resultset = commonCodeDao.getListForCommon();
        modelAndView.addObject("resultset", resultset);
        modelAndView.setViewName("commonCode/list");

        return modelAndView;
    }

}
