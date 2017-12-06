package com.boot.controller;

import com.boot.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Package:com.boot.controller
 * @ClassName:test
 * @Description:测试
 * @Author Shuyu.Wang
 * @Date 2017-12-06 17:25
 **/
@RestController
public class Test {

    private Logger logger = Logger.getLogger(Test.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test")
    public Map<String,Object> user(){
        Map<String, Object> user = userService.user();
        logger.info("返回结果："+user);
        logger.debug(user);
        return  user;

    }
}
