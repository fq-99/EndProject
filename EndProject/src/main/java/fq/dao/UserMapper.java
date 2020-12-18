package fq.dao;

import fq.vo.User;

public interface UserMapper {

    // 修改用户信息
    int updateUser(User user);

    // 登录
    User login(User user);
}
