package com.java.wiki.controller;

import com.java.wiki.domain.Test;
import com.java.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private TestService testService;
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

    @GetMapping("/test/list")
    public List<Test> list(String name){
        return testService.list();
    }
}
