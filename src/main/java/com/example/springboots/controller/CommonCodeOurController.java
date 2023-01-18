package com.example.springboots.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboots.service.CommonCodeOurService;

@Controller
@RequestMapping(value = "/commonCode_our")
public class CommonCodeOurController {

    @Autowired
    CommonCodeOurService commonCodeOurService;

    @RequestMapping(value = { "/update" }, method = RequestMethod.POST)
    public ModelAndView update(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        commonCodeOurService.updateOne(params);
        modelAndView.setViewName("/commonCode_our/list");
        return modelAndView;
    }

    @RequestMapping(value = { "/list", "/", "" }, method = RequestMethod.GET)
    public ModelAndView list(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        Object resultMap = commonCodeOurService.getList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }

    @RequestMapping(value = { "/edit/{uniqueId}" }, method = RequestMethod.GET)
    public ModelAndView edit(@RequestParam Map<String, Object> params, @PathVariable String uniqueId,
            ModelAndView modelAndView) {

        params.put("COMMON_CODE_ID", uniqueId);
        Object resultMap = commonCodeOurService.getOne(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/commonCode_our/edit");
        return modelAndView;
    }
}
