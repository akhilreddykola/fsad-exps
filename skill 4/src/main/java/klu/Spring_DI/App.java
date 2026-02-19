package klu.Spring_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       // ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
       // Employee e1 = (Employee)context.getBean("emp1");
        
       // System.out.println(e1);
        
        ApplicationContext context1 = new AnnotationConfigApplicationContext(App_Config.java);
        Employee e1 = (Employee) context1.getBean(Employee.class);
        System.out.println(e1);
        
    }
}
