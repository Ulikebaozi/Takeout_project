package com.heng.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heng.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}