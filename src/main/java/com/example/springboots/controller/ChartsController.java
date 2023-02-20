package com.example.springboots.controller;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class ChartsController {
    @Autowired
    private Gson gson;

    @RequestMapping(value = "/charts/google_charts_scatterchart", method = RequestMethod.GET)
    public ModelAndView edit(ModelAndView modelAndView) {
        ArrayList datas = new ArrayList();
        // ['Age', 'Weight'],[8, 12],[4, 5.5],[11, 14],[4, 5],[3, 3.5],[6.5, 7];
        datas.add(Arrays.asList("Age", "Weight")); /* .asList 는 이런 List 형식으로 만들어 준다 */
        datas.add(Arrays.asList(8, 12));
        datas.add(Arrays.asList(4, 5.5));
        datas.add(Arrays.asList(11, 14));
        datas.add(Arrays.asList(4, 5));
        datas.add(Arrays.asList(3, 3.5));
        datas.add(Arrays.asList(6.5, 7));
        /* ArrayList를 java script에서 사용하기 위해 JSON으로 바꿔준다. */
        modelAndView.addObject("dataArray", gson.toJson(datas));

        modelAndView.setViewName("/charts/google_charts_scatterchart");
        return modelAndView;
    }
}
