package com.yueqian.epidemic.service.impl;

import com.yueqian.epidemic.bean.UserInfo;
import com.yueqian.epidemic.mapper.UserMapper;
import com.yueqian.epidemic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    /**
     * 根据用户名和密码进行用户登录
     * @param user
     * @return
     */
    @Override
    public UserInfo findByAccount(UserInfo user) {
        return userMapper.findByAccount(user);
    }
}
