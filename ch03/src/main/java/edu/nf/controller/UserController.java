package edu.nf.controller;

import edu.nf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component("userController")
@Scope("prototype")
public class UserController {
    @Autowired
    private UserService userService;
    public void userController(){
        userService.userService();
    }
}
