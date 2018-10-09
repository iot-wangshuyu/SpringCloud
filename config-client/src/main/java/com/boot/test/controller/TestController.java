package com.boot.test.controller;

import org.apache.log4j.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Shuyu.Wang
 * @package:com.boot.test.controller
 * @className:
 * @description:
 * @date 2018-02-06 10:01
 **/
@RestController
public class TestController {


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

    @RequestMapping("/test1")
    public String callHome() {

        return restTemplate.getForObject("http://127.0.0.1:8083/hi1", String.class);
    }
}
