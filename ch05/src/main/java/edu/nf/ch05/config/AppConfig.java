package edu.nf.ch05.config;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 这是一个Java配置类
 * 它的作用域和xml配置文件是等价的
 * Java配置类必须使用@Configuration注解标识
 */
@Configuration
public class AppConfig {
    /**
     * 定义一个方法，方法名就作为Bean的容器中的标识,
     * 并且这个方法需要使用@Bean注解标识，类似于XML中的<bean></bean>
     * 这个注解也可以指定init和destroy
     */
    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope("prototype")
    public UserService userService(){
        return new UserService();
    }
    @Bean
    public UserDao userDao(){
        return new UserDao();
    }
}
