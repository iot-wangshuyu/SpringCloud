package com.boot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Shuyu.Wang
 * @package:com.boot.test.controller
 * @className:
 * @description:
 * @date 2018-02-06 10:05
 **/
@RestController

public class TestController {



    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/test1")
    public String callHome() {

        return restTemplate.getForObject("http://127.0.0.1:8082/hi", String.class);
    }
}
