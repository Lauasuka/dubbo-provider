package io.amoe.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.amoe.dao.IUserMapper;
import io.amoe.faced.IUserService;
import io.amoe.pojo.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * @author Mr.Amoe
 * @project dubbo-provider
 * @date 2019/4/2 11:32
 */
@Service
public class UserServiceImpl implements IUserService {
    private final IUserMapper userMapper;

    @Autowired
    public UserServiceImpl(IUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> listUser() {
        return userMapper.selectList(null);
    }

    @Override
    public List<User> queryUserByName(String name) {
        Optional.ofNullable(name).orElseThrow(() -> new RuntimeException("Condition user name must not be null"));
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("name", name);
        return userMapper.selectList(wrapper);
    }

    @Override
    public List<User> queryUserByPhone(String phone) {
        Optional.ofNullable(phone).orElseThrow(() -> new RuntimeException("Condition user phone must not be null"));
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("phone", phone);
        return userMapper.selectList(wrapper);
    }

    @Override
    public User queryUserById(Long id) {
        Optional.ofNullable(id).orElseThrow(() -> new RuntimeException("Condition user id must not be null"));
        return userMapper.selectById(id);
    }

    @Override
    public int updateUser(User user) {
        Optional.ofNullable(user).orElseThrow(() -> new RuntimeException("Condition user must not be null"));
        Optional.ofNullable(user.getId()).orElseThrow(() -> new RuntimeException("Condition user id must not be null"));
        return userMapper.updateById(user);
    }
}
