package com.ecjtu.kongtao.service;

import com.ecjtu.kongtao.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author t.k
 * @date 2018/12/11 11:36
 */
public class BaseService {

    @Autowired
    protected UserMapper userMapper;
}
