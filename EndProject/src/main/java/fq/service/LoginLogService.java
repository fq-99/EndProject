package fq.service;

import fq.vo.LoginLog;

import java.util.List;

public interface LoginLogService {
    // 查询所有登录记录
    List<LoginLog> queryAll();
}
