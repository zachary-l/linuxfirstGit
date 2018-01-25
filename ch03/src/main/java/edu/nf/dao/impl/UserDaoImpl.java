package edu.nf.dao.impl;

import edu.nf.dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("UserDao")
@Scope("singleton")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("select * from user_info");
    }
}
