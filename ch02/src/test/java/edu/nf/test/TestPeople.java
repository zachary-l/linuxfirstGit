package edu.nf.test;

import edu.nf.People;
import edu.nf.controller.UserController;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPeople {
    @Test
    public void sayTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("p",People.class);
        people.say();
    }
    @Test
    public void userControllerTest(){
        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        UserController controller = factory.getBean("userController",UserController.class);
        controller.userController();
    }
}
