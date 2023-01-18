package com.example.springboots.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboots.beans.BoardBean;
import com.example.springboots.service.DataInfors;

@Controller
@RequestMapping(value = "/board_notice")
/* 첫번째 uri부분을 자동맵핑해줌, GET과 POST모두 지원. 아예 안써주거나 둘 다 쓰거나 */
public class NoticeController {

    @RequestMapping(value = "/edit/{action_uid}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView edit(@PathVariable String action_uid, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataByUid(action_uid);

        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("board_notice/edit");
        return modelAndView;
    }

    @RequestMapping(value = { "/", "list" }, method = RequestMethod.GET)
    public ModelAndView list() {
        // 값을 insert해서 보여주는 부분, model에 hashmap<String, Object>형태로 들어간다. view는
        // board_our/list
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("firstString", "firstValue");

        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("boardList", boardList);

        modelAndView.setViewName("board_notice/list");
        /* modelAndView에 값과 주소 넣음. */
        return modelAndView;/* -->Dispatcher Servlet로 전달 */
    }

    // localhost:8080/view/U02
    // @RequestMapping(value = "/view", method = RequestMethod.GET)
    // public ModelAndView view(@RequestParam String uid, ModelAndView modelAndView)
    /* String uid가 request의 파라미터라는것을 선언, modelAndView가 파라미터화 된 것 */

    // value = "/view/{action_uid}/{}" 이렇게 여러개도 가능
    @RequestMapping(value = "/view/{action_uid}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable String action_uid /* uri에 변수라고 선언된 {}부분을 받아낸다 */,
            ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithBoardBean(/* uid */);
        modelAndView.addObject("boardBean", boardBean);
        /* 해서 여기서 new를 해주지 않아도 된다 */
        modelAndView.setViewName("board_notice/view");
        return modelAndView;/* 저장 후 게시판 목록 페이지로 이동 */
    }

    /* get방식 url은 get방식으로 들어간다. */
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form(ModelAndView modelAndView) {
        modelAndView.setViewName("board_notice/form");
        return modelAndView;
    }

    /* post방식 */
    @RequestMapping(value = "/save", method = RequestMethod.POST)

    // HashMap으로 받기
    // public ModelAndView save(@RequestParam HashMap<String, String> params,
    // ModelAndView modelAndView) {
    public ModelAndView save(BoardBean boardBean, ModelAndView modelAndView) {
        // BoardBean은 requestparam을 안 적어줘도 request인것을 안다.
        modelAndView.setViewName("board_notice/list");
        return modelAndView;/* 저장 후 게시판 목록 페이지로 이동 */
    }

}
