package com.ray.server;

import com.ray.domain.User;
import org.springframework.stereotype.Service;

/**
 * 用户服务接口实现类
 * @author Ray
 * @createTime 2018-03-17 0:16
 */
@Service("userServer")
public class UserServerImpl implements IUserServer {
    @Override
    public User getById(long id) {
        User user =new User();
        user.setId(id);
        user.setName("admin");
        return user;
    }
}
