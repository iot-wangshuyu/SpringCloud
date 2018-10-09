package com.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang_
 * @EnableEurekaClient 表明自己是一个eurekaclient.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {
    public static void main(String[] args) {

        SpringApplication.run(ClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
       //測試开发功能如何合并
        return "hi "+name+",i am from port:" +port;
        //測試开发功能如何合并a

        //aads
        ///adfadfa
        //adfadf

//        afdasdf
    }
}
