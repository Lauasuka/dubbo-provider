package io.amoe.service.impl;

import io.amoe.faced.IUserService;
import io.amoe.pojo.User;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * @author Mr.Amoe
 * @project dubbo-provider
 * @date 2019/4/2 11:32
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public List<User> listUser() {
        return null;
    }

    @Override
    public List<User> queryUserByName(String name) {
        return null;
    }

    @Override
    public List<User> queryUserByPhone(String phone) {
        return null;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }
}
