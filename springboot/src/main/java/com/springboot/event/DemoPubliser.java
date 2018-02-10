package com.springboot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Package:com.springboot.event
 * @ClassName:DemoPubliser
 * @Description:事件发布类
 * @Author Shuyu.Wang
 * @Date 2018-01-26 14:07
 **/
@Component
public class DemoPubliser {
    @Autowired
    private ApplicationContext applicationContext;
    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
