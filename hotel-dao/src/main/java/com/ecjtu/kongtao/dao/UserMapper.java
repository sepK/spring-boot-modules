package com.ecjtu.kongtao.dao;

import com.ecjtu.kongtao.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @author t.k
 * @date 2018/12/11 11:08
 */
@Repository
public interface UserMapper{

    /**
     * 通过id 查询用户
     * @param id 用户id
     * @return
     */
    User getUserById(Integer id);
}
