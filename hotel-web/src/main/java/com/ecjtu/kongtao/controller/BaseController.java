package com.ecjtu.kongtao.controller;

import com.ecjtu.kongtao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author t.k
 * @date 2018/12/11 11:42
 */
public class BaseController {

    @Autowired
    protected UserService userService;
}
