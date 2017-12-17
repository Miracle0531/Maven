package com.itheima.dao;

import com.itheima.domain.User;

/**
 * 用户操作模块的逻辑接口
 *
 * @author TJR
 * @version 1.0, 2017-12-17 18:55
 */
public interface UserDao {
    /**
     * 添加用户信息
     *
     * @param user
     */
    void addUser(User user);

    /**
     * 删除用户信息(修改状态)
     *
     * @param user
     */
    void deleteUser(User user);
}
