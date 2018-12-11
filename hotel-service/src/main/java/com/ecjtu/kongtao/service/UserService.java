package com.ecjtu.kongtao.service;

import com.ecjtu.kongtao.bean.User;
import org.springframework.stereotype.Service;

/**
 * @author t.k
 * @date 2018/12/11 11:35
 */
@Service
public class UserService extends BaseService{

    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
