package edu.nf.controller;

import edu.nf.service.UserService;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void userController(){
        userService.userService();
    }
}
