package com.ray.server;

import com.ray.domain.User;

/**
 * 用户服务接口
 * @author Ray
 * @createTime 2018-03-16 23:43
 */

public interface IUserServer {
    public User getById(long id);

}
