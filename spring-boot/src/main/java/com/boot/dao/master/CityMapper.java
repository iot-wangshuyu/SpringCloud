package com.boot.dao.master;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Package:com.boot.dao
 * @ClassName:dao.master
 * @Description:主数据源测试
 * @Author Shuyu.Wang
 * @Date 2017-12-06 16:16
 **/
@Mapper
public interface CityMapper {
    List<Map<String,Object>> listCitys();

}
