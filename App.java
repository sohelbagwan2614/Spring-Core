package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("hii");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        student student=(student) context.getBean("student");
        System.out.println(student);
        
        student student1=(com.springcore1.student) context.getBean("student1");
        System.out.println(student1);
        
        student student4=(com.springcore1.student) context.getBean("student3");
        System.out.println(student4);
    }
}
