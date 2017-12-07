package com.springboot.utils;

import com.springboot.common.bean.Redis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Package:com.springboot.utils
 * @ClassName:ReadProperties
 * @Description:读取自定义配置文件
 * @Author Shuyu.Wang
 * @Date 2017-12-07 12:18
 **/
@EnableConfigurationProperties({Redis.class})
@Component
public class ReadProperties {
    @Autowired
    private Redis redis;

    public void read(){
        System.out.println(redis.getIp());
    }

}
