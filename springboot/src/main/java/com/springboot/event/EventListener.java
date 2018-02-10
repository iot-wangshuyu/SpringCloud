package com.springboot.event;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Package:com.springboot.event
 * @ClassName:EventListener
 * @Description:事件监听器
 * @Author Shuyu.Wang
 * @Date 2018-01-26 14:01
 **/
@Component
class EventListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg=demoEvent.getMsg();
        System.out.println("我接收到了消息："+msg);
    }
}
