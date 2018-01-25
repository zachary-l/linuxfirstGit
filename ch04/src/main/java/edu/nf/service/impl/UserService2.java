package edu.nf.service.impl;

import edu.nf.dao.UserDao;
import edu.nf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("userService2")
@Scope("singleton")
public class UserService2 implements UserService {
//    @Autowired
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void userService() {
        System.out.println("service2");
        userDao.save();
    }
}
