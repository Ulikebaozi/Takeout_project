package com.heng.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heng.reggie.dto.SetmealDto;
import com.heng.reggie.entity.SetmealDish;
import com.heng.reggie.mapper.SetmealDishMapper;
import com.heng.reggie.mapper.SetmealMapper;
import com.heng.reggie.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {



}
