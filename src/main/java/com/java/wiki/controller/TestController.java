package com.java.wiki.controller;

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
    public String hell0(){
        return "hello world";
    }
}
