package fq.service.impl;

import fq.dao.LoginLogMapper;
import fq.service.LoginLogService;
import fq.vo.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    private LoginLogMapper loginLogMapper;

    // 查询所有登录记录
    @Override
    public List<LoginLog> queryAll() {
        return loginLogMapper.queryAll();
    }
}
