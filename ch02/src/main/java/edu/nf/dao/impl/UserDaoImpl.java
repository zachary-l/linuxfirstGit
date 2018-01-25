package edu.nf.dao.impl;

import edu.nf.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("select * from user_info");
    }
}
