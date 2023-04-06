package com.heng.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heng.reggie.common.CustomException;
import com.heng.reggie.entity.Category;
import com.heng.reggie.entity.Dish;
import com.heng.reggie.entity.Setmeal;
import com.heng.reggie.mapper.CategoryMapper;
import com.heng.reggie.service.CategoryService;
import com.heng.reggie.service.DishService;
import com.heng.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();

        dishLambdaQueryWrapper.eq(Dish::getCategoryId, id);

        int cnt1 = dishService.count(dishLambdaQueryWrapper);

        if (cnt1 > 0) {
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }

        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();

        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, id);

        int cnt2 = setmealService.count(setmealLambdaQueryWrapper);

        if (cnt2 > 0) {
            throw new CustomException("当前分类下关联了套餐，不能删除");

        }

        super.removeById(id);

    }
}
