package com.heng.reggie.dto;

import com.heng.reggie.entity.Setmeal;
import com.heng.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
