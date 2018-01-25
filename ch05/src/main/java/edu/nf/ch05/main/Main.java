package edu.nf.ch05.main;

import edu.nf.ch05.config.AppConfig;
import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = (UserService) context.getBean("userService");
        UserDao dao = context.getBean("userDao",UserDao.class);
        service.userService();
        dao.userDao();
    }
}
