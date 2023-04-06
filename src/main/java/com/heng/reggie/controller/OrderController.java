package com.heng.reggie.controller;


import com.heng.reggie.common.R;
import com.heng.reggie.entity.Orders;
import com.heng.reggie.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;


    @PostMapping
    public R<String> submit(@RequestBody Orders orders){


        orderService.submit(orders);

        return R.success("下单成功");
    }
}


