package fq.controller;

import fq.service.UserService;
import fq.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // 修改用户信息系
    @RequestMapping("/updateUser")
    @ResponseBody
    public int updateUser(User user){
        int flag = userService.updateUser(user);
        return flag;
    }

    // 用户登录
    @RequestMapping("/login")
    @ResponseBody
    public User login(User user){
        User queryUser = userService.login(user);
        return queryUser;
    }



}
