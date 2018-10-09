package com.boot.service;

import java.util.Map;

/**
 * @Package:com.boot.service
 * @ClassName:UserService
 * @Description:用户服务层接口
 * @Author Shuyu.Wang
 * @Date 2017-12-06 16:30
 **/
public interface UserService {
    Map<String,Object> user();

    Integer insertUser();
}
