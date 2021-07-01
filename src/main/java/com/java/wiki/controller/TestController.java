package com.java.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/* RestController 返回字符串
* Controller 返回页面
* */
@RestController
public class TestController {

    /*RequestMapping支持下面的所有请求 ， restful分格
    * get ,post , put , delete
    * @ return
    *
    */
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping ("/hello/post")
    public String helloPost(String name){
        return "hello world POST, " + name;
    }
}
