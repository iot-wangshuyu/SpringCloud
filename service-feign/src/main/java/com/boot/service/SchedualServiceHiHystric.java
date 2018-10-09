package com.boot.service;

import org.springframework.stereotype.Component;

/**
 * @author shuyu.wang
 * @version V1.0
 * @ClassName: ${type_name}
 * @Description: ${todo}
 * @date ${date} ${time}
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
