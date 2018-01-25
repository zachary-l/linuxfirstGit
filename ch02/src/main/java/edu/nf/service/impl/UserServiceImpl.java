package edu.nf.service.impl;

import edu.nf.dao.UserDao;
import edu.nf.dao.impl.UserDaoImpl;
import edu.nf.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void userService() {
        userDao.save();
    }
}
