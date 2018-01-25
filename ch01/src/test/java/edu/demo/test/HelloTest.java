package edu.demo.test;

import edu.demo.impl.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void testSay(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = context.getBean("hello",Hello.class);
        hello.say();
        //关闭容器
        ((ClassPathXmlApplicationContext)context).close();
    }
    @Test
    public void testHello2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = context.getBean("hello2",Hello.class);
        hello.say();
    }
}
