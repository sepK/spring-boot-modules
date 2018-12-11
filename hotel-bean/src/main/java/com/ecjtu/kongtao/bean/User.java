package com.ecjtu.kongtao.bean;

import org.hibernate.validator.constraints.Range;

/**
 * @author t.k
 * @date 2018/12/11 10:57
 */
public class User {
    @Range()
    private int userId;

    private String name;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
