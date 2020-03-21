package com.jay.boot.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    //http://IP:port 번호만 치면 hello.jsp페이지로 이동
    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}
