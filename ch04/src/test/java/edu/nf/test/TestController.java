package edu.nf.test;

import edu.nf.controller.UserController;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {
    @Test
    public void ControllerTest() {
        //创建基于注解的上下文工厂
        ApplicationContext context = new AnnotationConfigApplicationContext("edu.nf");
        UserController controller = context.getBean("userController", UserController.class);
        controller.userController();
        ((AnnotationConfigApplicationContext)context).close();
    }
}
