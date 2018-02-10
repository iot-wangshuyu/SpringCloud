package com.springboot.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Package:com.springboot.event
 * @ClassName:event
 * @Description:事件
 * @Author Shuyu.Wang
 * @Date 2018-01-26 13:53
 **/

public class DemoEvent extends ApplicationEvent {
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
