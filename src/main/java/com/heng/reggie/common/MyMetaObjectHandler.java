package com.heng.reggie.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {

    //@Autowired ioc注入可以直接实现从request中提取session
    //private HttpServletRequest request;

    //插入自动填充
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info(metaObject.toString());
        metaObject.setValue("createTime", LocalDateTime.now());
        metaObject.setValue("updateTime", LocalDateTime.now());
        //metaObject.setValue("createUser", (Long) request.getSession().getAttribute("employee"));
        //metaObject.setValue("updateUser", (Long) request.getSession().getAttribute("employee"));

        metaObject.setValue("createUser", BaseContext.getCurrentId());
        metaObject.setValue("updateUser", BaseContext.getCurrentId());


    }


    //更新自动填充
    @Override
    public void updateFill(MetaObject metaObject) {

        metaObject.setValue("updateTime", LocalDateTime.now());
        metaObject.setValue("updateUser", BaseContext.getCurrentId());

    }
}
