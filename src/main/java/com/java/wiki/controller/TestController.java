package com.java.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/* RestController 返回字符串
* Controller 返回页面
* */
@RestController
public class TestController {
    /*自动读取自定义的配置项
    * test.hello:TEST 这个是默认的配置值
    * */
    @Value("${test.hello:TEST}")
    private String testHello;
    /*RequestMapping支持下面的所有请求 ， restful分格
    * get ,post , put , delete
    * @ return
    *
    */
    @RequestMapping("/hello")
    public String hello(){
        return "hello world," + testHello;
    }

    @PostMapping ("/hello/post")
    public String helloPost(String name){
        return "hello world POST, " + name;
    }
}
