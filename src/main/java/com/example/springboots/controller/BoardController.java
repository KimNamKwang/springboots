package com.example.springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboots.beans.BoardBean;
import com.example.springboots.service.DataInfors;

// @Controller
// @RequestMapping(value = "/board")
// public class BoardController {
// /* get방식 url은 get방식으로 들어간다. */
// @RequestMapping(value = "/form", method = { RequestMethod.GET,
// RequestMethod.POST })
// public ModelAndView form(ModelAndView modelAndView) {
// modelAndView.setViewName("board/form");
// return modelAndView;
// }

// // @RequestMapping(value = { "/", "list" }, method = { RequestMethod.GET,
// // RequestMethod.POST })
// // public ModelAndView list(ModelAndView modelAndView) {
// // modelAndView.setViewName("board/list");
// // return modelAndView;
// // }

// @RequestMapping(value = { "/", "list" }, method = { RequestMethod.GET,
// RequestMethod.POST })
// public ModelAndView list(/* @RequestParam String uid, */ ModelAndView
// modelAndView)
// /* String uid가 request의 파라미터라는것을 선언, modelAndView가 파라미터화 된 것 */ {
// DataInfors dataInfors = new DataInfors();
// ArrayList<BoardBean> boardList = dataInfors.getDataListForBoard();
// modelAndView.addObject("boardList", boardList);
// modelAndView.setViewName("board/list");
// return modelAndView;
// }

// @RequestMapping(value = "/edit", method = { RequestMethod.GET,
// RequestMethod.POST })
// public ModelAndView edit(@RequestParam String uid, ModelAndView modelAndView)
// {
// DataInfors dataInfors = new DataInfors();
// BoardBean boardBean = dataInfors.getDataForBoardBean(uid);
// modelAndView.addObject("boardBean", boardBean);
// modelAndView.setViewName("board/edit");
// return modelAndView;
// }

// @RequestMapping(value = "/view", method = { RequestMethod.GET,
// RequestMethod.POST })
// public ModelAndView view(@RequestParam String uid, ModelAndView modelAndView)
// {
// DataInfors dataInfors = new DataInfors();
// BoardBean boardBean = dataInfors.getDataForBoardBean(uid);
// modelAndView.addObject("boardBean", boardBean);
// modelAndView.setViewName("board/view");
// return modelAndView;
// }

// }
