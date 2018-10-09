package com.boot.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shuyu.Wang
 * @package:com.boot.test.controller
 * @className:
 * @description:
 * @date 2018-02-06 11:00
 **/
@RestController
@RefreshScope
public class TestController2 {

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
