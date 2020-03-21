package com.jay.boot.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {


    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}
