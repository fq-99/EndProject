package fq.dao;

import fq.vo.LoginLog;

import java.util.List;

public interface LoginLogMapper {

    // 查询所有登录记录
    List<LoginLog> queryAll();
}
