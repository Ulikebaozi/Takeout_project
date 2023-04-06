package com.heng.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heng.reggie.entity.DishFlavor;
import com.heng.reggie.mapper.DishFlavorMapper;
import com.heng.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;


@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
