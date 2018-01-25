package edu.demo.impl;

public class HelloImpl implements Hello {

    @Override
    public void say() {
        System.out.println("Hello say");
    }

    public void init() {
        System.out.println("初始化方法");
    }

    public void destroy() {
        System.out.println("准备销毁hello ");
    }
}
