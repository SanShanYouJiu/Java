package com.Test.Dao.mybatis;

import com.Test.entity.County;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by han on 2016/12/20.
 */
public interface CountyMapper extends Mapper<County> {


   County selectById(int id);

}
