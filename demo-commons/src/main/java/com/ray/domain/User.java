package com.ray.domain;

import java.io.Serializable;

/**
 * 用户实体类
 * @author Ray
 * @createTime 2018-03-16 23:40
 */
public class User implements Serializable {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
