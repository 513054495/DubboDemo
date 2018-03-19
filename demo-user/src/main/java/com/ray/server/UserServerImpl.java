package com.ray.server;

import com.ray.domain.User;
import com.sun.org.apache.xalan.internal.xsltc.compiler.SourceLoader;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 用户服务接口实现类
 * @author Ray
 * @createTime 2018-03-17 0:16
 */
@Service("userServer")
public class UserServerImpl implements IUserServer {
    @Override
    public User getById(long id) {
        //加载SPI实现的接口列表
        ServiceLoader<ISayHelloWorldServer> sayHelloWorldServers= ServiceLoader.load(ISayHelloWorldServer.class);
        Iterator<ISayHelloWorldServer> iterator=sayHelloWorldServers.iterator();
        while(null!=iterator&&iterator.hasNext()){
            ISayHelloWorldServer iSayHelloWorldServer=iterator.next();
            if(iSayHelloWorldServer.getClass().getName().equals("com.ray.server.impl.SayHelloWorldServerImplByEn")) {
                iSayHelloWorldServer.say();
            }
        }
        User user =new User();
        user.setId(id);
        user.setName("admin");
        return user;
    }
}
