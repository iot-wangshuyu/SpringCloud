package com.boot.service.impl;

import com.boot.dao.cluster.UserMapper;
import com.boot.dao.master.CityMapper;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Package:com.boot.service.impl
 * @ClassName:UserServiceImpl
 * @Description:用户服务层实现
 * @Author Shuyu.Wang
 * @Date 2017-12-06 16:33
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CityMapper cityMapper;

    @Override
    public Map<String, Object> user() {
        Map<String, Object> map=new HashMap<>();
        List<Map<String, Object>> maps = userMapper.listUsers();
        List<Map<String, Object>> listCitys = cityMapper.listCitys();
        map.put("user",maps);
        map.put("city",listCitys);
        return map;
    }

    @Override
    @Transactional
    public Integer insertUser() {
        cityMapper.insertUser();
        int i=1/0;
        cityMapper.insertUser();
        return null;
    }
}
