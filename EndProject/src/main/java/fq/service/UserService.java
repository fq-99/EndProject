package fq.service;

import fq.vo.User;

public interface UserService {
    // 修改用户信息
    int updateUser(User user);

    User login(User user);
}
