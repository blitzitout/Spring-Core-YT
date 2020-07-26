package com.practice.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/annotations/beans.xml");
//        System.out.println("Config file loaded...");
//        beans.xml not used anymore

        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        System.out.println("Config class found...");

        College college = context.getBean("collegeObj", College.class);
        System.out.println("College object: " + college);
        college.test();

    }
}
