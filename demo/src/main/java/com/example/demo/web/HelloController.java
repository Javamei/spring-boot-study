package com.example.demo.web;

import com.example.demo.until.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello,meikun!";
    }

    @RequestMapping("/exception")
    public String exception() throws Exception{
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
