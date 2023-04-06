package com.heng.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heng.reggie.entity.AddressBook;
import com.heng.reggie.mapper.AddressBookMapper;
import com.heng.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;


@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
