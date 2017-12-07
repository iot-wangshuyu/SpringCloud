package com.springboot.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Package:com.springboot.test.mapper
 * @ClassName:UserMapper
 * @Description:user mapper类
 * @Author Shuyu.Wang
 * @Date 2017-12-07 17:27
 **/
@Mapper
public interface UserMapper {

    List<Map<String,Object>> listUsers();
}
