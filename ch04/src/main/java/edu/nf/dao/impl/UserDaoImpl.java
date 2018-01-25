package edu.nf.dao.impl;

import edu.nf.dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 在持久层可以使用service注解来替代component，
 * 表示这是一个受容器管理的仓库（持久化）组件
 */
//@Component("userDao")
@Repository("userDao")
@Scope("singleton")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao");
        System.out.println("select * from user_info");
    }
}
