package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * 用户操作模块的逻辑实现类
 *
 * @author TJR
 * @version 1.0, 2017-12-17 18:55
 */
@Repository
@SuppressWarnings("all")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    /**
     * 注入SessionFactory属性
     *
     * @param sessionFactory
     */
    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    /**
     * 添加用户信息
     *
     * @param user
     */
    public void addUser(User user) {

        this.getHibernateTemplate().save(user);

    }

    /**
     * 删除用户(修改状态)
     *
     * @param user
     */
    public void deleteUser(User user) {

        // 获取要修改的用户ID
        Integer id = user.getId();

        Session session = this.getHibernateTemplate().getSessionFactory().getCurrentSession();

        // 根据ID获取用户信息
        User user1 = session.get(User.class, id);

        // 修改用户信息
        user.setFlag(1);

        // 重新保存修改后的数据
        session.save(user);


    }
}
