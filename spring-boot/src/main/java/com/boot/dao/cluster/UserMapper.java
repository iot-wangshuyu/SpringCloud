package com.boot.dao.cluster;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Package:com.boot.dao.cluster
 * @ClassName:UserMapper
 * @Description:User数据操作
 * @Author Shuyu.Wang
 * @Date 2017-12-06 16:28
 **/
@Mapper
public interface UserMapper {
    List<Map<String,Object>> listUsers();
}
