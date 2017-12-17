package com.itheima.action;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * 用户信息的操作模块
 *
 * @author TJR
 * @version 1.0, 2017-12-17 18:44
 */
@ParentPackage("struts-default")
@Namespace("/")
@Controller
@Scope("prototype")
@SuppressWarnings("all")
public class UserAction extends ActionSupport implements ModelDriven<User> {

    /**
     * 注入用户信息属性
     */
    private User user = new User();

    public User getModel() {
        return user;
    }

    /**
     * 注入UserService
     */
    @Autowired
    private UserService userService;

    /**
     * 添加用户信息
     *
     * @return
     */
    @Action(value = "userAction_addUser", results = {@Result(name = "seccess", location = "/success.jsp", type = "redirect")})
    public String adduser() {

        userService.addUser(user);

        return SUCCESS;
    }

    @Action(value = "userAction_deleteUser", results = {@Result(name = "success", location = "/success.jsp", type = "redirect")})
    public String deleteUser() {

        userService.deleteUser(user);

        return SUCCESS;
    }

}
