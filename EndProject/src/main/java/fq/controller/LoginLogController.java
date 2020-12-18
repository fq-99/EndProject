package fq.controller;

import fq.service.LoginLogService;
import fq.vo.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class LoginLogController {

    @Autowired
    private LoginLogService loginLogService;

    // 查询所有登录记录
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<LoginLog> queryAll(){
        List<LoginLog> loginLogs = loginLogService.queryAll();
        return loginLogs;
    }



}
