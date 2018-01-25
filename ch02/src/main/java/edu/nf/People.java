package edu.nf;

public class People {
    private String name;
    private int age;
    private Tools tools;
    public People(String name,int age){
        this.name = name;
        this.age = age;
    }
    public People(Tools tools){
        this.tools = tools;
    }
    public People(){

    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    public void say(){
       /* System.out.println("name:"+name);
        System.out.println("age:"+age);*/
        tools.fix();
    }

}
