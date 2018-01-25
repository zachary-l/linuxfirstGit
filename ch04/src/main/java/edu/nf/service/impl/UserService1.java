package edu.nf.service.impl;

import edu.nf.dao.UserDao;
import edu.nf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 业务层可以使用service注解来代替component，
 * 表示这是一个受容器管理的业务组件
 */
//@Component("userService")
@Service("userService1")
@Scope("singleton")
public class UserService1 implements UserService {
    private UserDao userDao;

    /**
     * set方法注入
     *
     * @param userDao
     */
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void userService() {
        System.out.println("service1");
        userDao.save();
    }
}
