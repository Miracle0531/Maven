package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户操作模块的业务实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-17 18:54
 */
@Service
@Transactional
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

    /**
     * 注入UserDao属性
     */
    @Autowired
    private UserDao userDao;

    /**
     * 删除用户(修改状态)
     *
     * @param user
     */
    public void deleteUser(User user) {

        userDao.deleteUser(user);

    }

    /**
     * 添加用户信息
     *
     * @param user
     */
    public void addUser(User user) {

        userDao.addUser(user);

    }
}
