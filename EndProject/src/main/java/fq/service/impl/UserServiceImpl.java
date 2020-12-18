package fq.service.impl;

import fq.dao.UserMapper;
import fq.service.UserService;
import fq.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    // 修改用户信息
    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
