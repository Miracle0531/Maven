package com.itheima.service;

import com.itheima.domain.User;

/**
 * 用户操作模块的业务接口
 *
 * @author TJR
 * @version 1.0, 2017-12-17 18:54
 */
public interface UserService {
    /**
     * 删除用户信息(修改状态)
     *
     * @param user
     */
    void deleteUser(User user);

    /**
     * 添加用户信息
     *
     * @param user
     */
    void addUser(User user);
}
