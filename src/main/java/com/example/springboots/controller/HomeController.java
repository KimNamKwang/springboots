package com.example.springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboots.dao.HomeDao;

/*@ServletComponentScan을 걸어주는것과 같음 */
@Controller
public class HomeController {

    @Autowired
    HomeDao homeDao;

    @RequestMapping(value = { "", "/", "/main" }) /* 주소를 여러개 넣을 수 있음 */
    public String main() {
        int i = 0;
        return "main";
    }

    @RequestMapping(value = "/home") /* url과 같음.http://localhost:8080/home */
    public void home() {
        Object result = homeDao.getList();
        int i = 0;

    }

    @RequestMapping(value = "/homehtml") /* url과 같음.http://localhost:8080/homehtml */
    public String homehtml() {
        int i = 0;
        /*
         * spring이 controller를 감싸고 있기 때문에 return값은 spring으로 전달되고
         * 그 값은 spring이 다시 전달해준다. 상호간의 call은 전부 spring이 통제.
         */
        return "home.html";

    }

    @RequestMapping(value = "/homejsp") /* url과 같음.http://localhost:8080/homejsp */
    public String homejsp() {
        int i = 0;
        /*
         * spring이 controller를 감싸고 있기 때문에 return값은 spring으로 전달되고
         * 그 값은 spring이 다시 전달해준다. 상호간의 call은 전부 spring이 통제.
         */

        return "home";
        /* return에 아무것도 안쓰고 string만 넣으면 경로로 인식한다. */

    }

    @RequestMapping(value = "/jstlformats") /* url과 같음.http://localhost:8080/homejsp */
    public String jstlformats() {
        int i = 0;

        return "jstl_formats";

    }
}
