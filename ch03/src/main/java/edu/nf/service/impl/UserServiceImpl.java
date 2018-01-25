package edu.nf.service.impl;

import edu.nf.dao.UserDao;
import edu.nf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("userService")
@Scope("singleton")
public class UserServiceImpl implements UserService {
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
        userDao.save();
    }
}
