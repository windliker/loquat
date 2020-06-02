package com.windlike.loquat.controller;

import com.windlike.loquat.service.SmsSendService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
@RestController
public class HelloWorldController {

    private final SmsSendService smsSendService;

    public HelloWorldController(SmsSendService smsSendService) {
        this.smsSendService = smsSendService;
    }

    @RequestMapping("/hello")
    public String index() {
        smsSendService.send("18220200505", "hello double five");
        return "Hello World";
    }
}