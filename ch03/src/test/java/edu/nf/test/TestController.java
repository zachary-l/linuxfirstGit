package edu.nf.test;

import edu.nf.controller.UserController;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {
    //半注解
    @Test
    public void ControllerTest(){
        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        UserController controller = factory.getBean("userController",UserController.class);
        controller.userController();

    }
}
