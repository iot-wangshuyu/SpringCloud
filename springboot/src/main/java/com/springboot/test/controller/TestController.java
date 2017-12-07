package com.springboot.test.controller;

import com.springboot.common.bean.Redis;
import com.springboot.test.mapper.UserMapper;
import com.springboot.utils.ReadProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * @Package:com.springboot.test.controller
 * @ClassName:test
 * @Description:测试web
 * @Author Shuyu.Wang
 * @Date 2017-12-07 10:05
 **/
@RestController
public class TestController {

    Logger logeer = Logger.getLogger(TestController.class);

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return  "hello Spring boot";
    }


    @Autowired
    private ReadProperties readProperties;

    @RequestMapping(value = "/read",method = RequestMethod.GET)
    public String read(){
        readProperties.read();
        logeer.info("over");
        return  "over";
    }
     @Autowired
     private UserMapper userMapper;

    @RequestMapping(value = "/db",method = RequestMethod.GET)
    public List<Map<String,Object>> db(){
        return  userMapper.listUsers();
    }

}
