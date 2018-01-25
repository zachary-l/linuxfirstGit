package edu.nf.controller;

import edu.nf.service.UserService;
import edu.nf.service.impl.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//在控制层可以用controller注解来替代component，表示这是一个受容器管理的web控制器
@Controller("userController")
@Scope("singleton")
public class UserController {
    /**
     * 注入service
     * 当实现类不只有一个的时候，就不能单独使用Autowired注解了
     * 因此，外卖需要结合另外一个注解一起使用，目的是告诉spring
     * 容器，注入指定的实现类对象。
     * 配合Qualifier使用，指定bean在容器中的id标识
     * @param userDao
     *//*
    @Autowired
    @Qualifier("userService1")
    private UserService userService;*/
    /**
     * @Resource 注解只可以声明在字段和set方法上
     * spring同样支持JSR250的标准
     * 使用Resource注解注入
     * 当有多个实现类的时候，可以使用nname属性或者type属性来指定要注入的Bean实例
     * name属性的值指定为容器中bean的id
     */
    @Resource(name="userService2")
//    @Resource(type = UserService2.class)
//    @Resource //只有一个实现类的时候，可以不指定任何的属性
    private UserService userService;

    public void userController() {
        System.out.println("userController");
        userService.userService();
    }
    @PostConstruct
    public void init(){
        System.out.println("userController被初始化");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("userController准备被销毁");
    }
}
